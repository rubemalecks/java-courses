import java.util.Scanner;

public class q005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String str1 = sc.nextLine();

        System.out.print("Digite uma String: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.print("Strings Iguais");
        } else {
            System.out.print("Strings Diferentes");
        }

    }
}
