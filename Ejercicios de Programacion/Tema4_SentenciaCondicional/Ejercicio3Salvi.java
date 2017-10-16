/**
 * Ejercicio 3: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * 
 * @author Salvador Rebollo Benítez
 * 
*/
public class Ejercicio3Salvi {
  public static void main(String[] args) {
    
    System.out.print("Di un número del 1 al 7 y te diré a que día de la semana corresponde: \n\n");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    switch(numero) {
      case 1:
        System.out.println("- Lunes");
        break;
      case 2:
        System.out.println("- Martes");
        break;
      case 3:
        System.out.println("- Miércoles");
        break;
      case 4:
        System.out.println("- Jueves");
        break;
      case 5:
        System.out.println("- Viernes");
        break;
      case 6:
        System.out.println("- Sábado");
        break;
      case 7:
        System.out.println("- Sábado");
        break;
      default:
        System.out.println("¡Ese día no existe!");
        break;
      }
  }
}
