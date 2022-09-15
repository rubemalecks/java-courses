import java.util.Scanner;

public class q001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int v1 = sc.nextInt();
        System.out.print("Valor 2: ");
        int v2 = sc.nextInt();
        if (v1 > v2) {
            System.out.println("O valor 1 é maior!!");
        } else {
            System.out.println("O valor 2 é maior!!");
        }
    }
    
}
x