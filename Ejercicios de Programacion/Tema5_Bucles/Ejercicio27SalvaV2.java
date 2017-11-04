/**
 * Ejercicio 27: Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio27SalvaV2 {
  public static void main (String[] args) {
    
    System.out.print("Introduce un numero limite: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int totalMultiplos = 0;
    int suma=0;
    
    
    
    System.out.print("\n- Los multiplos son: ");
	//Muestra múltiplos.
    for (int multiplos = 1; multiplos < numeroIntroducido; multiplos++) { //Cuando llegue al limite para
      if ((multiplos%3)==0){ //Esto significa que todos los numeros hasta numeroIntroducido que sean multiplos los va a mostrar
        System.out.print(multiplos + " ");//imprime los multiplos de 3 hasta numeroIntroducido.
        totalMultiplos++; //Actualiza con cada iteración la cantidad de multiplos.
        suma += multiplos; //Suma los múltiplos mostrados en el print de arriba.
      }
		}
    
	//Cuenta multiplos
 	System.out.println("\n- "+numeroIntroducido + " Posee un total de " + totalMultiplos + " multiplos de 3.");
	System.out.print("- La suma total es de: "+suma+".");
  }
}
