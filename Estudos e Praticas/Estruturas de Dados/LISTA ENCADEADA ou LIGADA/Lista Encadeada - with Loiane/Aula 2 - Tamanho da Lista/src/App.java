public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        System.out.println(lista);
        System.out.println("tamanho: " +lista.getTamanho());

    }
}
