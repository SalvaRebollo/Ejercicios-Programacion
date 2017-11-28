/**
 * Ejercicio 6: Escribe un programa que piense un número al azar entre 0 y 100. El usuario 
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento 
 * fallido, el programa dirá cuántas oportunidades quedan y si el número introducido 
 * es menor o mayor que el número secreto.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio06Salva {
  public static void main (String[] args) {
    
    int numeroSecreto = ((int)(Math.random() * 101));
    int oportunidades = 5;
    boolean vivo = true;
    boolean acertado = false;
    
    System.out.println("Intenta adivinar mi numero secreto, esta entre 0 y 100");
    //System.out.println("numero secreto: " + numeroSecreto );
    
    
    do{
      System.out.println("Por favor introduzca un numero");
      int numeroIntroducido=Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido != numeroSecreto){
        //oportunidades--;
        
        if(numeroIntroducido < numeroSecreto){
          System.out.println("El numero secreto es mayor que " + numeroIntroducido);
          }
          
        if(numeroIntroducido > numeroSecreto){
          System.out.println("- El numero secreto es menor que " + numeroIntroducido);
          }
        
        
        
        System.out.println("- Te quedan " + oportunidades + " oportunidades." );
      }
      
      
      
      if (oportunidades == 0){
        vivo = false;
        System.out.println("Lo siento, no lo has acertado, mi numero secreto era el: " + numeroSecreto);
      }
      
      if (numeroIntroducido == numeroSecreto){
          System.out.println("HAS ACERTADO! El numero secreto es: " + numeroSecreto);
          acertado = true;
      }
      
      oportunidades--;
    } while (!acertado && (oportunidades >= 0));
    
    
  }
}
