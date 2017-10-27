/**
 * Ejercicio 8: Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Salvador Rebollo Benítez
*/
public class Ejercicio08Salva {
  public static void main(String[] args) {
    
    System.out.print("**TABLAS DE MULTIPLICAR**\n\n");
    
    System.out.println("Por favor inserte un número del que ver su tabla de multiplicar: ");
    int numeroIntroducido=Integer.parseInt(System.console().readLine());
    
    for(int i=0; i<=10; i++){
      System.out.println(numeroIntroducido + " * "+ i +" = " + (numeroIntroducido*i));
    }
  }
}
