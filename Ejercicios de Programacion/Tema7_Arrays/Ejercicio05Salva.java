/**
 * Ejercicio 05: Escribe un programa que pida 10 números por teclado y que luego muestre 
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado 
 * del máximo y del mínimo respectivamente.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio05Salva {
  public static void main (String[] args) {
    int maximo = 0;
    int minimo = 999999999;
    
    //ARRAY
    int[] numero = new int [10];
    //Pido valores
    for (int i = 0; i < 10; i++){
      System.out.println("Introduce el numero " + i + ": ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
  //CALCULO MAXIMO Y MINIMO
    for (int i = 0; i < 10; i++){
      if (numero[i] > maximo){//MAXIMO
        maximo = numero[i];
      }
      if (minimo > numero[i]){
        minimo = numero[i];
      }
    }
    
    //Muestro valores con maximo y minimo
    for (int i = 0; i < 10; i++){
      System.out.print("- " + numero[i]);
      
      if (numero[i]==maximo) {
        System.out.print("  <--Este es el máximo.");
      }
      
      if (numero[i]==minimo) {
        System.out.print("  <--Este es el mínimo.");
      }
      System.out.println();
    }
  }
}
