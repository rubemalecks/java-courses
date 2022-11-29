package classes;
public class Funcionario {
    private String nome;
    private Object prox;



    public Funcionario(Object prox){
        this.prox = prox;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
