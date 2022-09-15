public class q005 {
    public static void main(String[] args) {
        int n = 1;
        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.print("A soma final é: " + soma);
    }

}
