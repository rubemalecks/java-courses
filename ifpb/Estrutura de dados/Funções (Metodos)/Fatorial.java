import java.util.Scanner;
public class Fatorial {

    static int meuFatorial(int a){
        int resultado = 0;
        if (a == 0 || a == 1){
            return resultado = 1;
        }
        resultado = a;
        for (int i = a-1; i > 0; i--){   
            resultado += resultado * i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            System.out.print("R: "+ meuFatorial(num));
        }
        
    }
}
