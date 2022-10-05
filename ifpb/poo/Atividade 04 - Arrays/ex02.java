/* 02) Crie estaticamente um array de dez números inteiros. Depois imprima na tela a soma dos valores armazenados. */

public class ex02 {

    public static void main(String[] args) {
        int soma = 0;
        int[] dezNum = {14, 13, 0, 42, 5, 11, 14, 13, 12, 42};

        for (int i = 0; i < dezNum.length; i++){
            soma+= dezNum[i];
        }
        System.out.println(soma);
    }

}

    

