/**
* Ejercicio 3: Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
*
* @author Salvador Rebollo Benítez
*/

public class Ejercicio3Salvi {
  public static void main(String[] args) {

    String cantidades; //Creamos una variable, cuando recogemos texto con "System.console().readLine()" esa variable por defecto es una cadena de texto.
    System.out.println("*****CONVERSOR DE ptas a Euros*****");
    System.out.print("Introduce la cifra de pesetas a convertir: ");
    cantidades = System.console().readLine(); //Con esta linea recogemos lo que queremos
    double numeroPesetas = Double.parseDouble( cantidades ); //Aqui hacemos que la cadena de texto se convierta en un numero entero con int, o con decimales con double.
    
    double conversion = (numeroPesetas/166.386);
    
    System.out.printf("Las pesetas introducidas son: %.2f ptas \n", numeroPesetas);
    System.out.printf("La cantidad %.2f ptas en Euros son: %.2f€", numeroPesetas, conversion);
  } 
}
