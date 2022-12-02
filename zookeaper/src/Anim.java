public class Anim {
    //Atributos de la clase (Caracteristicas)
    public String especie;
    public int cantidad;
    /**
   * @param ali
   * @param can
   */
  public Anim(String esp, int can)
    {
        especie=esp;
        cantidad=can;
    }
    @Override
    public String toString() {
        return "Especie : " + especie + " Cantidad : " + cantidad;
    }
    public void set(int i, int j) {
    }
}
