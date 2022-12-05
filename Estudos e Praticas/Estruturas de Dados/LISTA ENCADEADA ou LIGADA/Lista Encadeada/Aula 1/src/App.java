public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(4);
        lista.adiciona(9);

        System.out.println(lista);

    }
}
