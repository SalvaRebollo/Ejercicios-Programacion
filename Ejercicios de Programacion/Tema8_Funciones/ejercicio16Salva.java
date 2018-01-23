/**
* Ejercicio 16: Muestra los números capicúa que hay entre 1 y 99999.
*
* @author Salvador Rebollo Benítez
*/
import salvi.FuncionesMias;

public class ejercicio16Salva {
public static void main(String[] args) {
  
  for (int i = 1; i <= 99999 ; i++){
    if (FuncionesMias.esCapicua(i)) {
      System.out.println(i);
    }
  }

  
/* 
  System.out.println("Dime el valor de inicio");
  int i = Integer.parseInt(System.console().readLine());
  System.out.println("Dime el numero de comprobaciones");
  int bucle = Integer.parseInt(System.console().readLine());
  
  
*/
  
/*
  int numero=1;
  int contador = 0;
  int y;
System.out.println(".:*Primeros Numeros Capicua de 1 al 99999*:.");
System.out.print(FuncionesMias.siguienteCapicua(1523));
  
  }
  */
  }
}
