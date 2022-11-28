package classes;

public class ListaLigada {
    private Celula primeira = null;
    private int  totalElementos = 0;


    public void addNoComeco(Object elemento){
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;
        this.totalElementos++;
    }

    public void add(Object elemento){}

    public void add(int pos, Object elemento){}

    public Object pega(int pos, Object elemento){
        return null;
    }

    public void remove(int pos){}


    public int tamanho(){
        return 0;
    }

    public boolean contem(Object elemento){
        return false;
    }

    @Override
    public String toString(){
        if (this.totalElementos == 0){
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < totalElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }


}
