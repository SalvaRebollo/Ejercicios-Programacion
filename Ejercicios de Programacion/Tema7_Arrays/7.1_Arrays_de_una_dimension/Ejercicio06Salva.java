/**
 * Ejercicio 06: Escribe un programa que lea 15 números por teclado y que los almacene en un 
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0 
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en 
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido 
 * del array.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio06Salva {
  public static void main (String[] args) {

    //CREACION ARRAY
    int[] numero = new int [15];
    
    System.out.println("Escribeme 15 valores: ");
    //Pido valores para todos los registros del array
    for (int i = 0; i < 15; i++){
      System.out.println("Introduce el numero " + i + ": ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    //Muestra el array original
    System.out.println("Array original:");
    System.out.println("┏━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┓");
    
    for (int i = 0; i < 15; i++) { //ESTE FOR: Se hace para mostrar los numeros en orden del array, empezando por 0
      System.out.printf("┃%3d ", i);
    }
    
    System.out.println("┃");
    System.out.println("┣━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━┫");
    
    for (int i = 0; i < 15; i++) { //ESTE FOR: Para mostrar los valores de dentro del array
      System.out.printf("┃%3d ", numero[i]);
    }
    
    System.out.print("┃");
    System.out.println("\n┗━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┛");
    //FIN Muestra array original
    
    // rota una posición a la derecha //////////
    int aux = numero[14];
    for (int i = 14; i > 0; i--) {
      numero[i] = numero[i-1];
    }
    numero[0] = aux;
    //Fin rotacion
    
    // Muestra el array rotado
    System.out.println("Array rotado:");
    System.out.println("┏━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┳━━━━┓");
    
    for (int i = 0; i < 15; i++) {
      System.out.printf("┃%3d ", i);
    }
    
    System.out.println("┃");
    System.out.println("┣━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━╋━━━━┫");
    
    for (int i = 0; i < 15; i++) {
      System.out.printf("┃%3d ", numero[i]);
    }
    
    System.out.print("┃");
    System.out.println("\n┗━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┻━━━━┛");
    //FIN Muestra el array rotado
  }
}
