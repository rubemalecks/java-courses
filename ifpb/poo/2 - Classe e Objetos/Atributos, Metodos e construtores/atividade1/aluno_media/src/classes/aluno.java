package classes;

public class aluno {
    // atributos da classe
    private String nome;
    private double prova1;
    private double prova2;
    private double atividade1;
    private double atividade2;
    private double media;

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getAtividade1() {
        return atividade1;
    }

    public void setAtividade1(double atividade1) {
        this.atividade1 = atividade1;
    }

    public double getAtividade2() {
        return atividade2;
    }

    public void setAtividade2(double atividade2) {
        this.atividade2 = atividade2;
    }

    public double getMedia() {
        media = (atividade1 + atividade2 +
                prova1 + prova2) / 4;
        return media;
    }

    public void setMedia(double media) {
        this.media = (media);
    }

    // Constructor

    public aluno(String nome) {
        this.nome = nome;
    }

    // Metodos

    public boolean aprov(double media){
        if (this.getMedia() >= 5){
            return true;
        } else{
            return false;
        }
    }

}
