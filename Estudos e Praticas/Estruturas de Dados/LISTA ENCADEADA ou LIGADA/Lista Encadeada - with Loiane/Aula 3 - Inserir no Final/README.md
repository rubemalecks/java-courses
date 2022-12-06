#  Inserir no Final


* Para inserir no Final primeiro precisamos usar algo que determine o final ou ultimo elemento [um atributo]

````java
private No<T> ultimo;
````
Já no método precisamos aplicar uma logica para ele identificar e diferenciar o ultimo elemento.
````java

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0){ //Tamanho == (0) inicio = novaCelula
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula); // proxCelula = novaCelula
        }
        this.ultimo = celula; // Se é no final = ultima celula
        this.tamanho++; 
    }

````

# Codigo final da Classe


````java
public class ListaEncadeada<T>{
    private No<T> inicio;
    private int tamanho; // int -> já começa com zero
    private No<T> ultimo;
   

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0){
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }


    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
````