/**
 * Ejercicio 16: Escribe un programa que diga si un número introducido por teclado es o no 
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio16Salva {
  public static void main(String[] args) {
  System.out.println("**DETECTOR DE NUMEROS PRIMOS**\n\n");
  System.out.print("Por favor introduce un número para saber si es primo: ");
  
  int numIntroducido = Integer.parseInt(System.console().readLine());
  int i;
  boolean primo = true;
  
  for(i=2; i < numIntroducido; i++) {
    if(numIntroducido % i == 0){
      primo = false;
    }
  }
  
  if(primo){
    System.out.print("Este número es primo.");
  } else {
    System.out.print("Este número no es primo.");
  }
  
  }
}
