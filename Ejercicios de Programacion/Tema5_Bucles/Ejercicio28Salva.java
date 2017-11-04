/**
 * Ejercicio 28: Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * Ejemplo:
 * Por favor, introduzca un numero entero: 6
 * 6! = 720
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio28Salva {
  public static void main (String[] args) {
    int numeroIntroducido;
    int respuesta=1;
    int n=2;
    
    //Introducción de datos con una condicion: que no sea menor ni igual que 0.
    do{
      System.out.print("Por favor introduzca un número mayor que 0 para saber su factorial:");
      numeroIntroducido=Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido<=0){
        System.out.println("El número introducido es menor o igual que 0. El factorial de 0! es: 1.");
        }
        
    } while (numeroIntroducido<=0);
    
    //Calculo del factorial
    for (int i = 1; i < numeroIntroducido; i++){ //Aqui i solo sirve para acabar el bucle.
        respuesta*=n; //respuesta=1*2
        
        n++;
        
    }
    
    System.out.print("El factorial de "+numeroIntroducido+"! es: "+respuesta+".");
    
  }
}

