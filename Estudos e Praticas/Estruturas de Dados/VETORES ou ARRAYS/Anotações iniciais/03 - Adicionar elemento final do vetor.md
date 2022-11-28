# Adicionar elemento no final

# Exemplo 1
```java
package classes;
public class Vetor {
    private String[] elementos;
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }
    
    public void adiciona(String elemento){
        for (int i = 0; i < elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}
```

```java
import classes.*;

public class App {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
    }
}
```
Funciona, porém ... se centenas de elementos iriamos iterar até achar um nulo. *Não é eficiente.*

# Melhor: 

```java
package classes;
public class Vetor {
    private String[] elementos; // usamos um vetor do próprio java
    private int tamanho; // tamanho real por ser != da capacidade 

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    public boolean adiciona(String elemento){
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
}
```
