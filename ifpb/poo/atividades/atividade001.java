import java.util.Scanner;

public class atividade001 {

    public static void main(String[] args) {
        Scanner rua = new Scanner(System.in);
        String name_rua;
        System.out.print("Rua: ");
        name_rua = rua.nextLine();

        Scanner bairro = new Scanner(System.in);
        String name_bairro;
        System.out.print("Bairro: ");
        name_bairro = bairro.nextLine();

        Scanner cidade = new Scanner(System.in);
        String name_cidade;
        System.out.print("Cidade: ");
        name_cidade = cidade.nextLine();

        System.out.print("O usuario mora na Rua: " + name_rua);
        System.out.print(", Bairro: " + name_bairro);
        System.out.print(", Cidade: " + name_cidade);
    }

}
