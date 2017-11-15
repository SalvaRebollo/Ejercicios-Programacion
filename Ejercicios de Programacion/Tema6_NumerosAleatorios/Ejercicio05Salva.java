/**
 * Ejercicio 5: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
 * separados por espacios. Muestra también el máximo, el mínimo y la media 
 * de esos números.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio05Salva {
  public static void main (String[] args) {
    
    System.out.println("50 numeros aleatorios entre 100 y 199");
    int numero = 0;
    int maximo = 0;
    int minimo = 199;
    int suma = 0;
    
    for (int i = 1; i <= 50 ; i++){
      
      numero = ((int)(Math.random() * 100)+100);
      System.out.print(numero + " ");
      
      suma += numero;
      
      if(maximo<numero){
        maximo=numero;
      }
      
      if(minimo>numero){
        minimo=numero;
      }
    }
    int media = suma/50;
    System.out.println();
    System.out.println("\n- El maximo es: " + maximo);
    System.out.println("- El minimo es: " + minimo);
    System.out.println("- La media es: " + media);
    
    
  }
}
