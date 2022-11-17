public class Main {
    public static void main(String[] args) throws Exception {
        Ave ave1 = new Ave();
        ave1.setNome("Pardal");
        ave1.setFamilia("Passeridae");
        ave1.setPeso(30);
        ave1.setAltura(17);
        ave1.setTempoVoo(5);

        Inseto inseto1 = new Inseto();
        inseto1.setNome("Louva-a-deus");
        inseto1.setFamilia("Matidae");
        inseto1.setPeso(0.10);
        inseto1.setAltura(13);
        inseto1.setNumAntenas(2);
        inseto1.setNumPatas(6);

        Inseto inseto2 = new Inseto();
        inseto2.setNome("Joaninha");
        inseto2.setFamilia("Coccinellidae");
        inseto2.setPeso(0.021);
        inseto2.setAltura(0.05);
        inseto2.setNumAntenas(2);
        inseto2.setNumPatas(6);

        System.out.println("\n=================================\n");

        System.out.println("Animal: " + ave1.getNome());
        System.out.println("Familia: " + ave1.getFamilia());
        System.out.println("Peso: " + ave1.getPeso() + "g");
        System.out.println("Altura: " + ave1.getAltura() + "cm");
        System.out.println("Tempo de Voo: " + ave1.getTempoVoo());

        System.out.println("\n=================================\n");

        System.out.println("Animal: " + inseto1.getNome());
        System.out.println("Familia: " + inseto1.getFamilia());
        System.out.println("Peso: " + inseto1.getPeso() + "g");
        System.out.println("Altura: " + inseto1.getAltura() + "cm");
        System.out.println("Antenas: " + inseto1.getNumAntenas());
        System.out.println("Patas: " + inseto1.getNumPatas());

        System.out.println("\n=================================\n");

        System.out.println("Animal: " + inseto2.getNome());
        System.out.println("Familia: " + inseto2.getFamilia());
        System.out.println("Peso: " + inseto2.getPeso() + "g");
        System.out.println("Altura: " + inseto2.getAltura() + "cm");
        System.out.println("Antenas: " + inseto2.getNumAntenas());
        System.out.println("Patas: " + inseto2.getNumPatas());

        System.out.println("\nAo todo foram inscritos: " + Animal.getNumAnimais() + " animais.");
    }
}
