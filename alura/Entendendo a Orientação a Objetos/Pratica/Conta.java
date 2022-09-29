public class Conta {
    int agencia;
    int conta;
    double saldo;
    String titular;

    void deposita (double valor){
        this.saldo += valor;
    }

    boolean saque (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } 
        return false;
    }

    public boolean tranfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
            } else {
        return false;
            }
        }
    }

    
