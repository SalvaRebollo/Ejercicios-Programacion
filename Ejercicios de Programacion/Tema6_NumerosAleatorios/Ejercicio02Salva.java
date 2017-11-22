/**
 * Ejercicio 2: Realiza un programa que muestre al azar el nombre de una carta de la 
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones, 
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que 
 * sería el 1). Para convertir un número en una cadena de caracteres podemos 
 * usar String.valueOf(n).
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio02Salva {
  public static void main (String[] args) {
    
    int palo = ((int)(Math.random() * 4)+ 1);
    String paloString = "";
    
    int numeroPalo = ((int)(Math.random() * 13) + 1);
    String numeroPaloString = "";
    
    switch(palo) {
        case 1:
          paloString = "picas ♠";
          break;
          
        case 2:
          paloString = "corazones ♥";
          break;
          
        case 3:
          paloString = "diamantes ♦";
          break;
          
        case 4:
          paloString = "treboles ♣";
          break;
          
        default:
          break;
    }
    
    switch(numeroPalo) {
        case 1:
          numeroPaloString = "As";
          break;
          
        case 10:
          numeroPaloString = "10";
          break;
          
        case 11:
          numeroPaloString = "J";
          break;
          
        case 12:
          numeroPaloString = "Q";
          break;
          
        case 13:
          numeroPaloString = "K";
          break;
          
        default:
          numeroPaloString = String.valueOf(numeroPalo);
          break;
    }
    
    System.out.println("Carta aleatoria de baraja francesa: ");
    System.out.print(numeroPaloString + " de " + paloString + ".");
    
  }
}
