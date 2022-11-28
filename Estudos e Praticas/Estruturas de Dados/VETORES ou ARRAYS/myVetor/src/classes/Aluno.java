package classes;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno exAluno = (Aluno) obj;
        return exAluno.getNome().equals(this.nome);   
    }

    @Override
    public String toString() {
        return this.getNome();
    }

}


