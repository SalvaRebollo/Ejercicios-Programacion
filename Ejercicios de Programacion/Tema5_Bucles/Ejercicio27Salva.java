/**
 * Ejercicio 27: Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio27Salva {
  public static void main (String[] args) {
    
    System.out.print("Introduce un numero limite: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int numero = numeroIntroducido;
    int suma=0;

	//Muestra múltiplos.
    for (int multiplo = 1; multiplo <= numeroIntroducido; multiplo++) {
		
		int resultado = (3*multiplo);
		System.out.println(3 + " * "+ multiplo +" = " + (resultado));
		//suma
		suma+=(resultado);
 }
	//Cuenta multiplos
 	System.out.println("\nPosee un total de " + numeroIntroducido + " multiplos.");
	System.out.print("La suma total es de: "+suma+".");
}
}
