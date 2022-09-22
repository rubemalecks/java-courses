import java.util.Scanner;

public class pratica001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu peso: ");
        float peso = sc.nextFloat();

        if (idade <= 20) {
            if (peso < 60) {
                System.out.print("Voce esta no grupo de risco 9");
            } else if (peso <= 90) {
                System.out.print("Voce esta no grupo de risco 8");
            } else {
                System.out.print("Voce esta no grupo de risco 7");
            }

        } else if (idade <= 50) {
            if (peso < 60) {
                System.out.print("Voce esta no grupo de risco 6");
            } else if (peso <= 90) {
                System.out.print("Voce esta no grupo de risco 5");
            } else {
                System.out.print("Voce esta no grupo de risco 4");
            }

        } else {
            if (peso < 60) {
                System.out.print("Voce esta no grupo de risco 3");
            } else if (peso <= 90) {
                System.out.print("Voce esta no grupo de risco 2");
            } else {
                System.out.print("Voce esta no grupo de risco 1");
            }
        }
    }
}