import classes.ListaLigada;

public class App {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();
        
        lista.addNoComeco("Mauricio");
        System.out.println(lista);
        lista.addNoComeco("Paulo");
        System.out.println(lista);
        lista.addNoComeco("Guilherme");
        System.out.println(lista);
    }
}
