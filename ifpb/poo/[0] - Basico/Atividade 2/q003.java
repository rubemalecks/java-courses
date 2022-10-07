import java.util.Scanner;

public class q003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Maças Compradas, qtd: ");
        int n = sc.nextInt();
        if (n >= 12) {
            System.out.printf("As Maças custaram R$ %.2f ", n * 0.25);
        } else {
            System.out.printf("As Maças custaram R$ %.2f", n * 0.30);
        }
    }

}
