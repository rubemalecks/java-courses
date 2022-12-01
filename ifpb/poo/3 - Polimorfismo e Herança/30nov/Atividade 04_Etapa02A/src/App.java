import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Poligono pol = new Poligono(10, 10);
        Poligono tri = new Triangulo(13, 7);
        Poligono quad = new Quadrado(7, 7);

        System.out.println("Area do Poligono: " + pol.CalculaArea());
        System.out.println("Area do Triangulo: " + tri.CalculaArea());
        System.out.println("Area do Quadrado: " + quad.CalculaArea());

    }
}
