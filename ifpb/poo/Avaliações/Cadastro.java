public class Cadastro {
    // atributos / características
    String nome;
    String sexo;
    String senha;
    String profissao;
    String habilidades;
    int idade;

    // metodos

    boolean confere_Senha(String password) {
        if (password.equals("12345")) {
            return true;
        } return false;  
        }
    int aposentadoria(int idade) {
        if (this.sexo.startsWith("M") || this.sexo.startsWith("m")){
            return 2022 + (65  - idade); 
        } else{
            return 2022 + (60 - idade);
        }
    }


}
