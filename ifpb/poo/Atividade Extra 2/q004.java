import java.util.Scanner;

public class q004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ano de Nascimento: ");
            int ano = sc.nextInt();
            if (ano > 2022 || ano < 1900) {
                System.out.println("Entrada Invalida!!");

            } else {
                System.out.println("Valeuuu!!");
                break;
            }
        }
    }

}
