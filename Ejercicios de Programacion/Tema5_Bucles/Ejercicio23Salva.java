/**
 * Ejercicio 23: Escribe un programa que permita ir introduciendo una serie indeterminada 
 * de números mientras su suma no supere el valor 10000. Cuando esto último 
 * ocurra, se debe mostrar el total acumulado, el contador de los números 
 * introducidos y la media.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio23Salva {
  public static void main (String[] args) {
    
    System.out.println("Por favor, introduzca números. Cuando su suma sea mayor a 1000 habrá terminado: ");
    
    int numeroIntr;
    int suma = 0;
    int totalDeElementos = 0;
    
    do {
      numeroIntr = Integer.parseInt(System.console().readLine());
      suma += numeroIntr;
      totalDeElementos++;
    } while (suma <= 10000);
    
    int media = suma/totalDeElementos;
    
    System.out.println("\n- Ha introducido un total de " + totalDeElementos + " números.");
    System.out.println("- La suma total es de " + suma + ".");
    System.out.println("- La media es " + media + ".");
  }
}
