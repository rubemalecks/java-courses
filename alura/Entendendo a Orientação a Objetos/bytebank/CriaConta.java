public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // primeiraConta é um instancia de referencia criada a partir de "Conta". primeiraConta é um objeto do tipo conta.
        
        primeiraConta.saldo = 200+100; // saldo é um atributo da primeiraConta. (que foi herdado de conta)

        System.out.println("Saldo da Primeira Conta: R$ " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Saldo da Segunda Conta: R$ " + segundaConta.saldo);
        
        System.out.println(primeiraConta.agencia);
    }

}
