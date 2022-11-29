package classes;

public class listaLigada {
    private Funcionario prox = null;
    private int totFunc = 0;
    private Object primeiro = null;

    
    public Funcionario getProx() {
        return prox;
    }
    public void setProx(Funcionario prox) {
        this.prox = prox;
    }
    public int getTotFunc() {
        return totFunc;
    }
    public void setTotFunc(int totFunc) {
        this.totFunc = totFunc;
    }
    public Object getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Object primeiro) {
        this.primeiro = primeiro;
    }

    
    
}
