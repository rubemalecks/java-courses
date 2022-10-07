import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        String[] nomes = { "Rubinho", "Adams", "Ronaldo", "Cristiano" };
        String telefones[] = { "83 6969 4242", "81 4242 4242", "83 8729 1429", "21 7747 4477" };
        boolean achou = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Consultar: ");
        String consulta_telefone = sc.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].toUpperCase().equals(consulta_telefone.toUpperCase())) {
                System.out.println("Nome: " + nomes[i] + " | Telefone: " + telefones[i]);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Não encontrado ...");
        }
    }
}
