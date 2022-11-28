# RESUMO E OBSERVAÇÕES


## Comparando 2x Objetos / usando equals em objetos
````JAVA
Aluno a1 = new Aluno("Rubem");
Aluno a2 = new Aluno("Rubem");
System.out.println(a1.equals(a2)); //> false
````
>> false: pois o java esta comparando a referencia do objeto aluno.

Para resolver isso podemos sobrescrever o método "equals" aplicando o nosso da forma que melhor se adequar.

>> dentro da class aluno ...

````java
    @override // É recomendada, não obrigatória
    public boolean equals(Object obj) {
        Aluno exAluno = (Aluno) obj;
        return exAluno.getNome().equals(this.nome); // a1.nome == a2.nome ? true : false 
    }
````
testando novamente ...
````java
System.out.println(a1.equals(a2)); //> true;
````
## Reescrevendo o metodo toString

````java
    @Override
    public String toString() {
        return this.getNome();
    }
````

