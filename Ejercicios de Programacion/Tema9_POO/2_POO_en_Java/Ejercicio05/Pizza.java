package tema9POO.Ejercicio05;

public class Pizza {
  //ATRIBUTOS DE CLASE

  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  //ATRIBUTOS DE INSTANCIA
  private Tipo tipo;
  private Tamanio tamanio;
  private Estado estado;

  //CONSTRUCTORS
  public Pizza(Tipo tip, Tamanio tam) {
    this.tipo = tip;
    this.tamanio = tam;
    this.estado = Estado.PEDIDA; //Sera por defecto PEDIDA
    Pizza.totalPedidas++;
  }

  //GETTERS
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  //SETTERS
  //TO STRING
  public String toString() {
    return "\nPizza: " + this.tipo + "\nTamaño: " + this.tamanio + "\nEstado: " + this.estado;
  }
  //METODOS ESPECIFICOS//////////////////////////////////////////////////////////

  /**
   * La pizza se puede servir, realizar la accion hace que: Su tipo pasa de
   * estado PEDIDA a SERVIDA e incrementa en 1 el total de SERVIDAS y decrementa
   * en 1 el total de PEDIDAS.
   *
   * @param km kilómetros que recorrer
   */
  public void sirve() {
    this.estado = estado.SERVIDA;
    Pizza.totalPedidas--;
    Pizza.totalServidas++;
  }

}//class Pizza

