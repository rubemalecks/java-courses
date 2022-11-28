import classes.Aluno;
import classes.Vetor;
public class App {
    public static void main(String[] args) throws Exception {
        Vetor listaAlunos = new Vetor();
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");
        Aluno a3 = new Aluno("Alex");
        Aluno a4 = new Aluno("Rubinho");
     
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        
        System.out.println(listaAlunos.toString());
        System.out.println(listaAlunos.tamanho());
        listaAlunos.addP(3, a4);
        System.out.println(listaAlunos.toString());
        listaAlunos.remover(0);
        System.out.println(listaAlunos.toString());
        for (int i = 0 ; i < 300; i++) {
            Aluno a7 = new Aluno("Aluno novo");
            listaAlunos.add(a7);
        }   
        System.out.println(listaAlunos.toString());

        

    }
}
