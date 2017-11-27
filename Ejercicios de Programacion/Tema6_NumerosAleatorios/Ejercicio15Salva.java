/**
 * Ejercicio 15: Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, 
 *    sol, la y si. 
 * 
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual 
 *    a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12, 16, 20, 24,28). 
 * 
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente 
 *    compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca 
 *    con dos barras. 
 * 
 * d) La última nota de la melodía debe coincidir con la primera
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio15Salva {
  public static void main (String[] args) {
    
    String stringNota = "";
    String stringAuxPrimNota = "";
    boolean esMultiplo = false;
    int numCompases = ((int)(Math.random() * 25) + 4);
    int auxPrimNota = 0;
    int contadorNotas = 0;
    
    //Hacer que el numero de compases sea multiplo de 4.
    while (!esMultiplo) {
      if (numCompases % 4 != 0) {
        numCompases = ((int)(Math.random() * 25) + 4);
      } else {
          esMultiplo = true;
        }
    }
    
    //Bucle notas
    do{
      for (int i = 1; i <= 4 ; i++){
        int nota = ((int)(Math.random() * 7) + 1);
        
        switch(nota) {
          case 1:
            stringNota = "do ";
            break;
            
          case 2:
            stringNota = "re ";
            break;
            
          case 3:
            stringNota = "mi ";
            break;
          case 4:
            stringNota = "fa ";
            break;
          case 5:
            stringNota = "sol ";
            break;
          case 6:
            stringNota = "la ";
            break;
          case 7:
            stringNota = "si ";
            break;
            
          default:
            break;
        }
        
        contadorNotas++;
        
        if (contadorNotas == 1) {
          stringAuxPrimNota = stringNota;
        }
        
        if (contadorNotas == numCompases ) {
          stringNota = stringAuxPrimNota;
        }
        
        System.out.print(stringNota);
      } //for
      
      if ( contadorNotas == numCompases ) {
        System.out.print("||");
      } else if ( contadorNotas % 4 == 0 ) {
          System.out.print("| ");
        }
      
      
    } while (numCompases != contadorNotas);

    
  }
}
