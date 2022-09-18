import java.util.Scanner;

public class pratica005 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %2d o numero: ", i + 1);
            int num = scanner.nextInt();
            soma += num;
            if (i == 0) {
                menor = num;
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        
            if (num > maior) {
                maior = num;
            }
        }
        float media = (float) soma / 10;

        System.out.println("-----------------------------------------");
        System.out.printf("Soma: %2d\n", soma);
        System.out.println("Media: " + media);
        System.out.println("O menor numero e " + menor);
        System.out.print("O maior numero e " + maior);

    }

}
