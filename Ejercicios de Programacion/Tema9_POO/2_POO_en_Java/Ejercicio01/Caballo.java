package tema9POO.Ejercicio01;

public class Caballo {

  private String nombre;
  private String color;
  private String raza;
  private int edad;
  private int carrerasGanadas;
  private double peso;

  Caballo(String n, String c, int e, int cg) {
    this.nombre = n;
    this.color = c;
    this.edad = e;
    this.carrerasGanadas = cg;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void come() {
    System.out.println("*Estoy comiendo*");
  }

  public void salta() {
    System.out.println("Mira como salto");
  }

  public void cabalga() {
    System.out.println("*Estoy cabalgando*");
  }

  public void relincha() {
    System.out.println("*Relincho*");
  }

}//class Caballo
