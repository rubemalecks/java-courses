
import classes.carro;
public class App {
    public static void main(String[] args) throws Exception {
    carro veiculo = new carro("Fusca","Azul", 2000, 50000, 60000 ); 
    System.out.println("Ficha do Carro ");

    System.out.println("Modelo: " + veiculo.getModelo());
    veiculo.setCategoria();
    System.out.println("Categoria: " + veiculo.getCategoria());
    System.out.println("Ano: " + veiculo.getAno());
    System.out.printf("Preço: R$ %.2f \n", veiculo.getPreco());
    System.out.println(veiculo.podeUber());
    
    if (veiculo.getCategoria().equals("SUV")){
        System.out.println(veiculo.revSuv());
        }

    } 

}
