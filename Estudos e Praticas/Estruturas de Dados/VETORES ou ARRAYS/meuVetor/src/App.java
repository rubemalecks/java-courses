import classes.*;

public class App {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);
        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);

        System.out.println("Tamanho = " + vetor.getTamanho());
    }
}
