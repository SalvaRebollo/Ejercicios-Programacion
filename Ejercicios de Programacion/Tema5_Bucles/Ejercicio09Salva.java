/**
 * Ejercicio 9: Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Salvador Rebollo Benítez
*/
public class Ejercicio09Salva {
  public static void main(String[] args) {
    int numeroDigitos = 1;
    int n;
    int numeroIntroducido;
    
    System.out.println("Por favor introduzca un número para mostrar su nº total de digitos: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    n = numeroIntroducido;
    
    while(n > 10){
      n /= 10;
      numeroDigitos++;
    }
    System.out.println("El número de dígitos de "+numeroIntroducido+" es: "+numeroDigitos+".");
  }
}
