/**
* Ejercicio 11: Realiza un conversor de Kb a Mb.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio11Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CONVERSOR DE Kb a Mb ***\n\n");
    System.out.print("Por favor, inserte los Kb a convertir: ");
    
    double kb = s.nextDouble();
    double conversion = kb*0.001;

    System.out.println("El total en Mb son: " + conversion + " Mb");
  } 
}
