/**
 * Ejercicio 35: Realiza un programa que pinte una X hecha de asteriscos. El programa debe 
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor 
 * o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * EJEMPLO:
 * Por favor, introduzca la altura de la X: 5
 * 
 *  *   *
 *   * *
 *    *
 *   * *
 *  *   *
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio35Salva {
  public static void main (String[] args) {
  
    System.out.print("Por favor, introduzca la altura de la X: ");
    int altura = Integer.parseInt(System.console().readLine()); //7
    int parteSuperior=(altura/2);//3
    int espacioIzq=0;
    
    int espacioInterior = (altura - 2); //5 e ira decrementando de 2 en 2
    int alturaVar=1;
    
    if ((altura < 3) || (altura % 2 == 0)) {
      System.out.print("Debe introducir una altura impar mayor a 3.");
    } 
    else {

    //PINTA PARTE SUPERIOR
    while(alturaVar <= parteSuperior){
      
      //Pinta espacio izquierdo
      
      for (int i = 1; i <= espacioIzq; i++){
          System.out.print(" ");
      }
      
      //Pinta primer caracter
      for (int i = alturaVar; i == alturaVar; i++){
        System.out.print("*");
      }
      
      //Pinta espacio interior
      
      for (int i = 1; i <= espacioInterior; i++){
        System.out.print(" ");
      }
      
      //Pinta ultimo caracter
      for (int i = alturaVar; i == alturaVar; i++){
        System.out.print("*");
      }
      System.out.println();
      espacioInterior-=2;
      alturaVar++;
      espacioIzq++;
    }
    
    alturaVar=1;
    espacioInterior = 0;
    
//PARTE INFERIOR
    int alturaParteInferior = (parteSuperior + 1);
    int espacioIzquierdoInferior = parteSuperior;
    
    while(alturaVar <= alturaParteInferior){
      //PINTA ESPACIO IZQUIERDO
      for (int i = 1; i <= espacioIzquierdoInferior ; i++){
        System.out.print(" ");
      }
      
      //Pinta primer caracter/todo
      if(alturaVar==1){
        System.out.print("*");
      } else{
          //Primer caracter
          System.out.print("*");
          //ESPACIO INTERIOR
          for (int i = 1 ; i < espacioInterior ; i++){
            System.out.print(" ");
          }
          //Ultimo caracter
          System.out.print("*");
        }
      System.out.println();
      
      espacioInterior+=2;
      espacioIzquierdoInferior--;
      alturaVar++;
    }
    }//fin del else 
  }
}
