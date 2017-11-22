/**
 * Ejercicio 3: Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja 
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio03Salva {
  public static void main (String[] args) {
    
    int palo = ((int)(Math.random() * 4)+ 1);
    String paloString = "";
    
    int numeroPalo = ((int)(Math.random() * 10) + 1);
    String numeroPaloString = "";
    
    switch(palo) {
        case 1:
          paloString = "copas";
          break;
          
        case 2:
          paloString = "oros";
          break;
          
        case 3:
          paloString = "espadas";
          break;
          
        case 4:
          paloString = "bastos";
          break;
          
        default:
          break;
    }
    
    switch(numeroPalo) {
        case 1:
          numeroPaloString = "As";
          break;
          
        case 8:
          numeroPaloString = "sota";
          break;
        
        case 9:
          numeroPaloString = "caballo";
          break;
          
         case 10:
          numeroPaloString = "rey";
          break;
          
        
          
        default:
          numeroPaloString = String.valueOf(numeroPalo);
          break;
    }
    
    System.out.println("Carta aleatoria de baraja española: ");
    System.out.print(numeroPaloString + " de " + paloString + ".");
    
  }
}
