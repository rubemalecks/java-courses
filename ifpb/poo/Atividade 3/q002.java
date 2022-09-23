import java.util.Scanner;

public class q002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite: ");
        String str = input.nextLine();

        System.out.println("----------------------------");
        System.out.println("Tem " + str.length() + " Letras");
        System.out.println("MAIUSCULA: " + str.toUpperCase());
        System.out.println("minusculo> " + str.toLowerCase());
        System.out.println("5 primeiros caracteres: " + str.substring(0, 5));
    }

}
