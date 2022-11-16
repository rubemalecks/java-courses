public class teste {
    public static void main(String[] args) {
        Conta cn = new Conta(123, 456);
        ContaCorrente cc = new ContaCorrente(111, 111);
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cn.deposita(100);
        cc.deposita(100);
        cp.deposita(100);

        cc.saca(10);

        System.out.println(cc.getSaldo());



    }

}
