import salvi.Funciones;

public class pruebaFunciones {
public static void main(String[] args) {
  int numero;
  int x;
  int y;
  
  //Funcion ejercicio 01 - esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
  System.out.print("Funcion 01 esCapicua-Introduzca un numero entero positivo para saber si es capicua: ");
  numero = Integer.parseInt(System.console().readLine());
  Funciones.voltea(numero);
  if (Funciones.esCapicua(numero) == true) {
    System.out.println("Su número volteado es capicua.\n");
  } else {
    System.out.println("Su número volteado NO es capicua.\n");
  }
  
  //Funcion ejercicio 02 - esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
  System.out.print("Funcion 02 esPrimo-Introduzca un numero entero positivo para saber si es primo: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("¿Es " + numero + " primo?: " + salvi.Funciones.esPrimo(numero) + "\n");
  
  //Funcion ejercicio 03 - siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
  System.out.print("Funcion 03 siguientePrimo: Introduzca un numero: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("El siguiente numero primo despues de " + numero + " es: " + salvi.Funciones.siguientePrimo(numero) + "\n");
  
  //Funcion ejercicio 04 - potencia: Dada una base y un exponente devuelve la potencia.
  System.out.print("Funcion 04 potencia-Introduzca una base: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca un exponente: ");
  int exponente = Integer.parseInt(System.console().readLine());
  System.out.println(base + "^" + exponente + " = " + salvi.Funciones.potencia(base, exponente) + "\n");
  
  //Funcion ejercicio 05 - digitos: Cuenta el número de dígitos de un número entero.
  System.out.print("Funcion 05 digitos-Introduzca un número entero positivo: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println(numero + " tiene " + salvi.Funciones.digitos(numero) + " dígitos.\n");
  
  //Funcion ejercicio 06 - voltea: Le da la vuelta a un número.
  System.out.print("Funcion 06 voltea-Introduce un número entero: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("Su número volteado es: " + Funciones.voltea(numero) + "\n");
  
  //Funcion ejercicio 07 - digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha
  System.out.print("Funcion 07 digitoN-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca la posicion del numero a sacar: ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("La cifra hayada en la posición " + y + " es: " + Funciones.digitoN(x, y) + "\n");
  
  //Funcion ejercicio 08 - posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
  System.out.print("Funcion 08 posicionDeDigito-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el numero que quieres ver su posicion: ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("La posicion de la cifra " + y + " en el numero " + x + " es: " + Funciones.posicionDeDigito(x, y) + "\n");
  
  //Funcion ejercicio 09 - quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
  System.out.print("Funcion 09 quitaPorDetras-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca los digitos a quitar por detras: ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("Resultado: " + Funciones.quitaPorDetras(x, y) + "\n");
  
  //Funcion ejercicio 10 - quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda). 
  System.out.print("Funcion 10 quitaPorDelante-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca los digitos a quitar por delante: ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("Resultado: " + Funciones.quitaPorDelante(x, y) + "\n");
  
  //Funcion ejercicio 11 - pegaPorDetras: Añade un dígito a un número por detrás.
  System.out.print("Funcion 11 pegaPorDetras-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el dígito que se le va a pegar por la derecha ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("Resultado: " + Funciones.pegaPorDetras(x, y) + "\n");
  
  //Funcion ejercicio 12 - pegaPorDelante: Añade un dígito a un número por delante.
  System.out.print("Funcion 12 pegaPorDelante-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el dígito que se le va a pegar por la izquierda ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("Resultado: " + Funciones.pegaPorDelante(x, y) + "\n");
  
  //Funcion ejercicio 13 - trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
  System.out.print("Funcion 13 trozoDeNumero-Introduce un número entero: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca la posicion inicial: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca la posicion final: ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("Resultado: " + Funciones.trozoDeNumero(numero, x, y) + "\n");
  
  //Funcion ejercicio 14 - juntaNumeros: Pega dos números para formar uno.
  System.out.println("Funcion 14 juntaNumeros-Introduzca el primer numero: ");
  int primerNum = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el segundo numero: ");
  int segunNum = Integer.parseInt(System.console().readLine());
  System.out.println(primerNum + " junto a " + segunNum + " hacen el número: " + salvi.Funciones.juntaNumeros(primerNum, segunNum) + ".");
}
}
