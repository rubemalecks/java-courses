import java.util.Scanner;

public class atividade002 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        int nota1, nota2, nota3, nota4;

        System.out.print("Digite a 1a nota: ");
        nota1 = nota.nextInt();

        System.out.print("Digite a 2a nota: ");
        nota2 = nota.nextInt();

        System.out.print("Digite a 3a nota: ");
        nota3 = nota.nextInt();

        System.out.print("Digite a 4a nota: ");
        nota4 = nota.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Media Final: " + media);
    }
}
//
