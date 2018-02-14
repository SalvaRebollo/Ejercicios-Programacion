package tema9POO.Ejercicio03;

public class Canario extends Ave {

//CONSTRUCTORS
  public Canario(String n, int e, Sexo s) {
    super(n, e, s); //NOMBRE EDAD SEXO
  }

  public Canario(String n, Sexo s) {
    super(n, s); //NOMBRE SEXO
  }

  public Canario(Sexo s) {
    super(s); //SEXO
  }

  public Canario(String n, Sexo s, String p) {
    super(n, s, p); //NOMBRE SEXO PLUMAJE
  }

  public Canario(String n, int e, Sexo s, String p) {
    super(n, e, s, p); //NOMBRE EDAD SEXO PLUMAJE
  }

  //METODOS ESPECIFICOS
  public void alimentarCrias() {
    System.out.println("Aqui teneis enjendros, lombriz de primera calidad!");
  }

  public void vuela() {
    System.out.println("Soy una AVE-oneta, mira como vuelo!");
  }

  public void migra() {
    System.out.println("VAMONOH CON LA MUSIKA A OTRA PARTE.");
  }

}//Canario
