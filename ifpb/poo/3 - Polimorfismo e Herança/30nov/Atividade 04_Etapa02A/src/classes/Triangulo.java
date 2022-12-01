package classes;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    protected double base;
    protected double altura;

    @Override
    public double CalculaArea(){ 
        return super.base * super.altura /2 ;
    }
}
