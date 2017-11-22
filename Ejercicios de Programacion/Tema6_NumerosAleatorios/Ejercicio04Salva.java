/**
 * Ejercicio 4: Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados 
 * por espacios.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio04Salva {
  public static void main (String[] args) {
    System.out.println("20 numeros aleatorios entre 0 y 10 ");
    
    for (int i = 1; i <= 20 ; i++){
      
      int numero = ((int)(Math.random() * 11));
      System.out.print(numero+" ");
    }
    
  }
}
