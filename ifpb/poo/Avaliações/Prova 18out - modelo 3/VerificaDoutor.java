import java.util.Scanner;
import java.util.Arrays;

public class VerificaDoutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite: ");
        String entrada = input.nextLine();
        String vetor[] = new String[42];
        vetor = entrada.split(" ");
        if (vetor[0].toUpperCase().equals("DR.")) {
            System.out.println("O Doutor está presente");
        } else {
            System.out.println("Doutor não foi encontrado");
        }

    }

}
