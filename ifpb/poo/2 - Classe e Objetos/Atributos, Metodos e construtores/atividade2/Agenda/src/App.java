import classes.Agenda;
import classes.Contato;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Contato contato1 = new Contato("Rubinho", "(83) 9 4002 8922", "Itatuba-PB");

        System.out.println("=====================================");

        Contato contato2 = new Contato();
        System.out.print("Nome: ");
        contato2.setNome(entrada.nextLine());
        System.out.print("Cel: ");
        contato2.setCelular(entrada.nextLine());
        System.out.print("endereço: ");
        contato2.setEndereco(entrada.nextLine());
        System.out.println("=====================================");
        System.out.println("Dados do Segundo Contato");
        System.out.println("Nome: " + contato2.getNome());
        System.out.println("Cel: " + contato2.getCelular());
        System.out.println("Endereço: " + contato2.getEndereco());

        Contato contato3 = new Contato("Leandro", "(83) 9 4002 9922", "Campina Grande-PB");

        System.out.println("=====================================");
        
        System.out.printf("Contato %s e o Contato %s são ...\n", contato1.getNome(), contato2.getNome());
        if (contato1.equals(contato2)){
            System.out.println("Contatos Iguais");
        }else { 
            System.out.println("Contatos Diferentes!");}
        System.out.println("=====================================");
        

        Agenda arquivo = new Agenda();
        arquivo.addcontato(contato2);
        arquivo.addcontato(contato1);
        System.out.println(arquivo.toString());
        System.out.println("=====================================");

        arquivo.removeContatos(contato3);
        System.out.println("=====================================");

        System.out.println(arquivo.toString());

    }
}
