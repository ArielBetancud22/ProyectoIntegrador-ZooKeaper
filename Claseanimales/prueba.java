package Claseanimales;
import java.util.Scanner;


public class prueba {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Claseanimales arr[]={new Claseanimales("Elefantes", "Vegetacion,arbusto y corteza",10), new Claseanimales("Jirafas","Vegetacion de acacia",4),new Claseanimales("Rinocerontes","Frutos y arbustos",5),
        new Claseanimales("Hipopotamo","Pastura fresca",7),new Claseanimales("Tigres","carne",3),new Claseanimales("Osos","Vegetacion,raices,miel,bayas y pescado",6),
        new Claseanimales("Lemures","Fruta, hojas e insectos",11),new Claseanimales("Impalas","Vegetacion de acacia y hierba",13),new Claseanimales("Maras","Gramineas y hierba",19)};

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
       
}
