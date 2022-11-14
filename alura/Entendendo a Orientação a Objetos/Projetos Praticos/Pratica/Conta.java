public class Conta {

    // atributos da conta / caracteristicas / variaveis
    int agencia;
    int conta;
    double saldo;
    String titular;

    // metodos da conta

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

    boolean tranfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
            } else {
        return false;
            }
        }
    }

    
