/**
 * Ejercicio 12: Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) 
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para 
 * convertir un entero en un carácter.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio12Salva {
  public static void main (String[] args) 
    throws InterruptedException { //Esto debe estar escrito antes de escribir un Thread.sleep()
    
    for (int i = 1; i <= 100000 ; i++){
      int numeroAscii = ((int)(Math.random() * 95)+32);
      System.out.print("\033[32m");
      System.out.print((char)numeroAscii);
    
      Thread.sleep(10);
    }
    
    
  }
}
