import java.util.Scanner;

class Ano_bissexto {

    static boolean eBissexto(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = sc.nextInt();

        if (eBissexto(ano)) {
            System.out.println("BISSEXTO");
        } else {
            System.out.println("Não bissexto");
        }

    }
}