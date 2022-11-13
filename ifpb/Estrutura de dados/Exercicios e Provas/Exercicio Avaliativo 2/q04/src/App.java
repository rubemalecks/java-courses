import java.util.Scanner;

public class App {
    public static int contaAcertos(char[] gabOfic, char[] gabEst) {
        int acertos = 0;
        for (int i = 0; i < gabOfic.length; i++) {
            if (gabOfic[i] == gabEst[i]) {
                acertos += 1;
            }
        }
        return acertos;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Gabarito Oficial: ");
        char[] gabOficial = entrada.nextLine().toCharArray();

        System.out.print("Quantidade de estudantes: ");
        int qtdEst = entrada.nextInt();

        int[] notas = new int[qtdEst];
        char[] gabAluno = new char[10];
        String nomeMelhorNota = "";
        int maiorNota = 0;
        entrada.nextLine();
        String[] listNomes = new String[qtdEst];
        for (int i = 0; i < qtdEst; i++) {
            System.out.print("Nome: ");
            listNomes[i] = entrada.nextLine();
            System.out.print("Gabarito: ");
            gabAluno = entrada.nextLine().toCharArray();
            notas[i] = contaAcertos(gabOficial, gabAluno);
            System.out.printf("%s tirou nota %d.\n\n", listNomes[i], notas[i]);
            if (i == 0) {
                maiorNota = notas[i];
                nomeMelhorNota = listNomes[i];
            } else {
                if (notas[i] > maiorNota) {
                    maiorNota = notas[i];
                    nomeMelhorNota = listNomes[i];
                }
            }
        }
        System.out.printf("%s tirou a melhor nota.", nomeMelhorNota);
    }
}
