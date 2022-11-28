# Estrutura de dados


### O(N) - > O de N

Que dizer que o tempo de execução varia de acordo com os elementos. Exemplo disso é no método contém, onde precisamos passar por todos os itens do vetor para saber se "x" elemento existe nele.

# removendo objetos

````java
    public void remover(int pos) {
        for (int i = pos; i < this.totAlunos; i++) {
            this.alunos[i] = this.alunos[i+1]; // observação
        }
        totAlunos --;
    }   
````
observação: 
>> A, B, C 
````java
exemplo.remover(0) //A
````
Na pratica vai fica
>> B, C, null

Mas como o vetor devidamente foi configurado ele só considera valor != de nulos.

>> Caso o "for" não tivesse diso implementado direito também poderia ocorrer isto, exemplo:

````java
    public void remover(int pos) {
        for (int i = pos; i < this.totAlunos-1; i++) { //obs1
            this.alunos[i] = this.alunos[i+1]; // observação
        }
        totAlunos --;
    }   
````
>> (totAlunos-1) iterou somente até o penultimo elemento.
Na pratica vai fica
>> B, C, C ou B, CC //colado como neste caso aqui.

Quando ele itera corretamente até o ultimo item ele vai pegar o proximo item[nulo] e colocar no lugar do "C" repetido, e como já tratamos de não considerar nulos ao vetor ele no final termina sendo "desconsiderado". 
