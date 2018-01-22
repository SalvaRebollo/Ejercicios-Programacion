/**
 * Ejercicio 12: Realiza un programa que pida 10 números por teclado y 
 * que los almacene en un array. A continuación se mostrará el contenido
 * de ese array junto al índice (0 – 9). Seguidamente el programa pedirá
 * dos posiciones a las que llamaremos “inicial” y “final”. Se debe 
 * comprobar que inicial es menor que final y que ambos números están 
 * entre 0 y 9. El programa deberá colocar el número de la posición 
 * inicial en la posición final, rotando el resto de números para que no 
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio12Salva {
  public static void main (String[] args) {

    //CREACION ARRAY
    int[] numero = new int [10];
    
    System.out.println("Escribeme 10 valores: ");
    //Pido valores para todos los registros del array
    for (int i = 0; i < 10; i++){
      System.out.println("Introduce el numero " + i + ": ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    //Muestra el array original
    System.out.println("Asi está formado el array actual:");
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
    
    //Pregunta los valores inicio y final y hace sus comprobaciones
    boolean datosCorrectosUno = true;
    boolean datosCorrectosDos = true;
    boolean datosCorrectosTres = true;
    int valorInicio;
    int valorFin;
    do{
      System.out.print("\nAhora dime el valor inicial: ");
      valorInicio = Integer.parseInt(System.console().readLine());
      System.out.print("\nY el valor final: ");
      valorFin = Integer.parseInt(System.console().readLine());
      
      if (valorInicio>9 || valorInicio<0) {
        System.out.print("\n- Error: Los valores de inicio deben estar entre 0 y 9");
        datosCorrectosUno = false;
      } else {
          datosCorrectosUno = true;
        }
      if (valorFin>9 || valorFin<0) {
        System.out.print("\n- Error: Los valores de final deben estar entre 0 y 9");
        datosCorrectosDos = false;
      } else {
          datosCorrectosDos = true;
        }
      if (valorFin < valorInicio) {
        System.out.print("\n- Error: Inicio debe ser menor que final");
        datosCorrectosTres = false;
      } else {
          datosCorrectosTres = true;
        }
      System.out.println();
      
    } while (!datosCorrectosUno && !datosCorrectosDos && !datosCorrectosTres);
    
    if (datosCorrectosUno && datosCorrectosDos && datosCorrectosTres) {
      
      // rota una posición a la derecha
      int aux1 = numero[valorInicio];
      int aux2 = numero[valorFin];
      
      
      for (int i = 9; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[valorFin] = numero[valorInicio];
      //Fin rotacion
      
      
      
      
      
      
      
      // Muestra el array rotado
      System.out.println("Array rotado:");
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
        
    } //if
    
    
  }
}
