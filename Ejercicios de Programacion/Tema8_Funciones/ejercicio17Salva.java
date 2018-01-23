/**
* Ejercicio 16: Escribe un programa que pase de binario a decimal.
* 
* NOTA: DEBIDO A LA FUNCION "FuncionesMias.sacarNumeros" CREADA POR MI QUE HE EMPLEADO EN ESTE EJERCICIO
*       NO SE PUEDEN INTRODUCIR NUMEROS MAYORES A 9 CARACTERES.
* 
* @author Salvador Rebollo Benítez
*/
import salvi.*;

public class ejercicio17Salva {
public static void main(String[] args) {
  int digito;
  int decimal = 0;
  int exponente = 0;
  
  System.out.print("Introduzca el numero binario que quieras convertir a decimal: ");
  int numero = Integer.parseInt(System.console().readLine());
  int[] numeroSeparado = FuncionesMias.sacarNumeros(numero);
  
  while (numero != 0) {
    //se toma la última cifra
    digito = numeroSeparado[exponente];
    
    //se multiplica por la potencia de 2 correspondiente y se suma al número
    decimal = decimal + digito * FuncionesMias.potencia(2, exponente);
    
    //se aumenta el exponente y se le baja una cifra a numero
    exponente++;
    numero = numero/10;
  }
  System.out.println("- Decimal: " + decimal);
  }
}
