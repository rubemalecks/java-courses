import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random input2 = new Random();
    int v[] = new int[10];
    int soma=0, maior;
    double media;
    int pos = 0;
    // entrada de dados (vetor)
    for (int i=0; i<v.length; i++){
      //System.out.print("Digite um valor: ");
      v[i] = input2.nextInt(10);
      soma += v[i];
    }
    media = (double) soma / v.length;

    maior = v[0];
    for (int i=0; i<v.length; i++){
       if (v[i] > maior) {
         maior = v[i];
         pos = i;
       }    
    }   
    
    // saida de dados (vetor) - impressao de uma unica vez
    System.out.println("\nExibição de uma única vez: ");
    System.out.println(Arrays.toString(v));
    System.out.printf("Media: %.2f", media );
    System.out.printf("\nMaior: %d", maior );

    // saida de dados (vetor) - impressao elemento por elemento
    System.out.println("\nExibição do vetor: ");
    System.out.println("pos: "+ pos);
    for (int i=0; i<v.length; i++){
      //System.out.println("v["+i+"]="+v[i]);
      System.out.print(v[i] + " ");
    }
    System.out.println("pos: "+ pos);
    
  }
}