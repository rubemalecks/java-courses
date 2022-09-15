import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double p = 2*(base + altura);
        System.out.println("O perimetro é: "+ p);
        
        double a = base * altura;
        System.out.println("A area é: "+ a);

    }
}
