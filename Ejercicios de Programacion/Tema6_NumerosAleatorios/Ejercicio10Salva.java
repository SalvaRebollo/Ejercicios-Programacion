/**
 * Ejercicio 10: Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
 * El carácter con el que se pinta cada línea se elige de forma aleatoria 
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud 
 * aleatoria entre 1 y 40 caracteres.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio10Salva {
  public static void main (String[] args) {
    
    
    int longitudRandom;
    String stringCaracter = "";
    int lineasHechas=0;
    
    do{
      //Para elegir que caracter usar en cada linea
      switch(((int)(Math.random() * 6)+1)) {
        case 1:
          stringCaracter = "*";
          break;
          
        case 2:
          stringCaracter = "-";
          break;
          
        case 3:
          stringCaracter = "=";
          break;
          
        case 4:
          stringCaracter = ".";
          break;
          
        case 5:
          stringCaracter = "|";
          break;
          
        case 6:
          stringCaracter = "@";
          break;
          
        default:
          break;
      }
      
      //Para elegir cuantos caracteres por linea se deben dibujar
      longitudRandom = ((int)(Math.random() * 40)+1);
      
      for (int i = 1; i <= longitudRandom; i++){
        System.out.print(stringCaracter); //Dibuja el caracter
      }
      
      System.out.println();
      System.out.println();

      lineasHechas++;
    } while (lineasHechas!=10);
    
    
  }
}
