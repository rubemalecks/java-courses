import alunos.registro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        registro aluno = new registro();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        aluno.setNome(sc.nextLine());
        System.out.print("Idade: ");
        aluno.setIdade(sc.nextInt());
        System.out.print("Peso: ");
        aluno.setPeso(sc.nextDouble());
        System.out.print("Altura: ");
        aluno.setAltura(sc.nextDouble());
        System.out.println("=============================");
        System.out.println("Registro do aluno: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Peso: " + aluno.getPeso());
        System.out.println("Altura: " + aluno.getAltura());
        System.out.printf("IMC: %.2f", aluno.imc());
        System.out.print("\n" + aluno.temDesc(aluno.getIdade()));
        sc.close();

    }
}
