/**
 * Ejercicio 5: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author Salvador Rebollo Benítez
*/

public class Ejercicio5Salvi {
  public static void main(String[] args) {
    
    System.out.println("Te resuelvo la ecuación de primer grado que me digas. Del tipo ax + b = 0");
    System.out.print("Por favor introduce el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor introduce el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
    
    if (a==0) {
      System.out.println("Esa ecuación no tiene solución real");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
