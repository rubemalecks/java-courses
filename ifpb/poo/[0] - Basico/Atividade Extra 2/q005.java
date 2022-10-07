import java.util.Scanner;

public class q005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont_impar = 0;
        int cont_par = 0;
        int soma = 0;
        double somad = 0;
        double media = 0;
        int menor = 0;
        int maior = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "o valor: ");
            int vlr = sc.nextInt();
            
            soma += vlr;


            if (i == 1) {
                menor = vlr;
                maior = vlr;
            } else {
                if (vlr < menor){
                    menor = vlr;
                }
                if (vlr > maior){
                    maior = vlr;
                }
            }
            if (vlr % 2 == 0) {
                cont_par += 1;
            } else {
                cont_impar += 1;
            }
        }
        somad = (double) soma;
        media = somad / 10;

        System.out.println(cont_par + " pares.");
        System.out.println(cont_impar + " impares.");
        System.out.println("A media: " + media);
        System.out.println("A soma: " + soma);
        System.out.println("O menor: " + menor);
        System.out.println("O maior: " + maior);

    }
}
