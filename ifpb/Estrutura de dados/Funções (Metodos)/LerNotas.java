import java.util.Arrays;
import java.util.Scanner;

public class LerNotas {

    // SOMA DOS NUMEROS IMPARES
    static int SomaImpares(int[] vNotas) {
        int s = 0;
        for (int i = 0; i < vNotas.length; i++) {
            if (vNotas[i] % 2 == 1) {
                s += vNotas[i];
            }
        }
        return s;
    }

    // MEDIA DOS NUMEROS PARES
    static double mediaPar(int[] vNotas) {
        int s = 0;
        int contaPar = 0;
        for (int i = 0; i < vNotas.length; i++) {
            if (vNotas[i] % 2 == 0) {
                s += vNotas[i];
                contaPar++;
            }
        }
        double media = 0;

        if (contaPar != 0) {
            media = (double) s / contaPar;
        }
        return media;
    }

    // ABAIXO DE 70

    static double abaixo70(int[] vNotas) {
        int contAbaixo = 0;
        for (int i = 0; i < vNotas.length; i++) {
            if (vNotas[i] < 70) {
                contAbaixo++;
            }
        }
        return contAbaixo;
    }

    // ACIMA DA MEDIA
    static int acimaMedia(int[] vNotas) {
        double soma = 0;
        int acimaDaMedia = 0;
        for (int i = 0; i < vNotas.length; i++) {
            soma += vNotas[i];
        }

        double media = soma / vNotas.length;

        for (int i = 0; i < vNotas.length; i++) {
            if (vNotas[i] > media) {
                acimaDaMedia++;
            }
        }
        return acimaDaMedia;
    }

    public static void main(String[] args) {
        System.out.print("Quantidade de notas: ");
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();

        int[] notas = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%d a nota: ", i + 1);
            notas[i] = sc.nextInt();
        }

        System.out.println("Soma dos Impares: " + SomaImpares(notas));
        System.out.println("Media dos numeros par: " + mediaPar(notas));
        System.out.println("Qtd numeros abaixo de 70: " + abaixo70(notas));
    }
}
