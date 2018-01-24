/**
* Ejercicio 16: Escribe un programa que pase de binario a decimal.
* 
* NOTA: DEBIDO A LA FUNCION "FuncionesMias.sacarNumeros" CREADA POR MI QUE HE EMPLEADO EN ESTE EJERCICIO
*       NO SE PUEDEN INTRODUCIR NUMEROS MAYORES A 10 CARACTERES.
* 
* @author Salvador Rebollo Benítez
*/
import salvi.*;

public class ejercicio17Salvaeditado {
public static void main(String[] args) {
  System.out.print("Introduzca el numero binario que quieras convertir a decimal: ");
  int numero = Integer.parseInt(System.console().readLine());
  int decimal = FuncionesMias.binaDec(numero);
  
  System.out.println("- Decimal: " + decimal);
  }
}
