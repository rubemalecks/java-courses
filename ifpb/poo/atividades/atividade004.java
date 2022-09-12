import java.util.Scanner;

public class atividade004 {
    public static void main(String[] args) {
        double base, altura;

        Scanner sc = new Scanner(System.in);
        System.out.print("Base = ");
        base = sc.nextDouble();
        System.out.print("Altura = ");
        altura = sc.nextDouble();
        System.out.println("Area => " + (base * altura) / 2);
    }

}
