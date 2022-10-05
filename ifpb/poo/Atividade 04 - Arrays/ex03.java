/* 03) Crie um array de cinco nomes de pessoas. Depois verifique se o nome “ANA” faz parte do Array. Em caso afirmativo exibir na tela a mensagem “SUCESSO”. E mostre a mensagem “FRACASSO” caso contrário. */

public class ex03 {

    public static void main(String[] args) {
        boolean temAna = false;
        String[] listNomes = { "Rubinho", "Karine", "Ana", "Maria", "José" };
        for (int i = 0; i < listNomes.length; i++) {
            if (listNomes[i].toUpperCase().equals("ANA")) {
                temAna = true;
            }
        }
        if (temAna) {
            System.out.println("SUCESSO");
        } else {
            System.out.println("FRACASSO");
        }

    }
}
