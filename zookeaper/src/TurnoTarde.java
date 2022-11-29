public class TurnoTarde {
     //Atributos de la clase (Caracteristicas)
     public String especie;
     public String alimentacion;
     public int cantidad;
     public int horario;
     /**
    * @param esp
    * @param ali
    * @param can
    * @param horario
    */
   public TurnoTarde(String esp, String ali, int can,int hs)
     {
         especie=esp;
         alimentacion=ali;
         cantidad=can;
         horario=hs;
     }
     @Override
     public String toString() {
         return "Debe chequear que los "+especie+" no hayan agotado su racion de "+alimentacion+" a las "+horario+" horas";
     }
}
