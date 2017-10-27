/**
* Ejercicio 13: Escribe un programa que lea una lista de diez números y determine cuántos 
* son positivos, y cuántos son negativos.
* @author Salvador Rebollo Benítez
*/
public class Ejercicio13Salva { 
 public static void main(String[] args) {

   System.out.println("Escribe 10 números separados por enter y te diré cuantos son negativos y positivos: ");
   
   int numPositivos = 0;
   int numNegativos = 0;
   
   for (int i = 0; i < 10 ; i++){
     if (Integer.parseInt(System.console().readLine()) > 0) {
       numPositivos++;
       } else {
       numNegativos++;
       }
     }
   System.out.print("Hay un total de " + numPositivos + " número/s positivo/s y " + numNegativos + " número/s negativo/s.");
  }
}
