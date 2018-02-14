package tema9POO.Ejercicio02;

public class Coche extends Vehiculo {
  //ATRIBUTOS ESPECIFICOS

  private int cilindrada; //Se representan en cm cubicos.

  //CONSTRUCTORS
  public Coche(int c) {
    super();
    this.cilindrada = c;
  }

  //METODOS ESPECIFICOS
  public void acelerar() {
    System.out.println("Pisando a fondo el acelerador");
  }
}//Coche
