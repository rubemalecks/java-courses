import java.util.Scanner;

public class pratica003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vc quer contar até quanto?: ");
        int valor = sc.nextInt();
        for (int i = 1; i <= valor; i++) {
            System.out.println(i + "");
        }
    }

}
