## APLICANDO A LISTA ENCADEADA


- CRIAR CLASSE REF AO NÓ
- CRIAR CLASSE REF A LISTA


- NA CLASSE LISTA:
    - CRIAR O ATRIBUTO REFERENTE AO PRIMEIRO ELEMENTO /A CABEÇA DA LISTA.
- CRIAR MÉTODOS DE ADIÇÃO A LISTA.
--------------------------------------------------------------------

### MÃO NA MASSA: 

- Classe Nó/No: 

````java
public class No {
    private Double value;
    private No next; // O next é o ponteiro que vai dizer quem é o proximo "No"


    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
````

- Na Classe da Lista:

````java
public class Lista {
    
    private No head;

    public void addFirst(Double value) {
        No novoNo = new No(); // instancia a classe base "No"
        novoNo.setValue(value); // no obj seta o valor
        novoNo.setNext(head); // quem era o primeiro vai virar o "next"
        head = novoNo; // e o primeiro agora é o novo
    }

    @Override 
    public String toString() { // Só p/ imprimir melhor a lista
        StringBuffer sb = new StringBuffer();
        No p = head;
        sb.append("[");
        while (p != null) {
            sb.append(p.getValue());
            if (p.getNext() == null){
                sb.append("]");
            } else sb.append(", ");
            p = p.getNext();
        }
        return sb.toString();
    }
}
````

