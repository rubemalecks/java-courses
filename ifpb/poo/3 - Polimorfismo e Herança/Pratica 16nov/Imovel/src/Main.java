public class Main {
    public static void main(String[] args) {
        Apartamento ap01 = new Apartamento();
        ap01.setAndar(1);
        ap01.setTamanho(50660);
        ap01.setValor(123333);
        System.out.printf("Opção %d \nAndar: %d\nTamanho: %.2f² \nValor: R$ %.2f", ap01.getCodigo(), ap01.getAndar(),
                ap01.getTamanho(), ap01.getValor());

        System.out.println("\n=====================================");

        Apartamento ap02 = new Apartamento();
        ap02.setAndar(1);
        ap02.setTamanho(7700);
        ap02.setValor(111000);
        System.out.printf("Opção %d \nAndar: %d\nTamanho: %.2f² \nValor: R$ %.2f", ap02.getCodigo(), ap02.getAndar(),
                ap02.getTamanho(), ap02.getValor());

        System.out.println("\n=====================================");

        Casa house1 = new Casa();
        house1.setNumGaragens(3);
        house1.setNumPavimentos(7);
        house1.setTamanho(42000);
        house1.setValor(50000);

        System.out.printf("Opção %d \nTamanho: %.2f² \nGaragens: %d \nPavimentos: %d \nValor: R$ %.2f",
                house1.getCodigo(), house1.getTamanho(), house1.getNumGaragens(), house1.getNumPavimentos(),
                house1.getValor());

    }
}
