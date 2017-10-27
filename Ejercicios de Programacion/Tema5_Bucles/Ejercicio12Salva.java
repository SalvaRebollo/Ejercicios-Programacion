/**
 * Ejercicio 12: Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio12Salva {
  public static void main (String[] args) {
    
    int anterior = 0;
    int temporal;
    int x=1;
    int finCiclo;
    System.out.println("Por favor inserte el numero final del ciclo de la serie Fibonacci: ");
    finCiclo = Integer.parseInt(System.console().readLine());
    System.out.print(anterior);
    while(true)
    {
      System.out.print(" - "+x);
      temporal = x;
      x = x + anterior;
      anterior = temporal;

      if( x > finCiclo )
      {break;}
    }
   
  }
}
