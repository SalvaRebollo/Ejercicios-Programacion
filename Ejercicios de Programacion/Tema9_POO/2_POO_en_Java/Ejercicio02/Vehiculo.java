package tema9POO.Ejercicio02;

public abstract class Vehiculo {
  //ATRIBUTOS DE CLASE

  private static int kmTotales = 0;
  private static int vehiculosCreados = 0;

  //ATRIBUTOS DE INSTANCIA
  private int kmRecorridos;

  //CONSTRUCTORS
  public Vehiculo() {
    this.kmRecorridos = 0;
    Vehiculo.vehiculosCreados++;
  }

  //GETTERS
  public static int getKmTotales() {
    return Vehiculo.kmTotales;
  }

  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }

  public int getKmRecorridos() {
    return this.kmRecorridos;
  }

  //SETTERS
  public void setKmRecorridos(int kmR) {
    this.kmRecorridos = kmR;
  }

  //METODOS ESPECIFICOS//////////////////////////////////////////////////////////
  /**
   * El vehiculo recorre cierta distancia y se suma a su cuenta-kilometros.
   *
   * @param km kilómetros que recorrer
   */
  public void recorre(int km) {
    this.kmRecorridos += km;
    Vehiculo.kmTotales += km;
  }

}//class Vehiculo
