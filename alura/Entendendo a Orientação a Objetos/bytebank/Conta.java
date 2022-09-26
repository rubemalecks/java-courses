public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor; //"this." não é obrigatorios neste momento.
    }
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }  else { 
            return false;
        }

    }    

}
