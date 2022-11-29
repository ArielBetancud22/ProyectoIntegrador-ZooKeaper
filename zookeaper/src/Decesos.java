public class Decesos {
    //Atributos de la clase (Caracteristicas)
    public String especie;
    public int cantidad;
    /**
   * @param esp
   * @param ali
   * @param can
   * @param horario
   */
  public Decesos(String esp, int hs)
    {
        especie=esp;
        cantidad=hs;
    }
    @Override
    public String toString() {
        return "Los recintos de los "+especie+" "+ cantidad+1;
    }
}
