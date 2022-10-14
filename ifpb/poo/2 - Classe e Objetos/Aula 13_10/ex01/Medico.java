public class Medico {

    public Medico(int CRM, String Nome, String Especialidade) {
        this.CRM = CRM;
        this.Nome = Nome;
        this.Especialidade = Especialidade;
    }

    private int CRM;
    private String Nome;
    private String Especialidade;

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }
}
