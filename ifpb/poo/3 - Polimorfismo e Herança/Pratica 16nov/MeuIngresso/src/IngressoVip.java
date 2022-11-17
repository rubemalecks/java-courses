public class IngressoVip extends Ingresso {
    private double vlrAdicional = 50;

    public double getVlrAdicional() {
        return this.vlrAdicional;
    }

    public void setVlrAdicional(double vlrAdicional) {
        this.vlrAdicional = vlrAdicional;
    }

    @Override
    public double getValor() {
        return super.getValor() + getVlrAdicional();
    }

}
