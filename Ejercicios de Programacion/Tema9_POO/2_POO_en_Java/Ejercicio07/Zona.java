package tema9POO.Ejercicio07;

public class Zona {
  //ATRIBUTOS DE CLASE

  //ATRIBUTOS DE INSTANCIA
  private String nombre;
  private int entradasPorVender;
  

  //CONSTRUCTORS
  public Zona(String n, int e) {
    this.nombre = n;
    this.entradasPorVender = e;
  }

  //TO STRING
  @Override
  public String toString() {
    return " - Para la zona " + this.nombre + " quedan " + this.entradasPorVender + " entradas.\n";
  }

  //GETTERS
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  //SETTERS

  //METODOS ESPECIFICOS/////////////////////////////////////////////////////////
  /**
   * Vende un número de entradas.
   * <p>
   * Comprueba si quedan entradas libres antes de realizar la venta.
   *
   * @param n número de entradas a vender
   */
  public void vender(int n) {

    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
        + " entradas para esa zona.");
    }

    if (this.entradasPorVender >= n) {
      this.entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }

}//class Zona
