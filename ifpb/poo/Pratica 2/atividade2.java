import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = sc.nextDouble();

        System.out.print("Lado B: ");
        double b = sc.nextDouble();

        System.out.print("LAdo C: ");
        double c = sc.nextDouble();

        double hip = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);

        System.out.print("A hipotenusa é: " + hip);

    }

}
