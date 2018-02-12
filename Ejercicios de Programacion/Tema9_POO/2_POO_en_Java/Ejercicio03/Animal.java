package tema9POO.Ejercicio03;

public abstract class Animal {
 //ATRIBUTOS
  protected String nombre;
  protected int edad;
  protected Sexo sexo;
  
 //CONSTRUCTORS
  public Animal () {
    sexo = Sexo.MACHO; //Si no se pone ningun atributo, sera por defecto MACHO
  }
  
  public Animal (Sexo s){
    this.sexo = s; //Al registrar un animal: new Animal(Sexo.MACHO/HEMBRA/HERMAFRODITA)
  }
  
  public Animal (String n, int e, Sexo s){
    this.nombre = n;
    this.edad = e;
    this.sexo = s;
  }
  
  public Animal (String n, Sexo s){
    this.nombre = n;
    this.sexo = s;
  }
  
 //GETTERS
  public Sexo getSexo() {
    return this.sexo;
  }
 //TO STRING
  public String toString() {
    return "Nombre: " + this.nombre + "\nSexo: " + this.sexo + "\nEdad: " + this.edad ;
  }
  
 //METODOS ESPECIFICOS///////////////
  /**
   * El animal puede dormir
   */
  public void duerme() {
    System.out.println("Duerme profundamentZzZzZz...");
  }
  
  /**
   * El animal puede comer
   */
  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }
  
  /**
   * El animal puede nacer
   */
  public void nace() {
    System.out.println("Ostia, acabo de nacer tío.");
  }
  
  /**
   * El animal puede morir
   */
  public void muere() {
    System.out.println("Ugh... Llegó mi hora... Adios.");
  }
  
  /**
   * El animal puede orinar
   */
  public void orina() {
    System.out.println("Que bien me quedé! Deposito vaciado.");
  }
  
  

  
  
}//class Animal
