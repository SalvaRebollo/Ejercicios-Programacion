/**
* Ejercicio 17: Realiza un programa que sume los 100 números siguientes a un número entero 
* y positivo introducido por teclado. Se debe comprobar que el dato introducido 
* es correcto (que es un número positivo).
.
* @author Salvador Rebollo Benítez
*/
public class Ejercicio17Salva { 
 public static void main(String[] args) {

   int numeroIntroducido;
   
   do{
     System.out.println("Por favor introduce un número entero positivo: ");
     numeroIntroducido = Integer.parseInt(System.console().readLine());
     
     if(numeroIntroducido < 0){
       System.out.print("El número que has introducido no es positivo. ");
     }
   } while (numeroIntroducido < 0);
   
   int suma = 0;
   
   for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++){
     suma += i;
   }
   
   System.out.println("La suma de los 100 numeros siguientes a " + numeroIntroducido + " es: " + suma + ".");
  }
}
