import classes.Conta;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("\t\t  Bem vindo ao RuBank");

        Conta emanuelConta = new Conta("Emanuel Dantas", 123, 456);

        while (true) {
            System.out.println("\n===========================================================");
            System.out.println("Menu:\n\t[1] - Ver Saldo\n\t[2] - Depositar\n\t[3] - Sacar\n\t[0] - SAIR\n");
            System.out.print("Digite: ");
            int op = entrada.nextInt();
            System.out.println("===========================================================");
            if (op == 0) {
                System.out.println("Volte Sempre!!\nSaindo ... ");
                break;
            }
            switch (op) {
                case 1:
                    System.out.printf("O Saldo de %s é R$ %.2f ", emanuelConta.getTitular(), emanuelConta.getSaldo());
                    continue;

                case 2:
                    System.out.print("Valor do Deposito: R$ ");
                    emanuelConta.depositar(entrada.nextDouble());
                    continue;

                case 3:
                    System.out.print("Valor do Saque R$ ");
                    emanuelConta.saque(entrada.nextDouble());
                    continue;

            }
        }
    }
}
