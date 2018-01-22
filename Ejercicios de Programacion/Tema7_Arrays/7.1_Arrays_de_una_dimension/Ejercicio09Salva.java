/**
 * Ejercicio 09: Realiza un programa que pida 8 números enteros y que luego muestre esos 
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio09Salva {
  public static void main (String[] args) {
    
    int[] numero = new int[8];
    int i;
    int j;
    
   
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    //Almacena 8 numeros en el array
    for (i = 0; i < 8; i++){
      System.out.print("Dime el número " + (i+1) + ": ");
      numero[i] = Integer.parseInt(System.console().readLine()); //Lo almacena
    }
    
    System.out.println();
    
    for(i = 0; i < 8; i++){
      System.out.printf(verde + "%4d " + naranja + "│",numero[i]);
      if(numero[i] % 2 == 0){
        System.out.println(morado+" PAR");
      }else{
        System.out.println(morado+" IMPAR");
      }
      
    }
    
    
    
    
    
    
    
  }
}
