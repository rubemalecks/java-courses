import java.util.Scanner;
public class q002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num_t = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num_t + " x " + i + " = "+ num_t*i);
        }
    }
    
}
