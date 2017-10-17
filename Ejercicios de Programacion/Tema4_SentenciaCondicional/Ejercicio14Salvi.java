/**
 * Ejercicio 14: Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 * 
 * @author Salvador Rebollo Benítez
*/

public class Ejercicio14Salvi {
  public static void main(String[] args) {
    
    System.out.println("***¿ES TU NÚMERO DIVISIBLE ENTRE 2 ó 5?***\n");
    System.out.print("Introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());

    if ((n % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  
  }
}
