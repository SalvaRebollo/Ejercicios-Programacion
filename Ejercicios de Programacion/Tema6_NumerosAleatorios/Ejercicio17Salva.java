/**
 * Ejercicio 17: Realiza un programa que pinte por pantalla una pecera con un pececito dentro. 
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo 
 * serán de 4 unidades. No hay que comprobar que los datos se introducen 
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro 
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar 
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el 
 * rectángulo.
 * 
 * @author Salvador Rebollo Benítez
 */

public class Ejercicio17Salva {
  public static void main (String[] args) {
    
    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int alturaRandom = (int)(Math.random() * (altura-2));
    int anchuraRandom = (int)(Math.random() * (anchura-2));

    //Parte de arriba, tapadera
    System.out.print("┏");
    for (int i = 1; i <= anchura-2; i++) {
      System.out.print("━");
    }
    System.out.print("┓");
    System.out.println();
    //FIN PARTE DE ARRIBA,TAPADERA
    
    //MAGIA (descripcion)
      /* Esto es un bucle con otro bucle dentro, 
       * el primero dibuja las paredes.(señalo con comentarios)
       * el segundo dibujara agua hasta que que se alineen los astros.
       * si la sentencia que hay dentro del if del for interior se cumple
       * pinta un pescadito, si no, pinta agua.
       */
    for (int i = 1; i <= altura - 2; i++) {
      System.out.print("┃"); //dibuja pared derecha
      
      for (int j = 1; j <= anchura - 2; j++) {
        if ((i == alturaRandom)&&(j == anchuraRandom)) {
          System.out.print("🐟");
        } else {
          System.out.print("░");
        }
      }//for interior
      
      System.out.println("┃");//dibuja pared izquierda
    }
    //FIN DE LA MAGIA
    
    //SUELO
    System.out.print("┗");
    for (int i = 0; i < anchura-2; i++) {
      System.out.print("━");
    }
    System.out.print("┛"); 
    //FIN DE SUELO
  }
}
