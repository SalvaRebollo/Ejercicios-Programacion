/**
* Funciones matemáticas de propósito general
*
* @author Salvador Rebollo Benítez
*/
package salvi;
public class Funciones{
  
 /**
 * Funcion ejercicio 01 - esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return Si el numero es capicua true/false
 */
public static boolean esCapicua(int x) {
  int copia = x;
  int volteado = 0;
  while (x > 0) {
    volteado = (volteado * 10) + (x % 10);
    x = x / 10;
  }
  if (volteado == copia) {
    return true;
  } else {
    return false;
  }
}

 /**
 * Funcion ejercicio 02 - esPrimo: Devuelve verdadero si el número que se pasa como parámetro 
 * es primo y falso en caso contrario.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return true si el número es primo
 * @return false en caso contrario
 */
public static boolean esPrimo(int x) {
  
  for (int i = 2; i < x; i++){
    if ((x % i) == 0) {
      return false;
    }
  }
  return true; //Resetear funcion
}

 /**
 * Funcion ejercicio 03 - siguienteprimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * es primo y falso en caso contrario.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return siguiente numero primo despues de x.
 */
public static int siguientePrimo (int x) {
  while (!esPrimo(++x)) {};
  return x;
}

/**
 * Funcion ejercicio 04 - potencia: Dada una base y exponente devuelve su potencia
 * 
 * @author Salvador Rebollo Benítez
 * @param x, base
 * @param y, exponente
 * @return La potencia dada de x elevado a y.
 */
public static int potencia (int x, int y) {
  int potencia;
  if (y == 0) {
    potencia = 1;
  } else {  
    potencia = x;
    for (int i = 0; i < y - 1; i++) {
      potencia *= x;
    }
  }
  return potencia;
}
 
 /**
 * Funcion ejercicio 05 - digitos: Cuenta el número de dígitos de un número entero.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return la cantidad de dígitos que contiene el número
 */
public static int digitos(int x) {
  if (x == 0) {
    return 1;
  } else {
    int n = 0;
    while (x > 0) {
      x = x / 10;
      n++;
    }
    return n;
  }
}

/**
 * Funcion ejercicio 06 - voltea: Le da la vuelta a un número.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return El numero X volteado.
 */
 
public static long voltea(long x) {
  long volteado = 0;
  while (x > 0) {
    volteado = (volteado * 10) + (x % 10);
    x = x / 10;
  }
  return volteado;
}

/**
 * Funcion ejercicio 07 - digitoN: Devuelve el dígito que está en la posición n de un número 
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @author Salvador Rebollo Benítez
 * @param x número entero
 * @param n posición dentro del número x
 * @return dígito que está en la posición n del número x empieza a contar por el 0 y de izquierda a derecha
 */
  public static int digitoN(long x, int n) {
    x = voltea(x);
    while (n-- > 0) {
      x = x / 10;
    }
   return (int)x % 10;
  }

/**
 * Funcion ejercicio 14 - juntaNumeros: Pega dos numeros para formar uno
 * 
 * @author Salvador Rebollo Benítez
 * @param x Primer numero
 * @param y Segundo numero
 * @return El resultante de juntar x e y
 */
  public static int juntaNumeros (int x, int y) {
    int longitud = Funciones.digitos(x);
    x *= Funciones.potencia(10, longitud);
    return x + y;
  }


}

