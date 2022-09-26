public class TestaMetodos {
    public static void main(String[] args) {
        Conta contaDoPaulConta = new Conta();
        contaDoPaulConta.saldo = 100;
        contaDoPaulConta.deposita(50);
        System.out.println("Conta doPaulConta: R$ " + contaDoPaulConta.saldo);
        
    }
    
}
