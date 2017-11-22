/**
 * Ejercicio 03: Escribe un programa que lea 10 números por teclado y que luego los muestre 
 * en orden inverso, es decir, el primero que se introduce es el último en 
 * mostrarse y viceversa.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio03Salva {
  public static void main (String[] args) {
    
    int[] numerosIntr = new int [10];

    for (int i = 0; i < 10; i++){
      System.out.println("- Por favor introduzca el número " + i + ": ");
      numerosIntr[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("\nNúmeros invertidos: \n");
    for (int i = 9; i >= 0 ; i--){
      System.out.println(numerosIntr[i]);
    }
    
  }
}
