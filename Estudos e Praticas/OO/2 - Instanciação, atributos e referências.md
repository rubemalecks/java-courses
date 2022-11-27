# Instanciação, atributos e referências



Toda conta vai ter estes atributos:
> também são chamados de propriedades e campos.
```
class Conta{
    double saldo;
    int agencia;
    int numero;
    String titular;
}
```
> isso NÃO É UMA CONTA, é a especificação dela.

Precisaremos construir o que foi especificado, o que será construído chamaremos de **OBJETO** ou **INSTANCIA**. Um objeto do tipo conta ou uma instancia do tipo conta.

> Esse processo que acabamos de fazer podemos chamar de **instanciação**.

#### Quando precisar alterar algum atributo iremos alterar o atributo a partir desta instancia/objeto.

### em Java:


```java
public class Conta{ 
    double saldo;
    int agencia;
    int numero;
    String titular;
}
```
> o public NESTE MOMENTO é opcional. Muitas das vezes o proprio editor adicionar ele automaticamente.
No arquivo conta só a classe, ele é um codigo valido em java porém não faz necessariamente nada.

# INSTANCIAÇÃO
Criando outro arquivo com nome: "CriaConta". Neste iremos realmente instanciar/criar a conta.

```java
public class CriaConta{

    public static void main(String[] args){
        Conta primeiraConta = new Conta();

    }
}
```
O "new Conta" inicializou e devolveu uma referencia para dentro da ***variável*** primeiraConta vai fazer uma referencia para a instancia de Conta.

```java
        primeiraConta.saldo = 200;
```

Toda vez que precisarmos falar do atributo saldo da primeira conta precisamos indicar a referencia de conta ex: primeiraConta.saldo. Caso tente buscar um atributo que não existe obviamente o java retornara um erro.

