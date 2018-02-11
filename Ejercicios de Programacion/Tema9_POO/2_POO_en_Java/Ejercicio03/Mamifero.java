package tema9POO.Ejercicio03;

/**
 *
 * @author Salva
 */
public abstract class Mamifero extends Animal {
  
 //CONSTRUCTORS
  public Mamifero() {
    super();
  }
  public Mamifero(Sexo s) {
    super(s);
  }

  public Mamifero(String n, Sexo s) {
    super(n, s);
  }

  public Mamifero(String n, int e, Sexo s) {
    super(n, e, s);
  }
  
 //TO STRING
  public String toString() {
    return "Nombre: " + this.nombre + "\nSexo: " + this.sexo + "\nEdad: " + this.edad;
  }
  
 //METODOS ESPECIFICOS
  public void tenerCrias(){
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("No puedo tener crías, soy macho.");
    } else if (this.getSexo() == Sexo.HERMAFRODITA) {
        System.out.println("Soy hermafrodita, igualdad, puedo tener crias vale? No es raro!");
      } else {
          System.out.println("Puedo tener crias");
        }
  }
  
  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Mi fisionomia no me ha dotado de buenas mamas para alimentarte :c , soy macho tio.");
    } else {
      System.out.println("A comer! Ven aquí!");
    }
  }
  
  public void anda() {
    System.out.println("Estoy andando");
  }
  
  public void juega() {
    System.out.println("Mira como juego!");
  }
  




}//Mamifero
