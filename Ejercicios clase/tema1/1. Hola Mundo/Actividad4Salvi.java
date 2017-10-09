/* Ejercicio 4: Escribe un programa que muestre tu horario de clase.
 */
 

public class Actividad4Salvi {
  public static void main(String[] args) {
    System.out.println ("Lunes      Martes      Miércoles     Jueves      Viernes");
    System.out.println ("----------------------------------------------------------");
    
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "PRO", "SINF", "PRO", "ED", "SINF");
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "PRO", "SINF", "PRO", "ED", "SINF");
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "PRO", "SINF", "PRO", "ED", "SINF");
    
    System.out.println ("**********************************************************");
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "R", "E", "CR", "E", "O");
    System.out.println ("**********************************************************");
    
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "BBDD", "LM", "BBDD", "LM", "FOL");
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "BBDD", "PRO", "BBDD", "LM", "FOL");
    System.out.printf ("%-6s     %-6s      %-6s        %-6s      %-6s \n", "BBDD", "PRO", "BBDD", "LM", "FOL");
    
  }
}
