````java
    public int busca(String elemento){
        for (int i=0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
               return i; 
            }
        }
        return -1;
    }
````

# ou

````java
    public int busca(String elemento){
        for (int i=0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
               return true; 
            }
        }
        return false;
    }
````