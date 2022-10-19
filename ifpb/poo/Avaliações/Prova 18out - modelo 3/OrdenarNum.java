import java.util.Scanner;
import java.util.Arrays;

public class OrdenarNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d º numero: ", i + 1);
            numeros[i] = sc.nextInt();

        }
        Arrays.sort(numeros);
        System.out.println("Em ordem crescente: " + Arrays.toString(numeros));
    }
}
