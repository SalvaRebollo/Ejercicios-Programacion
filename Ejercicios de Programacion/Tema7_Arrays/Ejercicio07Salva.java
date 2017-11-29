/**
 * Ejercicio 07: Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los 
 * muestre por pantalla separados por espacios. El programa pedirá entonces 
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del 
 * primer valor por el segundo en la lista generada anteriormente. Los números 
 * que se han cambiado deben aparecer entrecomillados.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio07Salva {
  public static void main (String[] args) {
    
    int[] numero = new int[100];
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    //Almacena 100 numeros aleatorios en el array entre 0 y 20 y los muestra.
    for (int i = 0; i < 100; i++){
      numero[i] = ((int)(Math.random() * 21)); //Lo almacena
      System.out.print(numero[i] + " "); //Lo muestra
    }
    
    System.out.println("\n\nDime que valor quieres tomar: ");
    int valor1=Integer.parseInt(System.console().readLine());
    
    System.out.println("\nDime por cuál valor lo quieres cambiar: ");
    int valor2=Integer.parseInt(System.console().readLine());
    
    
    for (int i = 0; i < 100; i++) {
      if (numero[i] == valor1) {
        numero[i] = valor2;
        System.out.print(verde + "\"" + numero[i] + "\"  ");
      } else {
        System.out.print(blanco + numero[i] + "  ");
      }
    }
    
    
    
    
  }
}
