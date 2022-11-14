## REFERENCIA NULL

## Dado o seguinte codigo

```java
public class Conta {
    double saldo;
    double agencia;
    int numero;
    Cliente titular; // referencia para o objeto titular
```
na pratica:

![Alt text](img%20objects/nul151455.png)

ou seja ...

![Alt text](../../../../../../../../c:/Users/Rubinho/Desktop/java-courses/alura/Entendendo%20a%20Orienta%C3%A7%C3%A3o%20a%20Objetos/Referencia%20Null/img%20objects/conta.png)


- > O atributo titular faz referencia aos dados do cliente(nome, cpf, profissão)

> PORÉM ... Não foi feita nenhuma associação do cliente a conta... e por padrão o dado nome na classe Cliente ele é NULL!

contaDaMarcela.titular é null, porém ao tentar fazer uma mudança de uma referencia nula/null o java retornara o erro.

>> podemos chegar a beira do "precipício" e ver que ali ele não vai a lugar nenhum, o problema é que tentamos ir alé disso e pegar o nome.

Podemos resolver assim: 
![Alt text](img%20objects/nul151434.png)

ao fazer: 
````java
contaDaMarcela.titular = new Cliente();
````
Normalmente em java temos esses "grafos"/ objetos interconectados.


Também poderia ser feito assim:

```java
public class Conta {
    double saldo;
    double agencia;
    int numero;
    Cliente titular = new Cliente(); 
```
Ao criar uma conta um cliente é criado, mas nesse caso não é o nosso objetivo. Um mesmo cliente pode ter outras contas.
