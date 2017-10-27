/**
* Ejercicio 14: Escribe un programa que pida una base y un exponente (entero positivo) y 
* que calcule la potencia.
* @author Salvador Rebollo Benítez
*/
import java.util.Scanner;
public class Ejercicio14Salva { 
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Por favor escriba una base y un exponente separados por espacio");
   
   int base = s.nextInt(); //2
   int exponente = s.nextInt(); //5
   int resultado = 1;
   for(int i = 1; i <= exponente; i++){
     resultado *= base;
   }
   
   System.out.print("La respuesta de " + base+"^"+exponente+" es: "+resultado+".");
  }
}
