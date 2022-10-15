import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        String nomes[] = new String[5];
        int idades[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int contador_maiores_idade = 0;
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------");
        }

        System.out.println("Maiores de idade:");

        for (int i = 0; i < nomes.length; i++) {

            if (idades[i] >= 18) {
                System.out.println(nomes[i].toUpperCase() + "  | idade: " + idades[i]);
                contador_maiores_idade++;
            }
        }
        if (contador_maiores_idade == 0) {
            System.out.println("Não há maiores de idade");
        }

    }
}
