/* Ejercicio 5: Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
de un color diferente.
 */
 

public class Actividad5SalviFail {
  public static void main(String[] args) {
    
    String azul = "\033[34m";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String blanco = "\033[37m";
    String morado = "\033[36m";
    
    System.out.println ("Lunes      Martes      Miércoles     Jueves      Viernes");
    System.out.println ("----------------------------------------------------------");
    
    System.out.printf ("%-6s      %-6s      %-6s        %-6s      %-6s \n", azul + "PRO", rojo + "SINF", azul + "PRO", morado + "ED", rojo + "SINF");
    System.out.printf ("%-6s      %-6s      %-6s        %-6s      %-6s \n", azul + "PRO", rojo + "SINF", azul + "PRO", morado + "ED", rojo + "SINF");
    System.out.printf ("%-6s      %-6s      %-6s        %-6s      %-6s \n", azul + "PRO", rojo + "SINF", azul + "PRO", morado + "ED", rojo + "SINF");
    
    System.out.println ("**********************************************************");
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "R", "E", "CR", "E", "O");
    System.out.println ("**********************************************************");
    
    System.out.printf ("%-6s      %-6s      %-6s        %-6s      %-6s \n", naranja + "BBDD", blanco + "LM", naranja + "BBDD", blanco + "LM", verde + "FOL");
    System.out.printf ("%-6s      %-6s      %-6s        %-6s      %-6s \n", naranja + "BBDD", azul + "PRO", naranja + "BBDD", blanco + "LM", verde + "FOL");
    System.out.printf ("%-6s      %-6s      %-6s        %-6s      %-6s \n", naranja + "BBDD", azul + "PRO", naranja + "BBDD", blanco + "LM", verde + "FOL");
    
  }
}
