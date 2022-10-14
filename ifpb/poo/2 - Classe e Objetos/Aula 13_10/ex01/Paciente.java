public class Paciente {

    public Paciente(int CPF, String nome, float peso, float altura) {
        this.CPF = CPF;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    private int CPF;
    private String nome;
    private float peso;
    private float altura;

    public int getCPF() {
        return this.CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public float getpeso() {
        return this.peso;
    }

    public void setpeso(float peso) {
        this.peso = peso;
    }

    public float getaltura() {
        return this.altura;
    }

    public void Setaltura(float altura) {
        this.altura = altura;
    }
}