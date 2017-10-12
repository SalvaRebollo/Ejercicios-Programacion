/* Ejercicio 3: Escribe un programa que muestre por pantalla 10 palabras en inglés junto
a su correspondiente traducción al castellano. Las palabras deben estar
distribuidas en dos columnas y alineadas a la izquierda.
 */
 

public class Actividad3Salvi {
  public static void main(String[] args) {
    System.out.println ("Inglés               Español");
    System.out.println ("-----------------------------");
    
    System.out.printf ("%-13s        %s \n", "Biscuit", "Galleta");
    System.out.printf ("%-13s        %s \n", "Banana", "Plátano");
    System.out.printf ("%-13s        %s \n", "Mother Board", "Placa base");
    System.out.printf ("%-13s        %s \n", "Mouse", "Ratón");
    System.out.printf ("%-13s        %s \n", "Cake", "Pastel");
    System.out.printf ("%-13s        %s \n", "Blue", "Azul");
    System.out.printf ("%-13s        %s \n", "House", "Casa");
    System.out.printf ("%-13s        %s \n", "Keyboard", "Teclado");
    System.out.printf ("%-13s        %s \n", "Book", "Libro");
    System.out.printf ("%-13s        %s \n", "Speaker", "Altavoz");
    
  }
}
