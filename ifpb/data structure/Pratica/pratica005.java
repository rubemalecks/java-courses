import java.util.Scanner;

public class pratica005 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %2d o numero: ", i + 1);
            int num = scanner.nextInt();
            soma += num;
        }
        float media = (float) soma / 10;
        System.out.printf("Soma: %2d\n", soma);
        System.out.println("Media: " + media);

        /// Falta fizer o menor numero e maior
    }

}
