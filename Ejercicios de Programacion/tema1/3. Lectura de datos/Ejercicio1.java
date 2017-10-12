/**
* Ejercicio 1: Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*
* @author Salvador Rebollo Benítez
*/

public class Ejercicio1 {
  public static void main(String[] args) {

    String linea; //Creamos una variable, cuando recogemos texto con "System.console().readLine()" esa variable por defecto es una cadena de texto.
    
    System.out.print("Introduce un número por favor: ");
    linea = System.console().readLine(); //Con esta linea recogemos lo que queremos
    int primerNumero = Integer.parseInt( linea ); //Aqui hacemos que la cadena de texto se convierta en un numero entero con int, o con decimales con double.
    
    System.out.print("Por favor, introduce otro número: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt( linea );
    
    int total = (primerNumero * segundoNumero); //Aqui creamos otra variable que multiplica las dos anteriores.
    
    System.out.println("El primer numero introducido es: " + primerNumero);
    System.out.println("El segundo número introducido es: " + segundoNumero);
    System.out.println("Si multiplicamos las dos cifras tenemos un total de: " + total);
  } 
}
