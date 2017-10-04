/**Ejercicio 4: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
*/
public class Variables4Salvi {
  public static void main(String[] args) {
    double cantidadEur;
    
    cantidadEur = 5;
    
    System.out.println("***Conversor de Euros a Pesetas***");
    System.out.println("Cantidad Euros: " + cantidadEur + "€");
    System.out.println("Valor en pesetas: " + (cantidadEur * 166.386) + " pesetas");
  }
}
