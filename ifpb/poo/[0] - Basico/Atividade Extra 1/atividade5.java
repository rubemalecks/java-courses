import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o valor de A: ");
      double valorA = scanner.nextDouble();

      System.out.print("Digite o valor de B: ");
      double valorB = scanner.nextDouble();

      System.out.print("Digite o valor de C[hipotenusa]: ");
      double valorC = scanner.nextDouble();

      double seno = valorA / valorC;
      double cosseno = valorB / valorC;

      System.out.println(seno);
      System.out.println(cosseno);
    }

}
