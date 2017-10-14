/**
* Ejercicio 4: Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
*
* @author Salvador Rebollo Benítez
*/

import java.util.Scanner;

public class Ejercicio4Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("*** CALCULADORA ALQUÍMICA ***\n");
    System.out.print("todo con epicidad mola más. jeje\n\n");
    System.out.print("Por favor, inserta dos cifras (pueden tener decimales) separadas por espacio: ");
    
    double valor1 = s.nextDouble();
    double valor2 = s.nextDouble();
    
    double suma = (valor1 + valor2);
    double resta = (valor1 - valor2);
    double multiplicacion = (valor1 * valor2);
    double division = (valor1 / valor2);
    
    System.out.println("La suma de las cifras es: " + suma);
    System.out.println("La resta de las cifras es: " + resta);
    System.out.println("La multiplicación de las cifras es: " + multiplicacion);
    System.out.println("La división de las cifras es: " + division);
  } 
}
