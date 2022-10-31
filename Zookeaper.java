import java.util.Scanner;

public class Zookeaper {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        try{


            
            while (!salir) {
                System.out.println("BIENVENIDO AL MENU DE INICIO");
                System.out.println("1-");
                System.out.println("2-");
                System.out.println("3-");
                System.out.println("4-");
                System.out.println("salir");
    
                System.out.println("Introduce un numero");
                opcion = sn.nextInt();
    
                switch (opcion) {
                    case 1:
                        System.out.println("opcion 1");
                        break;
                    case 2:
                        System.out.println("opcion 2");
                        break;
                    case 3:
                        System.out.println("opcion 3");
                        break;
                    case 4:
                        System.out.println("opcuion 4");
                        break;
                    case 5:
                        salir=true;
                        System.out.println("salir");
                        break;
                    default:
                        System.out.println("opcion no valida");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            sn.next();
        }
    }
}
