/**
 * Ejercicio 21: Realiza un programa que vaya pidiendo números hasta que se introduzca un 
 * numero negativo y nos diga cuantos números se han introducido, la media de 
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para 
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * Nos pide: 
 * 
 * cantidad de numeros introducidos
 * media de los impares
 * mayor de los pares
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio21Salva {
  public static void main (String[] args) {
    
    System.out.println("Por favor, vaya introduciendo numeros, para finalizar introduzca un num.negativo: ");
    
    int numeroIntroducido;
    int cantNumIntroducidos = 0;
    int sumaImpares = 0;
    int cantNumIntroducidosImpares = 0;
    int maximoPar = 0;
    
    do{
      
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido>=0){
        cantNumIntroducidos++;
          if( (numeroIntroducido % 2) == 1 ){
            cantNumIntroducidosImpares++;
            sumaImpares+=numeroIntroducido;
            
          } else{
              if(numeroIntroducido>maximoPar){
                maximoPar=numeroIntroducido;
              }
            }
      }
      
    } while (numeroIntroducido >=0);
    
    int mediaImpar = sumaImpares/cantNumIntroducidosImpares;
    
    System.out.println("- Has introducido " + cantNumIntroducidos + " números.");
    System.out.println("- La media de los numeros impares introducidos es: " + mediaImpar + ".");
    System.out.println("- El número par más alto introducido es: " + maximoPar + ".");
    
    
  }
}
