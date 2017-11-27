/**
 * Ejercicio 16: Realiza un simulador de máquina tragaperras simplificada que cumpla los 
 * siguientes requisitos: 
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 
 * figuras posibles: corazón, diamante, herradura, campana y limón. 
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, 
 * ha perdido”. 
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, 
 * ha recuperado su moneda”. 
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio16Salva {
  public static void main (String[] args) {
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    
    for (int i = 1; i <= 3 ; i++){
      int numFig = ((int)(Math.random() * 5) + 1);
      
      switch(numFig) {
          case 1:
            System.out.print("corazón ");
            contador1++;
            break;
          case 2:
            System.out.print("diamante ");
            contador2++;
            break;
          case 3:
            System.out.print("herradura ");
            contador3++;
            break;
          case 4:
            System.out.print("campana ");
            contador4++;
            break;
          case 5:
            System.out.print("limón ");
            contador5++;
            break;
          default:
            break;
      }//switch
      
      
    }//for
    System.out.println();
    if (contador1 == 3 || contador2 == 3 || contador3 == 3 || contador4 == 3 || contador5 == 3) {
      System.out.print("¡Enhorabuena! ¡Has ganado 10 monedas!");
    } else if (contador1 == 2 || contador2 == 2 || contador3 == 2 || contador4 == 2 || contador5 == 2) {
      System.out.print("Has recuperado tu moneda");
      } else {
        System.out.print("Lo siento, has perdido");
      }
  }
}
