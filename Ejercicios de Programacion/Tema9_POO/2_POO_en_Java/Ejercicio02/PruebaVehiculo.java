package tema9POO.Ejercicio02;
import java.util.Scanner;
/**
 * [WORK IN PROGRESS]Ejercicio 02: Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de 
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y 
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:
 * 
 * VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 * 
 * @author Salvador Rebollo Benitez
 */
public class PruebaVehiculo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int opcion = 0;
    
    Bicicleta biciRoja = new Bicicleta(7);
    Coche seatLeon = new Coche(9);
    
    while (opcion != 8){
      System.out.println("       VEHICULOS");
      System.out.println("===========================");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz un derrape con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Pisarle a fondo al coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilometros vas a recorrer en bici?: ");
          biciRoja.recorre(Integer.parseInt(s.nextLine()));
          System.out.println();
          break;
        case 2:
          biciRoja.derrapar();
          break;
        case 3:
          System.out.print("¿Cuántos kilometros vas a recorrer en coche?: ");
          seatLeon.recorre(Integer.parseInt(s.nextLine()));
          System.out.println();
          break;
        case 4:
          seatLeon.acelerar();
          break;
        case 5:
          System.out.println("Kilometros en bici: " + biciRoja.getKmRecorridos() + " km.");
          break;
        case 6:
          System.out.println("Kilometros en coche: " + seatLeon.getKmRecorridos() + " km.");
          break;
        case 7:
          System.out.println("Kilometros totales: " + Vehiculo.getKmTotales() + " km.");
          break;
        default:
      }//switch
    }//while
    
  }//main
}//class
