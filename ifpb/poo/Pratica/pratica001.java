import java.util.Scanner;

public class pratica001 {
    public static void main(String[] args) {
        int estoque;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade no estoque: ");
        estoque = sc.nextInt();
        if (estoque >= 100) {
            System.out.println("Estoque Suficiente!");
        } else if (estoque > 50 && estoque < 100) {
            System.out.println("Avaliar Pedido!");
        } else if (estoque < 50) {
            System.out.println("Fazer um novo pedido!!");
        }
    }
}