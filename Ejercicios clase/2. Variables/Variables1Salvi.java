/**Ejercicio 1: Escribe un programa en el que se declaren las variables enteras x e y. Asignales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
*/
public class Variables1Salvi {
  public static void main(String[] args) {
    int x; // Con int declaramos la variable, en este caso de num.entero.
    int y;
    
    x = 144; //Posteriormente hemos indicado el valor de cada variable.
    y = 999;
    
    System.out.println("La variable X vale: " + x);
    System.out.println("La variable Y vale: " + y);
    
    System.out.println("**Hagamos algunas operaciones**");
    System.out.println("Suma x+y: " + (x + y));
    System.out.println("Resta y-x: " + (y-x));
    System.out.println("Multiplica x*y: " + (x*y));
    System.out.println("Divide y/x: " + (y/x));
  }
}
