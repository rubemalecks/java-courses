package classes;

public class CarroPopular extends Carro {

    @Override
    public float getPreco() {
        return this.preco + (this.preco * (this.acrescimos()*3)/100); // acréscimo *3%
    }
}
