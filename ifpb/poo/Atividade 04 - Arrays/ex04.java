/*
04) Escreva um programa que lê 10 valores numéricos digitados pelo usuário e armazena em um array. Depois o programa deve percorrer a estrutura e imprimir na tela o MAIOR e MENOR destes valores. */
import java.util.Scanner;


public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dezNum [] = new int[10];
        int menor = 0;
        int maior = 0;
        for (int i = 0; i < dezNum.length; i++) {
            System.out.print("Digite: ");
            dezNum[i] = input.nextInt();
            if (i == 0){
                menor = dezNum[i];
                maior = dezNum[i];
            } else {
                if (dezNum[i] < menor){
                    menor = dezNum[i];
                }
                if (dezNum[i] > maior){
                    maior = dezNum[i];
                }
            }
        }

        System.out.println("O menor numero é: "+ menor);
        System.out.println("O maior numero: "+ maior);

        
    }
}
