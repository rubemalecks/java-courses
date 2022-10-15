import java.util.Scanner;
public class SomaPares {

    static int SomaPar(int x, int y){
        int soma = 0;
        for (int i = 0; i <= y; i++){
            if (i% 2 == 0) {
                soma += i;
            }
        } return soma;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int valor_a = sc.nextInt();
        System.out.print("b: ");
        int valor_b = sc.nextInt();
        
        System.out.println(SomaPar(valor_a, valor_b));
    }
}
