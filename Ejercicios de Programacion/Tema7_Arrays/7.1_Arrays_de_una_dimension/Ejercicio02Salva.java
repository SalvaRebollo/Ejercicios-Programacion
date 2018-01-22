/**
 * Ejercicio 02: Define un array de 10 caracteres con nombre simbolo y asigna valores a los 
 * elementos según la tabla que se muestra a continuación. Muestra el contenido 
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos 
 * que no han sido inicializados?
 * 
 * Respuesta: Se muestra el valor "null", salvo en la que tiene indice 6
 * ya que contiene un espacio en blanco.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio02Salva {
  public static void main (String[] args) {
    String[] simbolo = new String [10];
    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";
    
    for (int i = 0; i < 10; i++){
      System.out.println(simbolo[i]);
    }
    
  }
}
