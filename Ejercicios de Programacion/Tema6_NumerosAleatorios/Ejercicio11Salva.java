/**
 * Ejercicio 11: Escribe un programa que muestre 20 notas generadas al azar. Las notas deben 
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al 
 * final aparecerá el número de suspensos, el número de suficientes, el número 
 * de bienes, etc.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio11Salva {
  public static void main (String[] args) {
    
    int numNotaRandom;
    String stringNota = "";
    int notasMostradas=0;
    
    int numSuspensos = 0;
    int numSuficientes = 0;
    int numBienes = 0;
    int numNotables = 0;
    int numSobresalientes = 0;
    
    do{
      numNotaRandom = (int)(Math.random() * 11);
      
      if (numNotaRandom < 5){
        stringNota = " Suspenso";
        numSuspensos++;
      }
      
      if (numNotaRandom == 5){
        stringNota = " Suficiente";
        numSuficientes++;
      }
      
      if (numNotaRandom == 6){
        stringNota = " Bien";
        numBienes++;
      }
      
      if (numNotaRandom == 7 || numNotaRandom == 8){
        stringNota = " Notable";
        numNotables++;
      }
      
      if (numNotaRandom == 9 || numNotaRandom == 10){
        stringNota = " Sobresaliente";
        numSobresalientes++;
      }
      
      System.out.println(numNotaRandom + stringNota);
      
      
      
      
      notasMostradas++;
    } while (notasMostradas!=20);
    
    System.out.println();
    
    System.out.println("- Hay un total de "+ numSuspensos + " notas suspensas.");
    System.out.println("- Hay un total de "+ numSuficientes + " notas con suficiente.");
    System.out.println("- Hay un total de "+ numBienes + " notas bien.");
    System.out.println("- Hay un total de "+ numNotables + " notas notables.");
    System.out.println("- Hay un total de "+ numSobresalientes + " notas sobresalientes.");
    
    
  }
}
