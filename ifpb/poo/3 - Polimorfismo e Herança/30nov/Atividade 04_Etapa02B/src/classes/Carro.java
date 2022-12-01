package classes;

public class Carro {
    protected String modelo;
    protected String placa;
    protected float preco;
    protected boolean temBlindagem;
    protected boolean temAlarme;
    protected boolean temVidroEletrico;
    private int acres;

    public int acrescimos() {
        if (this.temAlarme) {
            acres++;
        }
        if (this.temBlindagem) {
            acres++;
        }

        if (this.temVidroEletrico) {
            acres++;
        }
        return this.acres; // qtd acréscimos
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isTemBlindagem() {
        return this.temBlindagem;
    }

    public void setTemBlindagem(boolean temBlindagem) {
        this.temBlindagem = temBlindagem;
    }

    public boolean isTemAlarme() {
        return temAlarme;
    }

    public void setTemAlarme(boolean temAlarme) {
        this.temAlarme = temAlarme;
    }

    public boolean isTemVidroEletrico() {
        return temVidroEletrico;
    }

    public void setTemVidroEletrico(boolean temVidroEletrico) {
        this.temVidroEletrico = temVidroEletrico;
    }

}