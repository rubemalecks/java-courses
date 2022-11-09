package classes;

public class Conta {
    private int agencia;
    private int conta;
    private double saldo;
    private String titular;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Construtor
    public Conta(String titular, int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
    }

    // Métodos
    public void depositar(double valor) {
        setSaldo(this.saldo += valor);
    }

    public void saque(double valor) {
        if (this.saldo >= valor) {
            setSaldo(saldo - valor);
            System.out.println("Transação Efetuada!!");
        }else{
        System.out.println("Saldo indisponível.\tTransação Cancelada");}  
    }

}
