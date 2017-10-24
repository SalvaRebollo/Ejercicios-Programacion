/**
 * Ejercicio 5: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 * 
 * @author Salvador Rebollo Benítez
*/
public class Ejercicio05Salva {
  public static void main(String[] args) {
    int numero = 320;
    
    while(numero>160){
      System.out.println(numero-=20);
    }
    
  }
}
