
public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int agencia) {

        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        // TODO Auto-generated method stub
        return super.saca(valor + 0.20);
    }
}
