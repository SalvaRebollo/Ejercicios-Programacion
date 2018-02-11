package tema9POO.Ejercicio01;
/**
 * Ejercicio 01: Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Salvador Rebollo Benitez
 */
public class PruebaCaballo {
  public static void main(String[] args) {
    
    Caballo a = new Caballo("Galan", "blanco", 6, 24);
    Caballo l = new Caballo("Coral", "marron", 8, 61);
    
    System.out.println("Hola, me llamo " + a.getNombre());
    a.salta();
    a.come();
      
    System.out.println("Hola, yo soy " + l.getNombre());
    l.come();
    l.relincha();
  }
}
