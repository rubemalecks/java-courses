# Definindo a Classe

EX: Conta-Corrente ...

### Uma conta tem ...

#### [ ATRIBUTOS ]

- saldo:
- agencia:
- numero:
- titular:

> estes são os **atributos** da conta, ou seja, as características da conta.

## Uma conta faz ...

#### [ METODOS DE CONTA ]

> ("o que uma conta faz? ")

- Transfere( )
- Depositar ( )
- Sacar( )
- Consulta saldo( )

> estes são os métodos da conta

### PENSANDO + UM POUCO

Criamos uma especificação do que representa um conta, todavia, as características de cada conta vão ser diferentes, tendo em mente isso ... a especificação é só uma representação do que é uma conta, mas não é a própria conta.

> podemos associar também a uma planta de uma casa. Uma planta tem tudo que representa a casa, porém essa planta não é uma casa.

#### Então ...

A partir desta representação da casa poderemos construir uma casa com tais características, da mesma forma a conta-corrente.

### Pratica:

```
tipo Conta:
    saldo
    agencia
    numero
    titular

```

**Em java:**

```
class Conta{
    double saldo;
    int agencia;
    int numero;
    String titular;
}
```
