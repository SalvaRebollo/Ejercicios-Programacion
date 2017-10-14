/**
* Ejercicio 9: Escribe un programa que calcule el volumen de un cono según la fórmula V = 13πr2h
*
* @author Salvador Rebollo Benítez
*/

public class Ejercicio9Salvi {
  static final double pi = 3.141592654; //Declaro la variable constante pi.
  
  public static void main(String[] args) {
    
    System.out.println("CALCULADORA VOLUMEN DE UN CONO SEGUN UNA FORMULA\n");
    System.out.print("- Por favor, introduzca la altura (en cm): ");
    double h = Double.parseDouble(System.console().readLine());
    System.out.print("- Introduzca el radio (en cm): ");
    double r = Double.parseDouble(System.console().readLine());
    
    double v = (1.0/3.0) * pi * r * r * h;
    System.out.println("* El volumen del cono es de " +  v + " cm3");
    
  }
}
