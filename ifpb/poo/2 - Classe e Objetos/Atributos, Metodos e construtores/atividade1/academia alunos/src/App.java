import alunos.registro;

public class App {
    public static void main(String[] args) throws Exception {
        registro aluno = new registro();
        aluno.setNome("Rubem");
        System.out.println(aluno.getNome());
    }
}
