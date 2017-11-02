/**
 * Ejercicio 25: Realiza un programa que pida un número por teclado y que luego muestre ese 
 * número al revés.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio25Salva {
  public static void main (String[] args) {
    
    System.out.println("Introduzca un número y te lo mostraré al reves =) :");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numero=numeroIntroducido;
    int numeroDelReves=0;
    
    do{
      numeroDelReves = (numeroDelReves * 10) + (numero % 10);
      numero /= 10;
      
    } while(numero>0);
    
    System.out.println("\n" + numeroIntroducido + " del reves, se lee así: " + numeroDelReves);
        
  }
}
