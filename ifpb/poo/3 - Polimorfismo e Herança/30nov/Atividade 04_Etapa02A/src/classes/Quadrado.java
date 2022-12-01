package classes;

public class Quadrado extends Poligono {
    protected double base;
    protected double altura;

    public Quadrado(double base, double altura) {
        super(base, altura);
    }



    public double CalculaArea(){ 
        return super.base * super.altura;
    }
}
