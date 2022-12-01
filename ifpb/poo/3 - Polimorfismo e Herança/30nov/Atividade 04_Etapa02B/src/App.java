import classes.CarroLuxo;
import classes.CarroPopular;

public class App {
    public static void main(String[] args) throws Exception {
        CarroPopular carro = new CarroPopular();
        carro.setModelo("GOL");
        carro.setPlaca("RLR9942");
        carro.setPreco(40000);
        carro.setTemAlarme(true);
        carro.setTemBlindagem(false);
        carro.setTemVidroEletrico(false);
        System.out.printf("O Carro de Placa: %s\nModelo: %s\nPreço Final: R$ %.2f\n", carro.getPlaca(),
                carro.getModelo(), carro.getPreco());

        System.out.println("===========================");
        CarroLuxo carro2 = new CarroLuxo();
        carro2.setModelo("BMW");
        carro2.setPlaca("RUB4242");
        carro2.setPreco(40000);
        carro2.setTemAlarme(true);
        carro2.setTemBlindagem(false);
        carro2.setTemVidroEletrico(false);
        System.out.printf("O carro de placa: %s\nModelo: %s\nPreço Final: R$ %.2f\n", carro2.getPlaca(),
                carro2.getModelo(), carro2.getPreco());

    }
}
