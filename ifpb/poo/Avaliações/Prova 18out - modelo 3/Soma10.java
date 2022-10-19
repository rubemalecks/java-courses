import java.util.Scanner;
public class Soma10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num = 0;
        int array [] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite: ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            soma+= array[i];
        }

        System.out.println("O resultado é "+ soma);
    }
}
