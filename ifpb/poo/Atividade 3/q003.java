import java.util.Scanner;

public class q003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        nome = nome.toUpperCase();
        if (nome.startsWith("ANA")) {
            System.out.println("Ana esta presente.");
        } else {
            System.out.println("Ana não foi encontrada.");
        }

    }

}
