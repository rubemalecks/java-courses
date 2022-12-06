# Tamanho da lista

* Basicamente só precisamos adicionar o atributo "tamanho" a classe da lista.
* E por fim adicionar o método getter para poder consultar o tamanho do mesmo.

````java
public class ListaEncadeada<T>{
    private No<T> inicio;
    private int tamanho; // <-------------------------------

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }

    public int getTamanho() { // <--------------------------
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }  
}
````

* E para consultar o tamanho no programa (main/app.java) basta chamar o método this.getTamanho().
