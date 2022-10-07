import java.util.Scanner;

public class q001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String x = input.nextLine();

        System.out.print("Cidade: ");
        String y = input.nextLine();

        System.out.print("Curso: ");
        String z = input.nextLine();

        System.out.print(
                "Seja bem vindo, " + x + " ao IFPB" + "o aluno da Cidade de " + y + " e foi aprovado no curso de " + z);

    }

}
