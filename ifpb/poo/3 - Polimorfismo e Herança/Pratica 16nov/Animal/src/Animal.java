public class Animal{
    public String nome;
    public String familia;
    public double peso;
    public double altura;
    private static int numAnimais;


    public Animal(){
        numAnimais ++;
    }

    public static int getNumAnimais() {
        return numAnimais;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
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
  

}