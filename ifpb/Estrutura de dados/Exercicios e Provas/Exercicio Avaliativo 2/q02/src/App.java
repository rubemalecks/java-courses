import java.util.Scanner;

public class App {

    public static double calcPricUnit(double preco, double peso) {
        return (1000 / peso) * preco;
    }

    public static int posMenor(double[] vetorValores) {
        int pos = 0;
        double menor = 0;

        for (int i = 0; i < vetorValores.length; i++) {
            if (i == 0 || vetorValores[i] < menor) {
                menor = vetorValores[i];
                pos = i;
            }
        }
        return pos;
    }

    public static int pesoTot(double[] pesos) {
        int soma = 0;
        for (int i = 0; i < pesos.length; i++) {
            soma += pesos[i];
        }
        return soma;
    }

    public static double pedidoTot(double[] precos) {
        double soma = 0;
        for (int i = 0; i < precos.length; i++) {
            soma += precos[i];
        }
        return soma;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o total de doces comprados: ");
        int qtd_doces = entrada.nextInt();
        double[] pesos = new double[qtd_doces];
        double[] precos = new double[qtd_doces];
        double[] precosUnitarios = new double[qtd_doces];

        for (int i = 0; i < qtd_doces; i++) {
            System.out.println("Doce " + (i + 1));
            System.out.print("Informe o Peso (g):");
            pesos[i] = entrada.nextDouble();
            System.out.print("Informe o Preço (R$): ");
            precos[i] = entrada.nextDouble();
            precosUnitarios[i] = calcPricUnit(precos[i], pesos[i]);
            System.out.printf("Preço unitário calculado = R$%.2f/kg\n", precosUnitarios[i]);
        }
        System.out.printf("\nProduto mais barato: Doce %d, R$%.2f/kg\n", posMenor(precosUnitarios) + 1,
                precosUnitarios[posMenor(precosUnitarios)]);
        System.out.printf("Foram comprados %dg de doce por R$%.2f", pesoTot(pesos), pedidoTot(precos));
        entrada.close();


    }
}
