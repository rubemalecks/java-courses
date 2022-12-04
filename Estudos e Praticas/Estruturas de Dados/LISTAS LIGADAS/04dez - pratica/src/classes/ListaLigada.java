package classes;
public class ListaLigada {
    private Celula primeira;
    private int totalElementos = 0;

    public void addNoComeco(Celula elemento){
        Celula novo = new Celula(elemento, primeira);
        this.primeira = novo;
        this.totalElementos++;
    }

}
