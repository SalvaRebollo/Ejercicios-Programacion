/**
 * Ejercicio 31: Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El 
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la 
 * mitad (división entera entre 2) de la altura más uno.
 * 
 * Ejemplo:
 * Introduzca la altura de la L: 5
 * 
 *  *
 *  *
 *  *
 *  *
 *  * * *
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio31Salva {
  public static void main (String[] args) {
    int altura;
    String caracter;
    
    System.out.println("Por favor introduzca la altura de la L: ");
    altura = Integer.parseInt(System.console().readLine())-1;
    
    System.out.println("Por favor introduzca el caracter de construccion: ");
    caracter=System.console().readLine();
    
    System.out.println("");
    
    for (int i = 1; i <= altura; i++){
      System.out.println(caracter);
    
    }
    
    int linea=((altura/2)+1);
    
    for (int i = 1; i <= linea; i++){
      System.out.print(caracter+" ");
    
    }
  
  }
}
