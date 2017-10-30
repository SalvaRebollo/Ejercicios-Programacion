/**
* Ejercicio 20: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
* 
* Programa que construye una piramide en base a 3 criterios: 
* altura, caracter exterior y caracter interior.
* 
* @author Salvador Rebollo Benítez.
*/
public class Ejercicio20SalvaMejorado { 
 public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine()); //10
    
    //int base = ((alturaIntroducida*2)-1); //19
    
    //int interior = (base - 2); //17
    
    int espacios = (alturaIntroducida -1); //9

    System.out.print("Por favor, introduzca el carácter de construcción del EXTERIOR: ");
    String caracter = System.console().readLine();
    
    System.out.print("Por favor, introduzca el carácter de construcción del INTERIOR: ");
    String caracterInterior = System.console().readLine();
    
    
    
    int alturaVar = 0;
    int i;
    
    while (alturaVar <= alturaIntroducida-1) {
     
      //Pinta espacio
      
      for (i = 1; i <= espacios; i++) {
        
        System.out.print(" ");
      }
      
      //Pinta primer caracter
      System.out.print(caracter);
      
      //Pinta relleno interior
      
      if(alturaVar == alturaIntroducida-1){
        for (i = 1; i < (alturaVar*2); i++) {
          
          System.out.print(caracter);
        }
        
      } else{
            for (i = 1; i <= (alturaVar*2)-1; i++) {
              
              System.out.print(caracterInterior);
            }
        }
      
      //Pinta último caracter
      if(i == 1){ //Si i = 1 no pintara el ultimo caracter de la punta de la piramide
      } else{
        System.out.print(caracter);
      }
      
      
      //Pinta nueva línea
      System.out.println();

      //Pone a raya a los bucles
      alturaVar++;
      espacios--;
    }
  }
}
