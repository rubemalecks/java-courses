/*
 05) Escreva um programa que lê 10 valores numéricos digitados pelo usuário e armazena em um array. Depois o programa deve informar quantos dos números informados são pares. */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dezNum[] = new int[10];
        int contaPar = 0;
        for (int i = 0; i < dezNum.length; i++) {
            System.out.print("Digite: ");
            dezNum[i] = input.nextInt();
            if (dezNum[i] % 2 == 0) {
                contaPar++;
            }

        }

        System.out.printf("Ao todo temos %d numeros pares", contaPar);

    }
}