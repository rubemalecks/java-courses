import java.util.Scanner;

public class q006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sourcePass = "12345";
        while (true) {
            System.out.print("-------------------------\n");
            System.out.print("LOGIN: ");
            String login = sc.next();
            System.out.print("SENHA: ");
            String senha = sc.next();
            System.out.print("-------------------------\n");
            if (senha.equals(sourcePass)) {
                System.out.println("Parabens, " + login + "!\nSenha Correta!");
                break;
            } else {
                System.out.println("Cuidado, senha incorreta!");

            }
        }
    }
}
