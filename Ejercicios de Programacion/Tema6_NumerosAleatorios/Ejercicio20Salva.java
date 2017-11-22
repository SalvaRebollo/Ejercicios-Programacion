/**
 * Ejercicio 20: Realiza un programa que pinte por pantalla una cuba con cierta cantidad de 
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una 
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que 
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio20Salva {
  public static void main (String[] args) {
    
    System.out.println("Por favor introduzca la capacidad en litros de la cuba: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    int agua = ((int)(Math.random() * capacidad));
    System.out.println();
    
    //Saco una variable igual que capacidad y...
    //Mientras que la capacidad sea mayor que el agua
    for (int varCapacidad = capacidad; varCapacidad > agua ; varCapacidad--){
      System.out.println("┃       ┃"); //pinta vacio
    }
    
    //Despues, pinta el resto, con una variable en 0
    for (int i = 0; i < agua; i++){
      System.out.println("┃▒▒▒▒▒▒▒┃");
    }
    
    //Pinta suelo de la cuba.
    System.out.print("┗━━━━━━━┛");
    
    //Datos de interes
    System.out.println();
    System.out.println("- La capacidad de la cuba es de " + capacidad + " litros.");
    System.out.println("- Se ha llenado con " + agua + " litros.");
  }
}
