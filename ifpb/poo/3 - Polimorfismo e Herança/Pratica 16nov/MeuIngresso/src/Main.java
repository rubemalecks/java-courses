public class Main {
    public static void main(String[] args) throws Exception {
        Ingresso ingressobase = new Ingresso();
        ingressobase.setValor(100);

        IngressoVip ingressoVip = new IngressoVip();
        ingressoVip.setValor(100);
        System.out.println("=========================================");
        System.out.println("\t\t\t BILHETERIA");
        System.out.println("=========================================");

        System.out.println("Ingresso 1");
        System.out.println(ingressobase.toString());

        System.out.println("\nIngresso 2");
        System.out.println(ingressoVip.toString());
        System.out.println("Ao todo foram vendidos " + Ingresso.getContador_ingressos() + "ingressos.");

    }
}
