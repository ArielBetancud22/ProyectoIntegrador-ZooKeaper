package services;

public class Metodos {
    // atributos de la clase(Persona)
    public String nombre;
    public String apellido;

    // Metodos de la clase(acciones)
    public void novedades() {
        System.out.println("No hay novedades");
    }
    public static void turnos() {

        System.out.println("---------Turnos-------------");

        System.out.println("Bienvenido a su turno");
        System.out.println("");
        System.out.println("Seleccione turno: ");
        System.out.println("1. Turno Matutino");
        System.out.println("2. Turno Tarde");
        System.out.println("3. Turno Noche");

        System.out.println("");

    }

    public static void visitas() {
        System.out.println("------------Visitas Veterinarias----------");
        System.out.println(
                "Las visitas de chequeo son organizadas de forma azarosa,la proxima vista del veterinario sera a ver a los osos");
        System.out.println("");
        System.out.println("Para una visita de emergencia dirijase al veterinario 24 hrs en el tablero de emergencias");
        System.out.println("");
    }
}
