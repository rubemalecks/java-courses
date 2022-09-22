import java.util.Scanner;

public class q003 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont_impar = 0; 
        int cont_par = 0;


        for (int i = 1; i <=10; i++) {
            System.out.print("Digite o "+ i + "o valor: ");
            int vlr = sc.nextInt(); 


            if (vlr%2==0) {
                cont_par += 1;
            } else {
                cont_impar += 1;
            }
        }


        System.out.println(cont_par + " pares.");
        System.out.println(cont_impar + " impares.");
    }
}
