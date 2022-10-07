import java.util.Scanner;

public class q001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Valor: ");
        int num = sc.nextInt();
        int r = num;

        
        for (int i=num-1; i >= 1; i--) {
            r += (r*i);
        }
        if (r == 0) {
            r = 1;
        }
        System.out.println("O fatorial de "+ num + " = "+ r);

    }
}