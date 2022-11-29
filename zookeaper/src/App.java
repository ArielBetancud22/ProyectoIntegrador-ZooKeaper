import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        menuingreso();
        Claseanimales();
    }

    /**
     * 
     */
    public static void menuingreso() {
        Scanner sn = new Scanner(System.in);
        String auxiliar;
        String contraseña;
        boolean salir = false;
        int intentoContraseña = 0;
        System.out.println("-----------Inicio-------------");
        System.out.println("Bienvenido al Zoo");
        System.out.println("");
        System.out.println("----------Cuenta--------------");
        do {
            System.out.println("Ingrese la contraseña para el personal");
            auxiliar = sn.nextLine();
            intentoContraseña++;
            contraseña = "pay";
            if (intentoContraseña >= 4) {
                System.out.println("Ingreso erroneamente la contraseña demasiadas veces");
                salir = true;
                break;
            }
        } while (!contraseña.equals(auxiliar));

        do {
            if (contraseña.equals(auxiliar)) {
                administracion();
            }
        } while (salir != true);
    }

    public static void administracion() {
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("ADMINISTRACION");
            System.out.println("BIENVENIDO AL MENU DE INICIO");
            System.out.println("Seleccione una opcion del menu");
            System.out.println("1-Novedades");
            System.out.println("2-Ingresar a su turno");
            System.out.println("3-Visitas veterinarias");
            System.out.println("4-Salir");
            System.out.println("Introduce un numero");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    novedades();
                    break;
                case 2:
                    turnos();
                    break;
                case 3:
                    visitas();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (salir != true);
    }

    public static void novedades() {
        System.out.println("No hay novedades");
        NovedadesMetodo();
    }

    public static void turnos() {
        int opcion;
        Scanner sn = new Scanner(System.in);
        System.out.println("---------Turnos-------------");

        System.out.println("Bienvenido a su turno");
        System.out.println("");
        System.out.println("Seleccione turno: ");
        System.out.println("1. Turno Matutino");
        System.out.println("2. Turno Tarde");
        System.out.println("3. Turno Noche");
        System.out.println("4- Salir");
        opcion = sn.nextInt();

        if (opcion == 1) {
            System.out.println("Turno matutino");
            Claseanimales();
        }
        if (opcion == 2) {
            System.out.println("Turno tarde");
            TTarde();
        }
        if (opcion == 3) {
            System.out.println("Turno noche");
            TNoche();
        }
        if (opcion == 4) {
            administracion();
        }
    }

    public static void visitas() {
        System.out.println("------------Visitas Veterinarias----------");
        System.out.println(
                "Las visitas de chequeo son organizadas de forma azarosa,la proxima vista del veterinario sera a ver a los osos");
        System.out.println("");
        System.out.println("Para una visita de emergencia dirijase al veterinario 24 hrs en el tablero de emergencias");
        System.out.println("");
    }

    public static void Claseanimales() {

        TurnoMatutino arr[] = {
                new TurnoMatutino("Elefantes", "Vegetacion,arbusto y corteza", 10,8),
                new TurnoMatutino("Jirafas", "Vegetacion de acacia", 4,9),
                new TurnoMatutino("Rinocerontes", "Frutos y arbustos", 5,9),
                new TurnoMatutino("Hipopotamo", "Pastura fresca", 7,10), new TurnoMatutino("Tigres", "carne", 3,9),
                new TurnoMatutino("Osos", "Vegetacion,raices,miel,bayas y pescado", 6,8),
                new TurnoMatutino("Lemures", "Fruta, hojas e insectos", 11,9),
                new TurnoMatutino("Impalas", "Vegetacion de acacia y hierba", 13,10),
                new TurnoMatutino("Maras", "Gramineas y hierba", 19,7) };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void TTarde() {

        TurnoTarde arr[] = {
                new TurnoTarde("Elefantes", "Vegetacion,arbusto y corteza", 10,13),
                new TurnoTarde("Jirafas", "Vegetacion de acacia", 4,14),
                new TurnoTarde("Rinocerontes", "Frutos y arbustos", 5,14),
                new TurnoTarde("Hipopotamo", "Pastura fresca", 7,12), new TurnoTarde("Tigres", "carne", 3,12),
                new TurnoTarde("Osos", "Vegetacion,raices,miel,bayas y pescado", 6,14),
                new TurnoTarde("Lemures", "Fruta, hojas e insectos", 11,13),
                new TurnoTarde("Impalas", "Vegetacion de acacia y hierba", 13,12),
                new TurnoTarde("Maras", "Gramineas y hierba", 19,13) };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void TNoche() {

        TurnoNoche arr[] = {
                new TurnoNoche("Elefantes", "Vegetacion,arbusto y corteza", 10,13),
                new TurnoNoche("Jirafas", "Vegetacion de acacia", 4,14),
                new TurnoNoche("Rinocerontes", "Frutos y arbustos", 5,14),
                new TurnoNoche("Hipopotamo", "Pastura fresca", 7,12), new TurnoNoche("Tigres", "carne", 3,12),
                new TurnoNoche("Osos", "Vegetacion,raices,miel,bayas y pescado", 6,14),
                new TurnoNoche("Lemures", "Fruta, hojas e insectos", 11,13),
                new TurnoNoche("Impalas", "Vegetacion de acacia y hierba", 13,12),
                new TurnoNoche("Maras", "Gramineas y hierba", 19,13) };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void NovedadesMetodo() {

        int opcion;
        Scanner sn = new Scanner(System.in);
        System.out.println("---------Novedades-------------");

        System.out.println("Nacimientos-Decesos");
        System.out.println("");
        System.out.println("Seleccione su opcion: ");
        System.out.println("1. Nacimientos");
        System.out.println("2. Decesos");
        System.out.println("3. Ver Inventario");
        opcion = sn.nextInt();

        if (opcion == 1) {
            System.out.println("Nacimientos");
                 }
        if (opcion == 2) {
            System.out.println("Decesos");
         
        }
        if (opcion == 3) {
            System.out.println("Inventario");
         
        }

    }
}
