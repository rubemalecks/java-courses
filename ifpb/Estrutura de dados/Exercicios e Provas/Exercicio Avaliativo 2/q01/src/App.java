import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        int matric [] = new int[qtd];
        int notas [] = new int[qtd];
        int contPrem = 0;
        int maior = 0 ;
        for (int i = 0; i < qtd; i++) {
            matric[i] = entrada.nextInt();
            notas[i] = entrada.nextInt();

            if (i == 0){
                maior = matric[i];
            }else {
                if (notas[i] > maior){
                    maior = notas[i];
                }
            }
        }
        System.out.println("Aluno(s) com maior(es) nota(s): ");
        for (int i = 0; i < qtd; i++){
            if (notas[i] == maior){
                System.out.println(matric[i]);
                contPrem+= 1;
            }
            
        }
        System.out.println("Quantidade de premiados: "+ contPrem);




    }
}
