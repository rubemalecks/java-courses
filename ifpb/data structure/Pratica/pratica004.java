import java.util.Scanner;
public class pratica004 {

    public static void main(String[] args) {
        int soma = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Insira um valor: ");
            int valor = sc.nextInt();
            if (valor < 0) {
                break;
            }
            soma += valor; 
        }
        
        System.out.print("Total: "+ soma);
        

    }
    
}
