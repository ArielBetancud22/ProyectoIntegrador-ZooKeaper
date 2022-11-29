public class TurnoNoche {
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
    public TurnoNoche(String esp, String ali, int can,int hs)
      {
          especie=esp;
          alimentacion=ali;
          cantidad=can;
          horario=hs;
      }
      @Override
      public String toString() {
          return "Los recintos de los "+especie+" deben estar limpios de  "+alimentacion+" del turno tarde, antes de finalizar su turno a las 6 am";
      }
}
