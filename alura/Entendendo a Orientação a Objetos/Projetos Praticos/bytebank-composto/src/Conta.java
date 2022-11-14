public class Conta {
    double saldo;
    double agencia;
    int numero;
    Cliente titular;

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
