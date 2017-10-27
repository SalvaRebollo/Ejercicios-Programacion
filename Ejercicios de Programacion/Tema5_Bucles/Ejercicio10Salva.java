/**
 * Ejercicio 10: Escribe un programa que calcule la media de un conjunto de números positivos 
 * introducidos por teclado. A priori, el programa no sabe cuántos números se 
 * introducirán. El usuario indicará que ha terminado de introducir los datos 
 * cuando meta un número negativo
 * 
 * @author Salvador Rebollo Benítez
*/
public class Ejercicio10Salva {
  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double sumas = 0;

    System.out.println("Este programa te calcula la media de los números introducidos. (positivos)");
    System.out.println("Introduzca números (puede parar introduciendo un número negativo): ");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      sumas += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (sumas - numeroIntroducido)/ (numeros - 1));

  }
}
