/**
* Ejercicio 18: Escribe un programa que obtenga los números enteros comprendidos entre 
* dos números introducidos por teclado y validados como distintos, el programa 
* debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
* 
* @author Salvador Rebollo Benítez
*/
public class Ejercicio18Salva { 
 public static void main(String[] args) {

   int numInt1;
   int numInt2;
   int numMenor = 0;
   int numMayor = 0;
   
   System.out.println("Por favor introduzca el primer número: ");
   numInt1 = Integer.parseInt(System.console().readLine());
   
   System.out.println("Por favor introduzca el segundo número: ");
   numInt2 = Integer.parseInt(System.console().readLine());
   
   if(numInt1 == numInt2){
     System.out.print("Error, introduce 2 números distintos.");
   }
   
   if(numInt1 < numInt2){
     numMenor = numInt1;
     numMayor = numInt2;
   } else{
     numMenor = numInt2;
     numMayor = numInt1;
   }
   

  for(int i = numMenor;i < numMayor; i += 7){
    System.out.print(i + " - ");
    
  }

  }
}
