import classes.aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        aluno student = new aluno(sc.nextLine());

        System.out.print("Nota da Atividade 1: ");
        student.setAtividade1(sc.nextDouble());

        System.out.print("Nota da Atividade 2: ");
        student.setAtividade2(sc.nextDouble());

        System.out.print("Nota da Prova 1: ");
        student.setProva1(sc.nextDouble());

        System.out.print("Nota da Prova 2: ");
        student.setProva2(sc.nextDouble());

        System.out.printf("A média final do aluno é %.2f ", student.getMedia());

        if (student.aprov(student.getMedia())) {
            System.out.println("\nO aluno foi APROVADO!!");
        } else {
            System.out.println("\nO aluno foi REPROVADO!!");
        }
        sc.close();
    }
}
