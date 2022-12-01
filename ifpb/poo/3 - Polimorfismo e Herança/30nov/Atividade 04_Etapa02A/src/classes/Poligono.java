package classes;

public class Poligono {
    protected double base;
    protected double altura;

    

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double CalculaArea(){ // não é assim só exemplo da area
        return this.base * this.altura;
    }
    
}
