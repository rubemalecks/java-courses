import javax.annotation.processing.SupportedOptions;

public class TestaCaracteres {
    public static void main(String[] args) {

        // em char tem de usar 'aspas simples' 
        char letra = 'a'; //char == só 1 caractere
        System.out.println(letra);

        char valor = 66;  // 66 = B; na tabela Ascii
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor); // == C
    }
}
