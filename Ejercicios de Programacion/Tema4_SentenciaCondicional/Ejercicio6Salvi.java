/**
 * Ejercicio 6: Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s
 * 
 * @author Salvador Rebollo Benítez
*/

public class Ejercicio6Salvi {
  public static void main(String[] args) {
    
    System.out.println("Introduce la altura en metros: ");
    double h = Double.parseDouble(System.console().readLine());
    double g = 9.81;
    
    double t = Math.sqrt(2*h/g);
    
    System.out.printf("El tiempo que tardará en caer es de: %.2f s", t);
  }
}
