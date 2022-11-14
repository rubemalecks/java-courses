public class Conta {
    private double saldo;
    private double agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor; // "this." não é obrigatórios neste momento.
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}
