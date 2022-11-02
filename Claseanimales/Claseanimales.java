package Claseanimales;

public class Claseanimales {
    //Atributos de la clase (Caracteristicas)
    public String especie;
    public String alimentacion;
    public int cantidad;
    public Claseanimales(String esp, String ali, int can)
    {
        especie=esp;
        alimentacion=ali;
        cantidad=can;
    }
    @Override
    public String toString() {
        return "Especie :" + especie + " Alimentacion :" + alimentacion + " Cantidad de animales :" + cantidad;
    }

}
