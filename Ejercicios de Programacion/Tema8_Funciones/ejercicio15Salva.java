/**
* Ejercicio 15: Muestra los números primos que hay entre 1 y 1000.
*
* @author Salvador Rebollo Benítez
*/
import salvi.*;

public class ejercicio15Salva {
public static void main(String[] args) {
  for (int i = 1; i <= 1000 ; i++){
    if (FuncionesMias.esPrimo(i)) {
      System.out.println(i);
    }
  }
  
  /*
  int numero=1;
  int contador = 0;
  int y;
System.out.println(".:*Primeros Numeros Primos de 1 al 1000*:.");
  while (numero <= 1000){
    numero = salvi.Funciones.siguientePrimo(numero);
    System.out.println(contador + " - " + numero);
    contador++;
  }
  */
  
  }
}
