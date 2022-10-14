public class Consulta {
    public static void main(String[] args) {
        Medico Medico_Consulta = new Medico(2671, "Pedro Lopes", "Cardiologista");

        Paciente pac01 = new Paciente(181787311, "Maria das Graças", 85.0, 1.80);

        Paciente pac02 = new Paciente(989218911, "Caio Simplicio", 65.0, 1.60);

        System.out.printf("O medico %s vai atender os pacientes: ", Medico_Consulta.getNome());
        System.out.println("\n ~ " + pac01.getnome());
        System.out.println(" ~ " + pac02.getnome());
    }

}
