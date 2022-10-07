/* Faça um programa para ler duas listas de valores inteiros e gerar uma terceira lista que seja a união 
das duas listas informadas pelo usuário.
As listas devem ter pelo menos 1 elemento. Caso contrário, deve ser exibida a mensagem "Erro -
A lista deve ter pelo menos 1 elemento."
Entrada:
Número de elementos da primeira lista
Valores da primeira lista (separados por uma quebra de linha)
Número de elementos da segunda lista
Valores da segunda lista (separados por uma quebra de linha)
Saída:
A lista contendo todos os valores da primeira lista e dos valores da segunda lista.
[ OLHAR IMAGENS NO PDF!!!]

*/

import java.util.Scanner;
import java.util.Arrays;

public class q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Tamanho da lista 1: "); //apagar
        int tamanhoLista1 = sc.nextInt();

        if (tamanhoLista1 > 0) {
            int vetorLista1[] = new int[tamanhoLista1];
            for (int i = 0; i < vetorLista1.length;) {
                vetorLista1[i] = sc.nextInt();
                i++;
            }
            // System.out.print("Tamanho lista 2: "); //apagar
            int tamanhoLista2 = sc.nextInt();

            if (tamanhoLista2 > 0) {
                int vetorLista2[] = new int[tamanhoLista2];

                for (int i = 0; i < vetorLista2.length;) {
                    vetorLista2[i] = sc.nextInt();
                    i++;
                }
                int vetorFinal[] = new int[vetorLista1.length + vetorLista2.length];

                for (int i = 0; i < vetorLista1.length; i++) {
                    vetorFinal[i] = vetorLista1[i];
                }

                for (int i = 0; i < vetorLista2.length; i++) {
                    vetorFinal[i + vetorLista1.length] = vetorLista2[i];
                }
                System.out.println(Arrays.toString(vetorFinal));
            } else {
                System.out.println("Erro - A lista deve ter pelo menos 1 elemento");
            }

        } else {
            System.out.println("Erro - A lista deve ter pelo menos 1 elemento");

        }

    }

}
