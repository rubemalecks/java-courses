import java.util.Scanner;

public class q004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        int tts = n + 30;
        for (int i = n + 1; i <= tts; i++) {
            System.out.println(i + " "); // Somente sucessores de "n"
        }
    }

}
