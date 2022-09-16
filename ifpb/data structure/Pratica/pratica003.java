import java.util.Scanner;

public class pratica003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preco do pao: R$ ");
        float valor = sc.nextFloat();
        System.out.println("Panificadora Pão de Ontem - Tabela de Precos");
        for (int i = 1; i <= 50; i++) {
            float price = i * valor;
            System.out.printf("%d - R$ %.2f\n",i, price);
        }

    }
    
}
