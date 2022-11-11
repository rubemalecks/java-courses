package classes;

import java.util.Scanner;
import classes.Contato;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> meusContatos = new ArrayList<Contato>();

    public void addcontato(Contato c) {
        if (meusContatos.size() < 10) {
            meusContatos.add(c);
        }
    }

    public String toString() {
        return "Minha Agenda" + meusContatos.toString().replace("[", "").replace("]", "");
    }

    public void removeContatos(Contato c) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Confirmar Remoção do Contato %s ? [S/N]: ", c.getNome());
        String resp = entrada.nextLine();
        if (resp.equalsIgnoreCase("S")) {
            meusContatos.remove(c);
        } else {
            System.out.println("Remoção Cancelada");
        }

    }
}
