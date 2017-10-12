/**
* Ejercicio 2: Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*
* @author Salvador Rebollo Benítez
*/

public class Ejercicio2 {
  public static void main(String[] args) {

    String cantidades; //Creamos una variable, cuando recogemos texto con "System.console().readLine()" esa variable por defecto es una cadena de texto.
    
    System.out.print("Introduce la cifra de pesetas a convertir: ");
    cantidades = System.console().readLine(); //Con esta linea recogemos lo que queremos
    double numeroPesetas = Double.parseDouble( cantidades ); //Aqui hacemos que la cadena de texto se convierta en un numero entero con int, o con decimales con double.
    
    double conversion = (166.378 / numeroPesetas);
    
    
    System.out.println("Las pesetas introducidas son: " + numeroPesetas + " psts");
    System.out.println("La cantidad " + numeroPesetas + " psts en Euros son: " + conversion + "€");
  } 
}
