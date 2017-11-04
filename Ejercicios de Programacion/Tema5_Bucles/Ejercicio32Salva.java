/**
 * Ejercicio 32: Escribe un programa que, dado un número entero, diga cuáles son y cuánto 
 * suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de 
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir 
 * números largos.
 * 
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio32Salva {
  public static void main (String[] args) {
    
//1. INTRODUCCION DE NUMERO
    System.out.println("Por favor introduzca un número entero: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numero = numeroIntroducido;
    
    long volteado=0;
    
    int suma = 0;
    int longitud=0; //Se usara mas adelane
//1. FIN INTRODUCCION DE NUMERO.    
    
//2. Voltea el numero por primera vez, si numeroIntroducido es: 1234, sacara: 4321 y lo almacenara en otra variable.
    do{
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++; //Se usara mas adelante
      
    } while(numero>0);
//2. FIN Volteo del número. La variable volteado=4321
    
    System.out.print("- Los digitos pares del numero "+numeroIntroducido+" son: ");

//3. RE-VOLTEO la variable volteado, esto lo hago para que me muestre los numeros pares en su orden correcto.    
    long segundoVolteo = 0;
    
    for (int i = 1; i <= longitud; i++){ //Bucle que repetira lo programado dentro hasta que i llegue a ser 4, porque 1234 tiene 4 digitos de longitud.
      
      segundoVolteo = (volteado % 10);
      volteado /= 10;
      
      //Si el ultimo digito de segundoVolteo su resto entre 2 da 0, significa que ese ultimo digito es par.
      if(segundoVolteo%2==0){
        System.out.print(segundoVolteo +" "); //Y como es, lo imprimo.
        suma+=segundoVolteo; //Y lo sumare, para mostrarlo luego en pantalla.       
      }
    }
//3. FIN RE-VOLTEO

    System.out.println("\n- La suma de los digitos pares del numero "+numeroIntroducido+" es: "+suma+".");
  
  }
}
