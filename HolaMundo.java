/* Ejercicio 9: Escribe un programa que pinte por pantalla alguna escena - el campo, la
habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
- un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
caracteres como *, +, <, #, @, etc. ¡Échale imaginación!
 */
 

public class HolaMundo {
  public static void main(String[] args) {
    

    String negro = "\033[30m";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println (naranja + "***PIANO***");
    System.out.println (verde + "Realizado por:");
    System.out.println (azul + "----SalviMiuC----");
    
    System.out.println (blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████");
    System.out.println (blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████");
    System.out.println (blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████");
    System.out.println (blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████");
    System.out.println (blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████" + negro + "███" + blanco + "██" + negro + "███" + blanco + "██" + negro + "███" + blanco + "████");
    System.out.println ("████████████████████████████████████████████████████████████");
    System.out.println ("████████████████████████████████████████████████████████████");
    System.out.println ("████████████████████████████████████████████████████████████");

  }
}
