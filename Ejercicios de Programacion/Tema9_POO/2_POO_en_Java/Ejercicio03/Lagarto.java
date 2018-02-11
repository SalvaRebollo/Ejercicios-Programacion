package tema9POO.Ejercicio03;

public class Lagarto extends Animal {
 //CONSTRUCTORS
  public Lagarto(String n, int e, Sexo s) {
    super(n, e, s); //NOMBRE EDAD SEXO
  }
  
  public Lagarto(String n, Sexo s) {
    super(n, s); //NOMBRE SEXO
  }
  
  public Lagarto(Sexo s) {
    super(s); //SEXO
  } 
  
 //METODOS ESPECIFICOS
  public void cazarInsecto(String comida) {
    System.out.println("ESTIRO LA LENGUA Y... ¡ZAS! TE CACÉ " + comida + "!!");
  }
  
  public void tomarElSol() {
    System.out.println("Que calorcito más bueno");
  }
  
  public void mudarPiel() {
    System.out.println("Hemos pasado buenos momentos juntos, piel.");
  }
  


}//Lagarto
