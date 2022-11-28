````java
public String busca(int pos){
    if (!(pos >=0 && pos < tamanho )){ // fora do range de [pos]
        throw new IllegalArgumentException("Posição inválida!");
    }
    return this.elementos[pos];
        
    }
````