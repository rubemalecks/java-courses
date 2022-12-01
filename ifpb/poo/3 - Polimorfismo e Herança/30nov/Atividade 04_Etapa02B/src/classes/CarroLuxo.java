package classes;

public class CarroLuxo extends Carro{

    @Override
    public float getPreco() {
        return this.preco + (this.preco * (this.acrescimos()*10)/100); // acréscimo *10%
    }
}