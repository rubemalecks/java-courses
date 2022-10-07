import java.util.Scanner;

public class q004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome completo: ");
        String nome = input.nextLine();
        nome = nome.toUpperCase();
        
        String nomef = nome.replace("MEDEIROS", "SIQUEIRA");
        System.out.print("Nome: "+ nomef); 

    }

}