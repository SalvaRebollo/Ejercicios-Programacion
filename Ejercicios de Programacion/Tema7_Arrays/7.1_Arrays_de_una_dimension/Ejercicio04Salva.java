/**
 * Ejercicio 04: Define tres arrays de 20 números enteros cada una, con nombres numero, 
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el 
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el 
 * array numero. En el array cubo se deben almacenar los cubos de los valores que 
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto 
 * en tres columnas.
 * 
 * @author Salvador Rebollo Benítez
 */
/**
 * Ejercicio 04: Define tres arrays de 20 números enteros cada una, con nombres numero, 
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el 
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el 
 * array numero. En el array cubo se deben almacenar los cubos de los valores que 
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto 
 * en tres columnas.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio04Salva {
  public static void main (String[] args) {
    
    int[] numero = new int [20];
    int[] cuadrado = new int [20];
    int[] cubo = new int [20];
    
    //ARRAY NUMEROS
    for (int i = 0; i < 20; i++){
      numero[i] = ((int)(Math.random() * 101));
    }
    //ARRAY CUADRADOS
    for (int i = 0; i < 20; i++){
      cuadrado[i] = numero[i] * numero[i];
    }
    //ARRAY CUBOS
    for (int i = 0; i < 20; i++){
      cubo[i] = numero[i] * numero[i] * numero[i];
    }
    
    System.out.println(" Numeros    Cuadrados    Cubos");
    System.out.println("-----------------------------------------");
    for (int i = 0; i < 20; i++){
    System.out.printf(" %-10d %-12d %d\n", numero[i], cuadrado[i], cubo[i]);
    }
    
  }
}
