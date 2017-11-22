/**
 * Ejercicio 14: Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. 
 * El programa intentará adivinar el número que estás pensando - un número 
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el 
 * programa debe preguntar si el número que estás pensando es mayor o menor 
 * que el que te acaba de decir.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio14Salva {
  public static void main (String[] args) {
    
    int oportunidades = 5;
    int maximo = 100;
    int minimo = 0;
    int numeroOcurrido;
    int pregunta;
    boolean acertado = false;
    
    System.out.println("Voy a tratar de adivinar el número que estás pensando.");
    System.out.println("Debe comprenderse entre 0 y 100. Tengo 5 intentos ¿Vale?.");
    
    do{
      numeroOcurrido = ((int)(Math.random() * (maximo - minimo) + minimo));
      System.out.println("\nCreo que es el " + numeroOcurrido + " cierto?");
      System.out.print("\nUna pregunta, el número que has pensado es...");
      System.out.print("\n1) Mayor 2) Menor 3) ¿O he acertado? Dímelo:\n");
      pregunta = Integer.parseInt(System.console().readLine());
      
      if (pregunta == 1) {
        minimo = numeroOcurrido + 1;
      }
      
      if (pregunta == 2) {
        maximo = numeroOcurrido -1;
      }
      
      if (pregunta == 3) {
        System.out.println("Soy la MÁQUINA, ¡he acertado! :D");
        acertado = true;
      }
      
      
      oportunidades--;
    } while (!acertado && oportunidades!=0);
    
    if (oportunidades==0 || acertado){
      System.out.print("\n- Ow :c No he conseguido adivinarlo, otra vez será.");
    }
  }
}
