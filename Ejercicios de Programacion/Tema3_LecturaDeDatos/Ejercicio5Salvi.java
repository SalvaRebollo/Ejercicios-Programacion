/**
* Ejercicio 5: Escribe un programa que calcule el área de un rectángulo.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio5Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CALCULADORA AREA DE RECTANGULOS Y CUADRADOS ***\n\n");
    System.out.print("Por favor, inserta dos cifras (pueden tener decimales) separadas por espacio: ");
    
    double valor1 = s.nextDouble();
    double valor2 = s.nextDouble();
    
    double area = (valor1 * valor2);
    
    System.out.println("\n - El área de este cuadrilátero es " + area);
  }
}
