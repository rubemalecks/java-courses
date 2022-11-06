package alunos;

public class registro {
    // atributos da classe
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    // Construtor
    public registro() {

    }

    public registro(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos da classe
    public double imc() {
        return (peso / altura) * 2;
    }

    public String temDesc(int idade){
        if (idade < 18 ){
            return "Menor de Idade, tem direito a desconto!";
        } return "Maior de idade. Não tem desconto.";
    }

}
