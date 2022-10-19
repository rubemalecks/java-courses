import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float B, b, h;
        System.out.print("Base Maior: ");
        B = scanner.nextFloat();
        System.out.print("Base Menor: ");
        b = scanner.nextFloat();
        System.out.print("Altura: ");
        h = scanner.nextFloat();
        float a = ((B + b) * h) / 2;
        System.out.printf("A area é %.2f", a);
    }
}
