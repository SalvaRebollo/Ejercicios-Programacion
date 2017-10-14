/**
* Ejercicio 8: Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio8Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CALCULADORA DE SALARIO SEMANAL EN BASE A HORAS TRABAJADAS***\n\n");
    System.out.print("Por favor, inserte las horas trabajadas a la semana del empleado en cuestión: ");
    
    int horas = s.nextInt();
    
    int salario = ((horas*12)*5); //5 días porque son días laborales.
    
    System.out.println("\n - El salario semanal total de este empleado es: " + salario + "€");
    System.out.println("\n - El salario mensual total de este empleado es: " + salario*4 + "€");
  }
}
