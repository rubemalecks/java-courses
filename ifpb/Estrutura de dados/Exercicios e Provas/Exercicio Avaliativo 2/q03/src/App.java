import java.util.Scanner;

public class App {
    public static int calcularLeds(String numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length(); i++) {
            switch (numeros.charAt(i)){
                case '0': 
                    soma += 6;
                    continue;
                case '1': 
                    soma += 2;
                    continue;
                case '2': 
                    soma+= 5;
                    continue;
                case '3': 
                    soma+= 5;
                    continue;
                case '4': 
                    soma+= 4;
                    continue;
                case '5': 
                    soma+= 5;
                    continue;
                case '6':
                    soma+= 6;
                    continue;
                case '7': 
                    soma+= 3;
                    continue;
                case '8': 
                    soma+= 7;
                    continue;
                case '9': 
                    soma+= 6;
                    continue;
            }
        }
        return soma;
    }
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe os numeros do painel que quer montar: ");
        String numeros = entrada.nextLine();
        System.out.println("Quantidade de leds necessarios: "+ calcularLeds(numeros));
        entrada.close();
    }
}
