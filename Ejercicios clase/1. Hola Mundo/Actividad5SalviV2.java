/* Ejercicio 5: Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
de un color diferente.
 */
 

public class Actividad5SalviV2 {
  public static void main(String[] args) {
    
    String azul = "\033[34m";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String blanco = "\033[37m";
    String cyan = "\033[36m";
    String morado = "\033[35m";
    
    System.out.println ("Lunes      Martes      Miércoles     Jueves      Viernes");
    System.out.println ("----------------------------------------------------------");
    
    System.out.println (azul + "PRO" + rojo + "        SINF" + azul + "        PRO" + cyan + "           ED" + rojo + "          SINF" );
    System.out.println (azul + "PRO" + rojo + "        SINF" + azul + "        PRO" + cyan + "           ED" + rojo + "          SINF" );
    System.out.println (azul + "PRO" + rojo + "        SINF" + azul + "        PRO" + cyan + "           ED" + rojo + "          SINF");
    
    System.out.println (morado + "**********************************************************");
    System.out.println ("R          E           CR            E           O");
    System.out.println ("**********************************************************");
    
    System.out.println (naranja + "BBDD" + blanco + "       LM" + naranja + "          BBDD" + blanco + "          LM" + verde + "          FOL");
    System.out.println (naranja + "BBDD" + azul + "       PRO" + naranja + "         BBDD" + blanco + "          LM" + verde + "          FOL");
    System.out.println (naranja + "BBDD" + azul + "       PRO" + naranja + "         BBDD" + blanco + "          LM" + verde + "          FOL");
    
  }
}
