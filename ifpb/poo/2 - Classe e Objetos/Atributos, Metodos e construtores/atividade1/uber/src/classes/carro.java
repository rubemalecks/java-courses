package classes;

public class carro {
    private String modelo;
    private String categoria;
    private String cor;
    private int ano;
    private double preco;
    private double quilometragem;

    public carro(String nome_modelo, String cor, int ano, double preco, double quilometragem) {
        this.modelo = nome_modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.quilometragem = quilometragem;
    }

    public carro() {

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if (this.preco < 50000) {
            this.categoria = "POPULAR";
        } else {
            this.categoria = "SUV";
        }
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    // Métodos

    public String podeUber() {
        if (this.getAno() < 15) {
            return "Pode ser Uber!";
        }
        return "Não pode ser Uber!";
    }

    public String revSuv() {
        if (this.quilometragem >= 30000) {
            return "Precisa de Revisão!";
        }
        return "Por enquanto não precisa de revisão!";

    }

}
