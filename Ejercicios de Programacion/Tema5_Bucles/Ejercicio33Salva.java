/**
 * Ejercicio 33: Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El 
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta 
 * dos asteriscos menos en la base para simular la curvatura de las esquinas 
 * inferiores.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio33Salva {
  public static void main (String[] args) {
    
    System.out.println("Por favor introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine())-1; //Si introduzco 5, sera 4.
    
    System.out.println("Por favor introduzca el caracter de construccion: ");
    String caracter=System.console().readLine();
    
    System.out.println("");
    int alturaVar = 1;
    int linea=(altura+1)-2;
    
    while(alturaVar <= altura){
      
      //Pinta primer caracter
      for (int i = alturaVar; i == alturaVar; i++){
        System.out.print(caracter);
      }
      
      //Pinta espacio
      
      for (int i = 1; i <= linea; i++){
        System.out.print("  ");
      }
      
      //Pinta ultimo caracter
      for (int i = alturaVar; i == alturaVar; i++){
        System.out.print(" "+caracter);
        
      }
      System.out.println();
      alturaVar++;
    }
    
    //Pinta linea
    System.out.print("  ");
    for (int i = 1; i <= linea; i++){
      System.out.print(caracter+" ");
    }
    
  }
}
