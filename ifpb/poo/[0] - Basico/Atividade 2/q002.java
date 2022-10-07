import java.util.Scanner;

public class q002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");        
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print("O dobro é "+ num*2);
        } else {
            System.out.print("O triplo é "+ num*3);
        }
    }
    
}
