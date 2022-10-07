/* Faça um programa que pergunte ao usuário o tamanho de uma lista de inteiros, em seguida, o 
usuário deve fornecer números inteiros e armazenar na lista de modo a preencher toda a lista. Ao 
final, exiba a lista na ordem que foi lida e depois a mesma lista em ordem inversa.*/


import java.util.Scanner;
import java.util.Arrays;
public class q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho da lista: ");
        int vetor[];
        int t = sc.nextInt();
        vetor = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.print("nº na posição ["+ i+"]: ");
            int num = sc.nextInt();
            vetor[i] = num;
        }
        System.out.println(Arrays.toString(vetor));
        System.out.print("Ao contrario fica: ");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }
    }
}
