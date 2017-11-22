/**
 * Ejercicio 1: Escribe un programa que muestre la tirada de tres dados. 
 * Se debe mostrar también la suma total (los puntos que suman entre los
 * tres dados).
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio01Salva {
  public static void main (String[] args) {
    
    //hasta 5.9999..., pero como le pongo +1 llega a 6, 
    //el motivo de poner 6 y el +1 en vez de 7 directamente
    //es evitar que salga 0, ya que si sale 0, se le sumara 1.
      int dado1 = ((int)(Math.random() * 6)+ 1); 
      int dado2 = ((int)(Math.random() * 6)+ 1);
      int dado3 = ((int)(Math.random() * 6)+ 1);
      
      System.out.println("Los resultados en los dados son: "+dado1+", "+dado2+" y "+dado3+".");
      
      System.out.println("Su suma hace un total de: " + (dado1+dado2+dado3) + ".");
    
    
  }
}
