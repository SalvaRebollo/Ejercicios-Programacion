import salvi.Funciones;

public class ejercicio15Salva {
public static void main(String[] args) {
  int numero=1;
  int contador = 0;
  int y;
System.out.println(".:*Primeros Numeros Primos de 1 al 1000*:.");
  while (numero <= 1000){
    numero = salvi.Funciones.siguientePrimo(numero);
    System.out.println(contador + " - " + numero);
    contador++;
  }
  
  }
}
