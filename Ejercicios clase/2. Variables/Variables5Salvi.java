/**Ejercicio 5: Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
*/
public class Variables5Salvi {
  public static void main(String[] args) {
    double cantidadPsts; //Declaro una variable con decimales con "double"
    
    cantidadPsts = 1000; //Valor de la variable
    
    System.out.println("***Conversor de Pesetas a Euros***");
    System.out.println("Cantidad pesetas: " + cantidadPsts + " Psts");
    System.out.printf("Valor en euros: %.2f€", (cantidadPsts/166.386)); //Aqui pongo un printf en lugar de println para formatear que salga la cantidad con DOS decimales.
  }
}
