/**
 * Ejercicio 10: Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 
 * y que los almacene en un array. El programa debe ser capaz de pasar todos 
 * los números pares a las primeras posiciones del array (del 0 en adelante) y 
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si 
 * es necesario.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio10Salva {
  public static void main (String[] args) {
    
//CREACION ARRAY
    int[] numero = new int [20];
    int[] par = new int [20];
    int[] impar = new int [20];
    int pares = 0;
    int impares = 0;
    
    //Registro valores para todos los registros del array
    for (int i = 0; i < 20; i++){
      numero[i] = ((int)(Math.random() * 101));
    }
    
    System.out.println();
    
    //Muestra el array original
    System.out.println("Array original:");
    System.out.println("┏━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┓");
    
    for (int i = 0; i < 20; i++) { //ESTE FOR: Se hace para mostrar los numeros en orden del array, empezando por 0
      System.out.printf("┃%3d ", i);
    }
    
    System.out.println("┃");
    System.out.println("┣━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━┫");
    
    for (int i = 0; i < 20; i++) { //ESTE FOR: Para mostrar los valores de dentro del array
      System.out.printf("┃%3d ", numero[i]);
    }
    
    System.out.print("┃");
    System.out.println("\n┗━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┛");
    //FIN Muestra array original
    
    // Almacena los numeros en arrays independientes, en uno los pares y en otro los impares
    
    for (int i = 0; i < 20 ; i++){
     if (numero[i] % 2 == 0) {
        par[pares++] = numero[i];
      } else {
        impar[impares++] = numero[i];
      }
    }
    
    // Mete los pares en las primeras posiciones del array original.
    for (int i = 0; i < pares; i++) {
      numero[i] = par[i];
    }
    
    // Mete los impares en los huecos que quedan.
    for (int i = pares; i < 20; i++) {
      numero[i] = impar[i - pares];
    }
    
    //Fin rotacion
    
    // Muestra el array rotado
    System.out.println("Array ordenado:");
    System.out.println("┏━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┓");
    
    for (int i = 0; i < 20; i++) {
      System.out.printf("┃%3d ", i);
    }
    
    System.out.println("┃");
    System.out.println("┣━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━┫");
    
    for (int i = 0; i < 20; i++) {
      System.out.printf("┃%3d ", numero[i]);
    }
    
    System.out.print("┃");
    System.out.println("\n┗━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┛");
    //FIN Muestra el array rotado
    
  }
}
