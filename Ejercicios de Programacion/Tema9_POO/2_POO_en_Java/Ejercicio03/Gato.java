package tema9POO.Ejercicio03;

public class Gato extends Mamifero {

  //CONSTRUCTORS
  public Gato(String n, int e, Sexo s) {
    super(n, e, s);
  }

  public Gato(String n, Sexo s) {
    super();
  }

  public Gato(Sexo s) {
    super(s);
  }

  //METODOS ESPECIFICOS
  public void maulla() {
    System.out.println("MAU MAUW MEOOW");
  }

  public void limpia() {
    System.out.println("Me froto con mis zarpitas en el hocico, que limpito estoy.");
  }

  public void ronronea() {
    System.out.println("*brrrrrrrrr brrrr...*");
  }

  public void holgazanea() {
    System.out.println("Ummm... Me gusta rodar por la mantita...");
  }

}//Gato
