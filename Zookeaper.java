import java.util.Scanner;

public class Zookeaper {
    public static void main(String[] args) {
        menuingreso();
    }

    public static void menuingreso(){
        Scanner sn = new Scanner(System.in);
        String auxiliar;
        String contraseña;
        int intentoContraseña;
        System.out.println("-----------Inicio-------------");
		System.out.println("Bienvenido al Zoo");
		System.out.println("");
		System.out.println("----------Cuenta--------------");
        do{
            System.out.println("Ingrese la contraseña para el personal");
            auxiliar= sn.nextLine();
            contraseña="contraseña";
        }while(!contraseña.equals(auxiliar));
        System.out.println("ADMINISTRACION");

        // do{
        //     if(contraseña.equals(auxiliar)){
        //         System.out.println("");
        //     }
        // }

    
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
