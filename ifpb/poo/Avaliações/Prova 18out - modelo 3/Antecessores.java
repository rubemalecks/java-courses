import java.util.Scanner;

public class Antecessores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        System.out.println("\nOs antecessores de 20 são: ");
        for (int i = 0; i < 20; i++) {
            num--;
            System.out.println(num +"...");
        }

    }

}
