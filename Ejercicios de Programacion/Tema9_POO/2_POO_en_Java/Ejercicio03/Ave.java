package tema9POO.Ejercicio03;

/**
 *
 * @author Salva
 */
public abstract class Ave extends Animal {
 //ATRIBUTOS ESPECIFICOS
  private String plumaje;
  
 //CONSTRUCTORS
  public Ave(String n, Sexo s, String p) {
    super(n, s);
    this.plumaje = p;
  }
  
  public Ave() {
    super();
  }

  public Ave(Sexo s) {
    super(s);
  }

  public Ave(String n, int e, Sexo s) {
    super(n, e, s);
  }

  public Ave(String n, Sexo s) {
    super(n, s);
  }

  public Ave(String n, int e, Sexo s, String p) {
    super(n, e, s);
    this.plumaje = p;
  }
  
  //GETTERS
  public String getPlumaje() {
    return this.plumaje;
  }
  
  //TO STRING
  public String toString() {
    return "Nombre: " + this.nombre + "\nPlumaje: " + this.plumaje + "\nSexo: " + this.sexo + "\nEdad: " + this.edad;
  }
  
 //METODOS ESPECIFICOS
  public void ponerHuevos(){
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("No puedo tener huevos, soy macho.");
    } else if (this.getSexo() == Sexo.HERMAFRODITA) {
        System.out.println("Soy hermafrodita, igualdad, puedo tener crias vale? No es raro!");
      } else {
          System.out.println("Puedo tener huevos");
        }
  }
  
  public void enfada() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Tengo mucho caracter! Ven que te picoteo!!");
    } else {
      System.out.println("Las aves hembra somos mucho más dóciles que los machos.");
    }
  }
  
  public void come() {
    System.out.println("ÑAM ÑAM RICO");
  }
  
}//Ave
