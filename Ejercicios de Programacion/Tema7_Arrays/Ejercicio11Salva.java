/**
 * Ejercicio 11: Realiza un programa que pida 10 números por teclado y que los almacene en 
 * un array. A continuación se mostrará el contenido de ese array junto al índice 
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los 
 * primos a las primeras posiciones, desplazando el resto de números (los que 
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar 
 * el array resultante.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio11Salva {
  public static void main (String[] args) {
    
//CREACION ARRAY
    int[] numero = new int [10];
    int[] primo = new int [10];
    int[] noprimo = new int [10];
    int primos = 0;
    int noprimos = 0;
    
    //Registro valores para todos los registros del array
    for (int i = 0; i < 10; i++){
      System.out.print("Introduzca el valor " + i + ": ");
      numero[i] = Integer.parseInt(System.console().readLine());
      
      
      // Comprueba si el número es o no primo.
      boolean esPrimo = true;
      for (int j = 2; j < numero[i] - 1; j++) {
        if (numero[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      // Si el número es primo, se mete en un array y si
      // no es primo, se mete en otro diferente.
      if (esPrimo) {
        primo[primos++] = numero[i];
      } else {
          noprimo[noprimos++] = numero[i];
        }
    }
    
    System.out.println();
    
    //Muestra el array original
    System.out.println("Array original:");
    System.out.println("┏━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┓");
    
    for (int i = 0; i < 10; i++) { //ESTE FOR: Se hace para mostrar los numeros en orden del array, empezando por 0
      System.out.printf("┃%3d ", i);
    }
    
    System.out.println("┃");
    System.out.println("┣━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━┫");
    
    for (int i = 0; i < 10; i++) { //ESTE FOR: Para mostrar los valores de dentro del array
      System.out.printf("┃%3d ", numero[i]);
    }
    
    System.out.print("┃");
    System.out.println("\n┗━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┛");
    //FIN Muestra array original
    
  
    // Mete los primos en las primeras posiciones del array original.
    for (int i = 0; i < primos; i++) {
      numero[i] = primo[i];
    }
    
    // Mete los no-primos en los huecos que quedan.
    for (int i = primos; i < primos + noprimos; i++) {
      numero[i] = noprimo[i - primos];
    }
    
    //Fin rotacion
    
    // Muestra el array rotado
    System.out.println("Array ordenado:");
    System.out.println("┏━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┓");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("┃%3d ", i);
    }
    
    System.out.println("┃");
    System.out.println("┣━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━┫");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("┃%3d ", numero[i]);
    }
    
    System.out.print("┃");
    System.out.println("\n┗━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┛");
    //FIN Muestra el array rotado
    
  }
}
