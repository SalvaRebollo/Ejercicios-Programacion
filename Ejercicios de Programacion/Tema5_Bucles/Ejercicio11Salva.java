/**
 * Ejercicio 11: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de 
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Salvador Rebollo Benítez
*/
public class Ejercicio11Salva {
  public static void main(String[] args) {
    
   System.out.print("Introduzca un número: ");
   int numeroIntroducido = Integer.parseInt(System.console().readLine());

   for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
    System.out.println ("Número               Cuadrado^2               Cubo^3");
    System.out.println ("-------------------------------------------------------");
    System.out.printf("%d %21d %25d\n\n\n", i, i * i, i * i * i);
    }
  }
}
