/**
 * Ejercicio 34: Escribe un programa que pida dos números por teclado y que luego mezcle en 
 * dos números diferentes los dígitos pares y los impares. Se van comprobando 
 * los dígitos de la siguiente manera: primer dígito del primer número, primer 
 * dígito del segundo número, segundo dígito del primer número, segundo 
 * dígito del segundo número, tercer dígito del primer número… Para facilitar 
 * el ejercicio, podemos suponer que el usuario introducirá dos números de la 
 * misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa 
 * long en lugar de int donde sea necesario para admitir números largos.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio34Salva {
  public static void main (String[] args) {
//1. INTRODUCCION DE NUMERO
    System.out.println("Por favor introduzca un número entero: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numero = numeroIntroducido;
    
    System.out.println("Por favor introduzca otro número entero: ");
    long numero2Introducido = Long.parseLong(System.console().readLine());
    long numero2 = numero2Introducido;
    
    long volteado=0;
    long volteado2=0;
    
    long auxVolteado=0;
    long auxVolteado2=0;
    
    int longitud=0; //Se usara mas adelante
//1. FIN INTRODUCCION DE NUMERO.    
    
//2. Voltea los numero por primera vez, si numeroIntroducido es: 1234, sacara: 4321 y lo almacenara en otra variable.

    //Voltea primer numero introducido
    do{
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++; //Se usara mas adelante
      auxVolteado=volteado;

      
    } while(numero>0);
    
    //Voltea el segundo numero introducido
    do{
      volteado2 = (volteado2 * 10) + (numero2 % 10);
      numero2 /= 10;
      auxVolteado2=volteado2;
      
    } while(numero2>0);
//2. FIN Volteo del número. La variable volteado=4321
    
    System.out.print("- Los digitos pares de los numeros introducidos son: ");

//3. RE-VOLTEO el primer numero, osea la variable volteado, esto lo hago para que me muestre los numeros pares e impares en su orden correcto.    
    long segundoVolteo = 0;
    long segundoVolteo2 = 0;
    
    long auxSegundoVolteo=0;
    long auxSegundoVolteo2=0;


    //re-volteo primer numero
    for (int i = 1; i <= longitud; i++){ //Bucle que repetira lo programado dentro hasta que i llegue a ser 4, porque 1234 tiene 4 digitos de longitud.
      
      segundoVolteo = (volteado % 10);
      volteado /= 10;
      segundoVolteo2 = (volteado2 % 10);
      volteado2 /= 10;

      //Si el ultimo digito de segundoVolteo y segundoVolteo2 su resto entre 2 da 0, significa que ese ultimo digito es par.
      if(segundoVolteo%2==0){
        System.out.print(segundoVolteo +" "); //Y como es, lo imprimo.
      } 
      
      if (segundoVolteo2%2==0){
        System.out.print(segundoVolteo2 +" "); //Y como es, lo imprimo.
      }
      
    }
//3. FIN DE RE-VOLTEO.

    System.out.println();
    System.out.print("- Los digitos impares de los numeros introducidos son: ");

//4. RE-VOLTEO el segundo numero, osea la variable volteado2, esto lo hago para que me muestre los numeros pares e impares en su orden correcto.    
    //re-volteo segundo numero
    for (int i = 1; i <= longitud; i++){ //Bucle que repetira lo programado dentro hasta que i llegue a ser 4, porque 1234 tiene 4 digitos de longitud.
      
      auxSegundoVolteo=(auxVolteado%10);
      auxVolteado /=10;
      auxSegundoVolteo2=(auxVolteado2%10);
      auxVolteado2 /=10;

      //Si el ultimo digito de auxSegundoVolteo y auxSegundoVolteo2 su resto entre 2 NO da 0, significa que ese ultimo digito es impar.
      if(auxSegundoVolteo%2!=0){
        System.out.print(auxSegundoVolteo +" "); //Y como es, lo imprimo.
      } 
      
      if(auxSegundoVolteo2%2!=0){
        System.out.print(auxSegundoVolteo2 +" "); //Y como es, lo imprimo.
      }
      
    }
    
  }
}
