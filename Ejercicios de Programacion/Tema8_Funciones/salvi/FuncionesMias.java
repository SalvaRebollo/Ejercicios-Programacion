/**
* Funciones matemáticas de propósito general
*
* @author Salvador Rebollo Benítez
*/
package salvi;
public class FuncionesMias{
  
 /**
 * Funcion ejercicio 01 - esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return Si el numero es capicua true/false
 */
public static boolean esCapicua(long x) {
  long copia = x;
  long volteado = 0;
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
 * Funcion ejercicio 01 - esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return Si el numero es capicua true/false
 */
public static boolean esCapicua(int x) {
  return esCapicua((long)x);
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
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero
 * @return siguiente numero primo despues de x.
 */
public static int siguientePrimo (int x) {
  while (!esPrimo(x++)) {};
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
public static int digitos(long x) {
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
 * @return Dígito que está en la posición n de un número entero.
 */
  public static int digitoN(long x, int n) {
    x = voltea(x);
    while (n-- > 0) {
      x = x / 10;
    }
   return (int)x % 10;
  }
  
 /**
 * Funcion ejercicio 08 - posicionDeDigito: Da la posición de la primera ocurrencia 
 * de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * @author Salvador Rebollo Benítez
 * @param x Digito del que queremos saber una posicion
 * @param d digito dentro del número x
 * @return Posicion del numero d en el número x
 */
  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }
  
/**
 * Funcion ejercicio 09 - quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 
 * @author Salvador Rebollo Benítez
 * @param x Digito del que queremos quitar por detras
 * @param n digitos a quitar por detras
 * @return Numero al le quitan n dígitos por detrás (por la derecha).
 */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
  
/**
 * Funcion ejercicio 10 - quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 
 * @author Salvador Rebollo Benítez
 * @param x Digito del que queremos quitar por delante
 * @param n digitos a quitar por detras
 * @return Numero al le quitan n dígitos por delante (por la izquierda).
 */
 public static long quitaPorDelante(long x, int n) {
  x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
  x = voltea(quitaPorDetras(voltea(x), n));
  x = quitaPorDetras(x, 1);
  return x;
}

/**
 * Funcion ejercicio 10 - quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 
 * @author Salvador Rebollo Benítez
 * @param x Digito del que queremos quitar por delante
 * @param n digitos a quitar por detras
 * @return Numero al le quitan n dígitos por delante (por la izquierda).
 */
public static int quitaPorDelante(int x, int n) {
  return (int)quitaPorDelante((long)x, n);
}
 /**
 * Funcion ejercicio 11 - pegaPorDetras: Añade un dígito a un número por detrás (por la derecha).
 * @param x número entero
 * @param d dígito que se le va a pegar por la derecha
 * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
 *          por la derecha
 */
public static long pegaPorDetras(long x, int d) {
  return juntaNumeros(x, d);
}

/**
 * Funcion ejercicio 12 - pegaPorDelante: Añade un dígito a un número por delante.
 *
 * @param x número entero
 * @param d dígito que se le va a pegar por la izquierda
 * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
 *          por la izquierda
 */
public static long pegaPorDelante(long x, int d) {
  return juntaNumeros(d, x);
}

/**
 * Funcion ejercicio 12 - pegaPorDelante: Añade un dígito a un número por delante.
 *
 * @param x número entero
 * @param d dígito que se le va a pegar por la izquierda
 * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
 *          por la izquierda
 */
public static int pegaPorDelante(int x, int d) {
  return (int)pegaPorDelante((long)x, d);
}

/**
 * Funcion ejercicio 13 - trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y
 * devuelve el trozo correspondiente.
 * <p>
 * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
 *
 * @param x      número entero
 * @param inicio posición inicial
 * @param fin    posición final
 * @return       trozo de número compuesto por todos los dígitos que van desde
 *               la posición inicial a la posición final incluyendo ambos
 */
public static long trozoDeNumero(long x, int inicio, int fin) {
  int longitud = digitos(x);
  x = quitaPorDelante(x, inicio);
  x = quitaPorDetras(x, longitud - fin - 1);
  return x;
}

/**
 * Funcion ejercicio 13 - trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y
 * devuelve el trozo correspondiente.
 * <p>
 * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
 *
 * @param x      número entero
 * @param inicio posición inicial
 * @param fin    posición final
 * @return       trozo de número compuesto por todos los dígitos que van desde
 *               la posición inicial a la posición final incluyendo ambos
 */
public static int trozoDeNumero(int x, int inicio, int fin) {
  return (int)trozoDeNumero((long)x, inicio, fin);
}

/**
 * Funcion ejercicio 14 - juntaNumeros: Pega dos numeros para formar uno
 * 
 * @author Salvador Rebollo Benítez
 * @param x Primer numero
 * @param y Segundo numero
 * @return El resultante de juntar x e y
 */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }


/**
 * Funcion ejercicio 14 - juntaNumeros: Pega dos numeros para formar uno
 * 
 * @author Salvador Rebollo Benítez
 * @param x Primer numero
 * @param y Segundo numero
 * @return El resultante de juntar x e y
 */
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
  
//*******MIS FUNCIONES********
/**
 * Funcion siguienteCapicua: Devuelve el menor capicua que es mayor al número que se pasa como parámetro.
 * 
 * @author Salvador Rebollo Benítez
 * @param x un número entero del que parte
 * @param y cantidad de numeros a analizar
 * @return Si el numero es capicua true/false
 */
  public static int siguienteCapicua (int x) {
    while (!esCapicua(x++)) { }
    return x--;
  }

  
}//fin public class

