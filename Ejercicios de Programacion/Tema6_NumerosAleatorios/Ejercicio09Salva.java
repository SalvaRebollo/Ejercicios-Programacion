/**
 * Ejercicio 9: Realiza un programa que vaya generando números aleatorios pares entre 0 
 * y 100 y que no termine de generar números hasta que no saque el 24. El 
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio09Salva {
  public static void main (String[] args) {
    
    int random;
    int cantNumerosGenerados=0;
    
    do{
      
      random = ((int)(Math.random() * 101));
      if (random%2==0) {
        System.out.print(random + " ");
        cantNumerosGenerados++;
      }
      
      
      
    } while (random!=24);
    
    System.out.print("\n\n- Se han generado " + cantNumerosGenerados + " numeros pares aleatorios.");
    
    
  }
}
