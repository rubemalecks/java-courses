public class Paciente {

    public Paciente(int CPF, String nome, double peso, double altura) {
        this.CPF = CPF;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    private int CPF;
    private String nome;
    private double peso;
    private double altura;

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

    public double getpeso() {
        return this.peso;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public double getaltura() {
        return this.altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }
}