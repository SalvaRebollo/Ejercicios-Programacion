/**
* Ejercicio 16: Escribe un programa que pase de decimal a binario.
* 
* @author Salvador Rebollo Benítez
*/
import salvi.*;

public class ejercicio18Salva {
public static void main(String[] args) {
  System.out.print("Escrime un numero para pasar de decimal a binario: ");
  int decimal = Integer.parseInt(System.console().readLine());
  long binario = FuncionesMias.decaBin(decimal);
  
  
  System.out.println("- Binario: " + binario);
  }
}
