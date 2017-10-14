/**
* Ejercicio 6: Escribe un programa que calcule el área de un triángulo.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio6Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CALCULADORA AREA DE TRIÁNGULOS ***\n\n");
    System.out.print("Por favor, inserta dos cifras (pueden tener decimales) separadas por espacio: ");
    
    double valor1 = s.nextDouble();
    double valor2 = s.nextDouble();
    
    double area = ((valor1 * valor2) / 2);
    
    System.out.println("\n - El área de este triángulo es " + area);
  }
}
