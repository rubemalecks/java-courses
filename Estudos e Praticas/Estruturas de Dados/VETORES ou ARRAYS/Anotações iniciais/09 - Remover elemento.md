````java
    public void remover(int pos){
        if (!(pos >= 0 && pos <= tamanho)) { // verifica se [pos] é valida
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = pos; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho --;
    }
````

podemos usar junto do metodo busca()

````java
    int pos= vetor.busca("E");
    if (pos >= 0){
        vetor.remover(pos);
    }
````
