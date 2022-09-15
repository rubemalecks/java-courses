import java.util.Scanner;

public class atividade005 {
    public static void main(String[] args) {
        double c, i, m;
        int t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Capital Inicial: R$ ");
        c = sc.nextDouble();

        System.out.print("Taxa de Juros: % ");
        i = sc.nextDouble();

        System.out.print("Periodo de Tempo: ");
        t = sc.nextInt();

        m = c * (Math.pow((1 + (i / 100)), t));
        System.out.printf("Valor final -> R$ %.2f %n", m);
    }
}
