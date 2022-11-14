public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // as 2x vão referenciar para uma MESMA "Conta"

        segundaConta.saldo += 100;
        System.out.println("Segunda Conta: " + segundaConta.saldo);
        System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
        // Sendo assim se houver uma mudança ela irá afetar ambas as referencias.
    }
}