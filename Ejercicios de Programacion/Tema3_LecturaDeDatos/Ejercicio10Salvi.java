/**
* Ejercicio 10: Realiza un conversor de Mb a Kb.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio10Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CONVERSOR DE Mb a Kb ***\n\n");
    System.out.print("Por favor, inserte los Mb a convertir: ");
    
    double mb = s.nextDouble();
    double conversion = mb*1000;

    System.out.println("El total en Kb son: " + conversion + "Kb");
  } 
}
