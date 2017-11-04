/**
 * Ejercicio 29: Escribe un programa que muestre por pantalla todos los números enteros 
 * positivos menores a uno leído por teclado que no sean divisibles entre otro 
 * también leído de igual forma.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio29Salva {
  public static void main (String[] args) {
    
  System.out.println("**Te voy a mostrar todos los numeros enteros positivos menores al limite ");
  System.out.println("que NO sean divisibles entre otro que me digas(divisor)**\n\n");

  //Primero pedimos los dos numeros.
  System.out.println("Por favor, introduzca numero límite: ");
  int limite = Integer.parseInt(System.console().readLine());
  
  System.out.println("Por favor, introduzca el divisor:");
  int divisor = Integer.parseInt(System.console().readLine());

//--------------------Heavy Code Area-------------------------------------------
  
  System.out.println("- Los números enteros positivos menores a " + limite + " que no son divisibles");
  System.out.print("  entre " + divisor + " son: " );

  //Va a incrementar dividendos hasta que llegue al numero anterior de limite
  for (int dividendo = 1; dividendo < limite ; dividendo++){
    //Si el resto NO es 0 (quiere decir que no son divisores), lo muestra.
    if((dividendo%divisor)!=0){
      System.out.print(dividendo + " ");
    }
    //Un ejemplo seria: 5/2 = da decimales, por lo tanto su resto no será 0 y saldría en pantalla (si 2 fuera el divisor).
  }
  
  }
}

