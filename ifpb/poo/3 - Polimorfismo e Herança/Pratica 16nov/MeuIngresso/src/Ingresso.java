public class Ingresso {
    private static int contador_ingressos;
    private double valor;

    public Ingresso() {
        contador_ingressos++;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static int getContador_ingressos() {
        return contador_ingressos;
    }

    public String toString() {
        return "O Valor final do seu ingresso é R$ " + getValor();
    }

}