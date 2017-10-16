/**
 * Ejercicio 8: Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 * 
 * @author Salvador Rebollo Benítez
*/
import java.util.Scanner;

public class Ejercicio8Salvi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("***CALCULADORA DE 3 MEDIAS***");
    System.out.print("Por favor introduzca las 3 notas separadas por espacio para hacer la media: ");
    
    double nota1 = s.nextInt();
    double nota2 = s.nextInt();
    double nota3 = s.nextInt();
    
    double media = ((nota1 + nota2 + nota3)/3);
    
    if (media < 5) {
      System.out.print("La nota en el boletín sería de INSUFICIENTE");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("La nota en el boletín sería de SUFICIENTE");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("La nota en el boletín sería de BIEN");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("La nota en el boletín sería de NOTABLE");
    }
    
    if (media >= 9) {
      System.out.print("La nota en el boletín sería de SOBRESALIENTE");
    }
    
    System.out.printf("\nLa nota media es de %.2f.",media);
  }
}
