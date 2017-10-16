/**
 * Ejercicio 7: Realiza un programa que calcule la media de tres notas.
 * 
 * @author Salvador Rebollo Benítez
*/
import java.util.Scanner;

public class Ejercicio7Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("***CALCULADORA DE 3 MEDIAS***");
    System.out.print("Por favor introduzca las 3 notas separadas por espacio para hacer la media: ");
    
    double nota1 = s.nextInt();
    double nota2 = s.nextInt();
    double nota3 = s.nextInt();
    
    double media = ((nota1 + nota2 + nota3)/3);
    
    System.out.printf("La nota media es de %.2f.",media);
  }
}
