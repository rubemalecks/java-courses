import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta rubinhoConta = new Conta();
        rubinhoConta.saldo = 500; // adicionando saldo inicial

        Conta rebecaConta = new Conta();
        rebecaConta.saldo = 1000;


        int menu = 1;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("      Bem vindo ao Banco do Ruba1!!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        while (menu != 0) {
            System.out.println("-----------------------");
            
            System.out.print("Menu: \n [1] - Saldo \n [2] - Depositar \n [3] - Tranferir p/ Rebeca \n [4] - Sacar \n [0] - Sair\n \n[Digite]: ");
            menu = sc.nextInt();
            System.out.println("-----------------------");
            switch (menu) {
                
                case 1:
                    System.out.println("O saldo: R$ " + rubinhoConta.saldo);
                    System.out.println("-----------------------");
                    continue;

                case 2:
                    System.out.print("Valor do Deposito: R$ ");
                    double vlr_dep = sc.nextDouble();
                    rubinhoConta.deposita(vlr_dep);
                    continue;

                case 3:
                    System.out.print("Quanto Tranferir: R$ ");
                    double vlr_tranf = sc.nextDouble();

                    boolean conseguiuTransf = rubinhoConta.tranfere(vlr_tranf, rebecaConta);
                    if(!conseguiuTransf){
                        System.out.println("Sem Saldo Disponivel ...");
                    }
                    continue;

                case 4:
                    System.out.print("Valor de Saque: R$");
                    double vlr_saq = sc.nextDouble();
                    boolean conseguiurSacar = rubinhoConta.saque(vlr_saq);
                    if (!conseguiurSacar){
                        System.out.println("Sem Saldo Disponivel ...");
                    }
                    continue;

            }
        } 
        System.out.println("Tchauu, Volte Sempre! ;)");

    }

}
