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
    System.out.println("Su número volteado es capicua. ");
  } else {
    System.out.println("Su número volteado NO es capicua.");
  }
  
  //Funcion ejercicio 02 - esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
  System.out.print("Funcion 02 esPrimo-Introduzca un numero entero positivo para saber si es primo: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("¿Es " + numero + " primo?: " + salvi.Funciones.esPrimo(numero));
  
  //Funcion ejercicio 03 - siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
  System.out.println("Funcion 03 siguientePrimo: Introduzca un numero: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("El siguiente numero primo despues de " + numero + " es: " + salvi.Funciones.siguientePrimo(numero));
  
  //Funcion ejercicio 04 - potencia: Dada una base y un exponente devuelve la potencia.
  System.out.println("Funcion 04 potencia-Introduzca una base: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca un exponente: ");
  int exponente = Integer.parseInt(System.console().readLine());
  System.out.println(base + " elevado a " + exponente + " = " + salvi.Funciones.potencia(base, exponente));
  
  //Funcion ejercicio 05 - digitos: Cuenta el número de dígitos de un número entero.
  System.out.print("Funcion 05 digitos-Introduzca un número entero positivo: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println(numero + " tiene " + salvi.Funciones.digitos(numero) + " dígitos.");
  
  //Funcion ejercicio 06 - voltea: Le da la vuelta a un número.
  System.out.print("Funcion 06 voltea-Introduce un número entero: ");
  numero = Integer.parseInt(System.console().readLine());
  System.out.println("Su número volteado es: " + Funciones.voltea(numero));
  
  //Funcion ejercicio 07 - digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha
  System.out.print("Funcion 07 digitoN-Introduce un número entero: ");
  x = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca la posicion del numero a sacar: ");
  y = Integer.parseInt(System.console().readLine());
  System.out.println("La cifra hayada en la posición " + y + " es: " + Funciones.digitoN(x, y));
  
  //Funcion ejercicio 08 - posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
  
  
  //Funcion ejercicio 09 - quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
  
  
  //Funcion ejercicio 10 - quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda). 
  
  
  //Funcion ejercicio 11 - pegaPorDetras: Añade un dígito a un número por detrás.
  
  
  //Funcion ejercicio 12 - pegaPorDelante: Añade un dígito a un número por delante.
  
  
  //Funcion ejercicio 13 - trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
  
  
  //Funcion ejercicio 14 - juntaNumeros: Pega dos números para formar uno.
  System.out.println("Funcion 14 juntaNumeros-Introduzca el primer numero: ");
  int primerNum = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el segundo numero: ");
  int segunNum = Integer.parseInt(System.console().readLine());
  System.out.println(primerNum + " junto a " + segunNum + " hacen el número: " + salvi.Funciones.juntaNumeros(primerNum, segunNum) + ".");
}
}
