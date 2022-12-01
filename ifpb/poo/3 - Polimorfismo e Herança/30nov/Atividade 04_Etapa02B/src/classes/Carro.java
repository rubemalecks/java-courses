package classes;

public class Carro {
    private String modelo;
    private String placa;
    private float preco;
    private boolean temBlindagem;
    private boolean temAlarme;
    private boolean temVidroEletrico;

    public int acrescimos() {
        int acres = 0;
        if (this.temAlarme) {
            acres++;
        }
        if (this.temBlindagem) {
            acres++;
        }

        if (this.temVidroEletrico) {
            acres++;
        }

        return acres;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPreco() {
        return preco + ((this.acrescimos() * 3 / preco) * 100);
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isTemBlindagem() {
        return temBlindagem;
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