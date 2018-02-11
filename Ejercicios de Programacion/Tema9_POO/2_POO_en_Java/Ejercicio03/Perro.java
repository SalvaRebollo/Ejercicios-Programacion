package tema9POO.Ejercicio03;

public class Perro extends Mamifero {
 //CONSTRUCTORS
  public Perro(String n, int e, Sexo s) {
    super(n, e, s);
  }
  
  public Perro(String n, Sexo s) {
    super();
  }
  
  public Perro(Sexo s) {
    super(s);
  }
  
 //METODOS ESPECIFICOS
  public void ladra(){
    System.out.println("WAUF! GUAGUAU!");
  }
  
  public void corre(){
    System.out.println("Estoy corriendo por el campo!");
  }
  
  public void hacerElMuerto(){
    System.out.println("*Haciendose el muerto*");
  }
  
  public void caza(){
    System.out.println("Tengo hambre, asi que estoy cazando algo.");
  }

}//Perro
