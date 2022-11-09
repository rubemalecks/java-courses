import classes.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente1 = new Paciente("11100554770", "Messi");
        Paciente paciente2 = new Paciente("77701723477", "Cristiano");

        System.out.println("Pacientes são iguais: " + paciente1.equals(paciente2));

        System.out.println(paciente1.toString());
        System.out.println(paciente2.toString());
    }
}
