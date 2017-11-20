/**
 * Ejercicio 13: Escribe un programa que simule la tirada de dos dados. El programa deberá 
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos 
 * dados tengan el mismo valor.
 * 
 * NOTA: Parte del codigo esta comentado porque en Windows no es posible mostrar
 * algunos caracteres y esto esta programado desde Windows.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio13Salva {
  public static void main (String[] args) {
    
    int dadoUno;
    int dadoDos;
    String dadoUnoString = "";
    String dadoDosString = "";
    
    do{
      dadoUno = ((int)(Math.random() * 6) + 1);
      dadoDos = ((int)(Math.random() * 6) + 1);
      
      System.out.println(dadoUno+ " " + dadoDos);
      
    /*switch(dadoUno) {
        case 1:
          dadoUnoString = "⚀";
          break;
          
        case 2:
          dadoUnoString = "2";
          break;
          
        case 3:
          dadoUnoString = "⚂";
          break;
          
        case 4:
          dadoUnoString = "⚃";
          break;
          
        case 5:
          dadoUnoString = "⚄";
          break;
          
        case 6:
          dadoUnoString = "⚅";
          break;
          
        default:
          break;
    }
    
    switch(dadoDos) {
        case 1:
          dadoDosString = "⚀";
          break;
          
        case 2:
          dadoDosString = "2";
          break;
          
        case 3:
          dadoDosString = "⚂";
          break;
          
        case 4:
          dadoDosString = "⚃";
          break;
          
        case 5:
          dadoDosString = "⚄";
          break;
          
        case 6:
          dadoDosString = "⚅";
          break;
          
        default:
          break;
    }
    
    System.out.println(dadoUnoString + " " + dadoDosString);
    */
    } while (dadoUno!=dadoDos);
    
      
    
  }
}
