/**
 * Ejercicio 1: Escribe un programa que pida por teclado un día de la semana y que diga qué 
 * asignatura toca a primera hora ese día.
 * 
 * @author Salvador Rebollo Benítez
 * 
*/
public class Ejercicio1Salvi {
  public static void main(String[] args) {
    
    String dia;
    System.out.print("Por favor introduce un día de la semana y te mostraré qué asignatura te toca ese día a primera hora: \n\n");
    
    dia = (System.console().readLine());
    dia.toLowerCase(); //Paso a minúscula todo.
    
    switch(dia) {
      case "lunes":
      System.out.println("- Programación");
      break;
      case "martes":
      System.out.println("- Sistemas Informáticos");
      break;
      case "miércoles":
        System.out.println("- Programación");
        break;
      case "jueves":
        System.out.println("- Entornos de Desarollo");
        break;
      case "viernes":
        System.out.println("- Sistemas Informáticos");
        break;
      case "sábado":
        // continúa debajo
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
    
  } 
}
