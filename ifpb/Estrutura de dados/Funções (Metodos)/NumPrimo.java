import java.util.Scanner;

public class NumPrimo {

    static boolean conferePrimo(int num) {
        int contaDivisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contaDivisores++;
            }
        }
        if (contaDivisores == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int numero = sc.nextInt();
            System.out.println(conferePrimo(numero));
        }
    }
}
