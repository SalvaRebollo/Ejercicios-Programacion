package tema9POO.Ejercicio02;
public class Bicicleta extends Vehiculo {
 //ATRIBUTOS ESPECIFICOS
  private int numPinones;
 
//CONSTRUCTORS
  public Bicicleta(int numP) {
    super();
    this.numPinones = numP;
  }
  
  //METODOS ESPECIFICOS
  public void derrapar() {
    System.out.println("Quemo goma, estoy derrapando.");
  }
}//Bicicleta
