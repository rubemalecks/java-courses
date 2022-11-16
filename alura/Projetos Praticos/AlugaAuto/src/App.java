public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();
        Veiculo moto1 = new Veiculo();
        Carro moto2 = new Carro();

        System.out.println(carro1.getVlr());
        System.out.println(moto1.getVlr());
        System.out.println(Veiculo.getQtd_disp());
    }
}
