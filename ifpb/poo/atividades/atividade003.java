import java.util.Scanner;

public class atividade003 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        a = sc.nextInt();

        System.out.print("B: ");
        b = sc.nextInt();

        System.out.println("AxB => " + a * b);

        double result_raiz_a;
        result_raiz_a = Math.sqrt(a);
        
        System.out.println("Raiz de A => " + result_raiz_a);

        double result_raiz_b;
        result_raiz_b = Math.sqrt(b);
        
        System.out.println("Raiz de B => " + result_raiz_b);
    }

}
