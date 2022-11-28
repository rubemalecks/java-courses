package classes;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totAlunos = 0;
    private boolean posExite;

    public void add(Aluno estudante) {
        capacidade();
        this.alunos[totAlunos] = estudante;
        totAlunos++;
    }

    public void addP(int pos, Aluno estudante) {
        capacidade();
        if (pos>= 0 && pos <= this.totAlunos){
            for (int i = totAlunos-1; i >= pos; i--) {
                alunos[i+1] = alunos[i];
            }
            alunos[pos] = estudante;
            totAlunos ++;
        } else {
            throw new IllegalArgumentException("posição inválida");
        }   
    }

    private void capacidade(){
        if (totAlunos == alunos.length){
            Aluno [] newAlunos = new Aluno[alunos.length*2];
            for (int i = 0; i < alunos.length; i++) {
                newAlunos[i] = alunos[i];
            }
        this.alunos = newAlunos;
        }

    }


    public boolean posExite(int pos){
        if (pos>= 0 && pos < this.totAlunos){
            return true;
        }
        throw new IllegalArgumentException("posição inválida");
    }

    public Aluno pega(int pos) {
        if (posExite){
            return alunos[pos];
        } throw new IllegalArgumentException("posição inválida");
    }

    public void remover(int pos) {
        for (int i = pos; i < this.totAlunos; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totAlunos --;
    }

    public boolean contem(Aluno estudante) {
        for (int i = 0; i < totAlunos; i++) {
            if (estudante.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totAlunos;
    }

    public String toString() {
        int virgulas = 0;
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                sb.append(aluno.getNome());
                virgulas++;
                if (virgulas < (this.tamanho())) {
                    sb.append(", ");
                }
            }
        }
        return "[" + sb + "]";
    }

}