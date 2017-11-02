/**
 * Ejercicio 24: Escribe un programa que lea un número n e imprima una pirámide de números 
 * con n filas como en la siguiente figura:
 *     1
 *    121
 *   12321
 *  1234321
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio24Salva {
  public static void main (String[] args) {

   
    int alturaIntroducida;
    do{
        System.out.print("Por favor, introduzca la altura de la piramide (menor que 10): ");
        alturaIntroducida = Integer.parseInt(System.console().readLine()); //10
      }while(alturaIntroducida >= 10);
    
    
    int alturaVar = 1;
    int espacios = (alturaIntroducida -1); //9
    int i;
    
    while (alturaVar <= alturaIntroducida) {
     
      //Pinta espacio
      
      for (i = 1; i <= espacios; i++) {
        
        System.out.print(" ");
      }
      
      //Pinta numeros
      
      for (i = 1; i < alturaVar; i++) {
          
        System.out.print(i);
      }
      
      for (i = alturaVar; i > 0; i--) {
        System.out.print(i);
      }
      
      //Pinta nueva línea
      System.out.println();

      //Pone a raya a los bucles
      alturaVar++;
      espacios--;
        
    }
      

  }
}
