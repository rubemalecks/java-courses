import java.util.Scanner;

public class Acesso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro novoCadastro = new Cadastro();

        while (true) {
            System.out.println("-------------------------");
            System.out.print("Senha: ");
            novoCadastro.senha = input.nextLine();
            if (novoCadastro.confere_Senha(novoCadastro.senha) == false) {
                System.out.println("Senha Incorreta, tente novamente...");
                continue;
            } else {
                System.out.println("-------------------------");
                break;
            }
        }

        System.out.print("Nome: ");
        novoCadastro.nome = input.nextLine();

        System.out.print("Profissão: ");
        novoCadastro.profissao = input.nextLine();

        System.out.print("Sexo: ");
        novoCadastro.sexo = input.nextLine();

        System.out.print("Idade: ");
        novoCadastro.idade = input.nextInt();

        System.out.print("Habilidades: ");
        input.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        novoCadastro.habilidades = input.nextLine();
        novoCadastro.habilidades = novoCadastro.habilidades.toUpperCase();

        System.out.println("-------------------------");
        System.out.printf(
                "Seja bem vindo %s a empresa FACEBOOK. Será um prazer trabalhar com um %s com sua experiencia.\n",
                novoCadastro.nome, novoCadastro.profissao);

        System.out.println("Você irá se aposentar no ano de " + novoCadastro.aposentadoria(novoCadastro.idade)+ ".");

        if ((novoCadastro.habilidades.contains("GOSTO DE AJUDAR"))) {

            novoCadastro.habilidades = novoCadastro.habilidades.replaceAll("GOSTO DE AJUDAR", "SOU PROATIVO");
        }
        if ((novoCadastro.habilidades.contains("GOSTO DE TRABALHAR EM GRUPO"))) {
            novoCadastro.habilidades = novoCadastro.habilidades.replaceAll("GOSTO DE TRABALHAR EM GRUPO", "SOU PARTICIPATIVO");
        }

        System.out.println("Habilidades Listadas: " + novoCadastro.habilidades+".");

    }

}
