package classes;


public class Contato {
    private String nome;
    private String celular; // mudar p int
    private String endereco;

    // Construtores 
    public Contato(String nome, String celular, String endereco) {
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
    }

    public Contato(){

    }



    // get and set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Métodos da Classe

    public String toString(){
        String dados = "\n\nNome "  + this.getNome() + "\nCel: " + this.getCelular() + "\nendereco: " + this.getEndereco();
        return dados; 
    }

    public boolean equals(Contato cont){
        if (this.getNome().equals(cont.getNome())&& this.getCelular().equals(cont.getCelular()) && this.getEndereco().equals(cont.getEndereco())){
            return true;
        } return false;
    }
    
}