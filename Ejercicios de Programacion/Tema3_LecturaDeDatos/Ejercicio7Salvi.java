/**
* Ejercicio 7: Escribe un programa que calcule el total de una factura a partir de la base imponible.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio7Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CALCULADORA DE IVA ***\n\n");
    System.out.print("Por favor, inserta la base imponible (puede contener decimales): ");
    
    double baseimp = s.nextDouble();
    
    double total = (baseimp + baseimp*21/100);
    
    System.out.println("\n - El total de esta factura (con IVA) es: " + total + "€");
  }
}
