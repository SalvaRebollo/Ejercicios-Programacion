/**
 * Ejercicio 22: Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio22Salva {
  public static void main (String[] args) {

    System.out.println("Los números primos comprendidos entre 2 y 100 son: \n\n");
    
    int n;
    int i;
    boolean primo = true;
      

    for (n = 2; n <= 100; n++) {
      
      primo = true;
      for (i = 2; i < n; i++) {
        
        if (n % i == 0) {
          primo = false;
        }
      }

      if (primo) {
        System.out.print(n + " ");
      }
    }

  }
}
