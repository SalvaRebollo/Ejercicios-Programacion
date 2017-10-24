/**
 * Ejercicio 7: Realiza el control de acceso a una caja fuerte. La combinación será un 
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Salvador Rebollo Benítez
*/
public class Ejercicio07Salva {
  public static void main(String[] args) {
    
    int intentos = 4;
    int claveIntroducida;
    boolean acertada = false;
    
    System.out.println("*** MEGA CAJA FUERTE ***\n");
    
    do{
      System.out.println("Por favor introduzca la clave de seguridad (XXXX): ");
      claveIntroducida = Integer.parseInt(System.console().readLine());
      
      if (claveIntroducida==7117){
        acertada=true;
      } else{
        System.out.print("Clave no válida, por favor intentalo de nuevo.\n\n");
      }
      intentos--;
    } while((intentos > 0) && (!acertada));
    
    if(acertada){
      System.out.print("YOU WIN THIS TIME, CAJA ABIERTA MA' MEN.");
    } else{
      System.out.print("Demasiados intentos, operación cancelada por desfase herman@, ¿4 intentos?, eres retromonguer tí@.");
    }
  }
}
