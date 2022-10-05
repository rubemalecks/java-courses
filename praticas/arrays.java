import java.util.Scanner;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int [] valores = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++){
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            valores[i] = numero;
        }
        System.out.println(Arrays.toString(valores));
    }
    
}
