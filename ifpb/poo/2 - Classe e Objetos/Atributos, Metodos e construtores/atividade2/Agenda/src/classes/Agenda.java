package classes;

import classes.Contato;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> meusContatos = new ArrayList<Contato>();

    public void addcontato(Contato c) {
        if (meusContatos.size() < 10) {
            meusContatos.add(c);
        }
    }

    // get
    public ArrayList<Contato> getMeusContatos() {
        return meusContatos;
    }

}
