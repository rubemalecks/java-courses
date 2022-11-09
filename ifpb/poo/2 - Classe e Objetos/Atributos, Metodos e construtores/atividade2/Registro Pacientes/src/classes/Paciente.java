package classes;

public class Paciente{
    private String nome;
    private String cpf;
    private String endereco;
    private String rg;
    private String sintomas;

    public Paciente (String novoCpf, String novoNome){
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.endereco = "";
        this.rg = "";
        this.sintomas = "";
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String novossintomas) {
        this.sintomas = novossintomas;
    }

    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getRg() {
        return rg;
    }


    public void setRg(String novorg) {
        this.rg = novorg;
    }

    public String toString(){
        String retorno = "NOME: " + getNome() + "\nCPF " + getCpf();
        if (!getRg().equals(""))
            retorno += "Rg: " + getRg();
        
        if (!getSintomas().equals(""))
            retorno += "Sintomas: " + getSintomas();
        return retorno;
    }

    public boolean equals(Paciente p){
        if (getCpf().equals(p.getCpf()) && getRg().equals(p.getRg())) return true;
        else {return false;}
    }

    



}