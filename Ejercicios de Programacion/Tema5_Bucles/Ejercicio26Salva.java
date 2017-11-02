/**
 * Ejercicio 26: Realiza un programa que pida primero un número y a continuación un dígito. 
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a 
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio26Salva {
  public static void main (String[] args) {
    
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce un dígito que aparezca en el número introducido: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int numeroDelReves = 0;
    int posicion = 1;
    
    // le da la vueta al número y calcula la longitud
    do{
        numeroDelReves = (numeroDelReves * 10) + (numero % 10);
        numero /= 10;
            
    } while(numero>0);
    
    // Imprime en pantalla el mensaje inicial
    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
        
    // comprueba la/s posición/es y las imprime
      do{
          if ((numeroDelReves % 10) == digito) {
            System.out.print(posicion + " "); // impresion posiciones
          } //fin if
          
        numeroDelReves /= 10;
        posicion++;//fin while
      }while (numeroDelReves > 0);
  }
}
