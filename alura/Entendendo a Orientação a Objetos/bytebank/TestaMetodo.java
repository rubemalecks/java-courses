public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println("Conta do Paulo Conta: R$ " + contaDoPaulo.saldo);

        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);

    }

}
