package tema9POO.Ejercicio03;

public class Pinguino extends Ave {
 //CONSTRUCTORS
  public Pinguino(String n, int e, Sexo s) {
    super(n, e, s); //NOMBRE EDAD SEXO
  }
  
  public Pinguino(String n, Sexo s) {
    super(n, s); //NOMBRE SEXO
  }
  
  public Pinguino(Sexo s) {
    super(s); //SEXO
  }

  public Pinguino(String n, Sexo s, String p) {
    super(n, s, p); //NOMBRE SEXO PLUMAJE
  }

  public Pinguino(String n, int e, Sexo s, String p) {
    super(n, e, s, p); //NOMBRE EDAD SEXO PLUMAJE
  }
  
  
 //METODOS ESPECIFICOS
  public void cuentame() {
    System.out.println("Te contare un secreto: Soy el logotipo del mayor software Open Source jamás existido.");
  }
  
  public void nada() {
    System.out.println("Glu glu");
  }
  
  public void reflexionar() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("¿Algún día encontrare una pinguinilla?");
    } else {
      System.out.println("¿Algún día encontraré un pinguinillo?");
    }
    
  }

}//Pinguino
