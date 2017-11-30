/**
 * Ejercicio 08: Realiza un programa que pida la temperatura media que ha hecho en cada mes 
 * de un determinado año y que muestre a continuación un diagrama de barras 
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base 
 * de asteriscos o cualquier otro carácter.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio08Salva {
  public static void main (String[] args) {
    
    int[] numero = new int[12];
    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", 
      "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    int i;
    int j;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    //Almacena 12 numeros aleatorios en el array que son la temperatura de los 12 meses
    for (i = 0; i < 12; i++){
      System.out.print("Dime la temperatura que hubo en " + mes[i] + ": ");
      numero[i] = Integer.parseInt(System.console().readLine()); //Lo almacena
    }
    
    System.out.println();
    
    for(i = 0; i < 12; i++){
      System.out.printf(verde + "%11s " + naranja + "│",mes[i]);
      for (j = 0; j < numero[i]; j++){
        System.out.print("■");
      }
      System.out.println(" "+morado+numero[i]+"ºC");
    }
    
    
    
    
    
    
    
  }
}
