public class TurnoMatutino {
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
    public TurnoMatutino(String esp, String ali, int can,int hs)
      {
          especie=esp;
          alimentacion=ali;
          cantidad=can;
          horario=hs;
      }
      @Override
      public String toString() {
          return "La primer comida del dia es para los "+especie+" que se alimentan de "+alimentacion+" a las "+horario+" horas";
      }
  
}
