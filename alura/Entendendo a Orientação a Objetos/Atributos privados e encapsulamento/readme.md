# Atributos privados e encapsulamento


> Ao ir no comprar ao no mercado precisamos pagar no caixa, receber troco e etc, em nenhum momento podemos ir lá diretamente e pagar ou pegar o trocar direto do caixa. Da mesma forma a programação.

Ao modificar ou tentar modificar atributos precisamos usar métodos, mesmo que não pareça obrigatório. Ao mesmo tempo mudaremos os atributos para privados para evitar que sejam alterados diretamente no "main". Deixando privado ele não pode ser lido normalmente, por isso teremos que usar métodos que simplesmente mostrem o saldo. 

Para ver atributos privados chamamos de métodos Get, para modificar usamos os métodos Set. Podemso nomear conforme preferir mas por convenção usamos a palavra get ou set na frente.

>> exemplo:

```java
public class Conta {
    private double saldo;
    private double agencia;
    private int numero;
    private Cliente titular;

    public double getSaldo() {
        return this.saldo;
    }
}
```
