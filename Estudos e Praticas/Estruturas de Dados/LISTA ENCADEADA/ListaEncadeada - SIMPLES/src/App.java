import java.util.Scanner;
import classes.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        Lista listaEnc = new Lista();

        do {
            showmenu();
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Digite um número: ");
                    double value = sc.nextDouble();
                    listaEnc.addFirst(value);
                    break;
                }
                case 2: {
                    System.out.println(listaEnc);
                    break;
                }
                case 3: {
                    System.out.println("\nFim do Programa.");
                    break;
                }
                default:
                    throw new IllegalArgumentException("Opção inválida! " + op);
            }
        } while (op != 3);

        sc.close();
    }

    public static void showmenu() {
        System.out.println("1 - Inserir Elemento na lista");
        System.out.println("2 - Mostrar Lista");
        System.out.print("3 - Sair\nR: ");
    }
}
