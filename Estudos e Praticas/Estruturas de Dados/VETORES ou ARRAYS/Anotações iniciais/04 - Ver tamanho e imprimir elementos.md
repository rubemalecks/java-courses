````java   
public int getTamanho() { 
    return tamanho;
    }
````
# PODEMOS USAR ISSO ...
````java
    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
````
>> [elemento 1, elemento 2, elemento 3, null, null, null, null, null, null, null]

Porém como visto acima ele vai retornar as posições mesmo nulas.

# melhor

````java
 @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); 
        s.append("[");
        for (int i = 0; i <this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }
````