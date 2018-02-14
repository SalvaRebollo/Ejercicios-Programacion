package tema9POO.Ejercicio07;

import java.util.Scanner;

/**
 * Ejercicio 07: Queremos gestionar la venta de entradas (no numeradas) de
 * Expocoches Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes
 * de venderlas. La clase Zona con sus atributos y métodos la tengo en el mismo
 * paquete.
 *
 * @author Salvador Rebollo Benitez
 */
public class PruebaExpocochesCampa {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //INSTANCIAS DE OBJETO
    Zona salaPrincipal = new Zona("Sala Principal", 1000);
    Zona compraVenta = new Zona("Compra-Venta", 200);
    Zona vip = new Zona("VIP", 25);

    //VARIABLES
    int opcion = 0;
    int opcionDos = 0;
    int quiereComprar;

    //EXPOCOCHES
    while (opcion < 4) {
      if (opcion == 3) {
        opcion = 4;
      }
      System.out.println("1. Mostrar número de entradas libres.");
      System.out.println("2. Vender entradas.");
      System.out.println("3. Salir.\nPor favor, elija una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          //He visto apropiado crear un To String de la clase Zona.
          System.out.print(salaPrincipal + "\n" + compraVenta + "\n" + vip + "\n");
          break;
        case 2:
          System.out.println("¿Para qué zona quieres la entrada?");
          System.out.println("1. Sala Principal");
          System.out.println("2. Compra-Venta.");
          System.out.println("3. VIP.");
          System.out.println("4. Salir, mejor no quiero nada.\nPor favor, elija una opción:");
          opcionDos = Integer.parseInt(s.nextLine());

          if (opcionDos == 4) {
            opcion = 0;
          }

          switch (opcionDos) {
            case 1:
              System.out.println("¿Cuántas entradas quieras comprar?");
              quiereComprar = Integer.parseInt(s.nextLine());
              salaPrincipal.vender(quiereComprar);
              opcion = 0;
              break;
            case 2:
              System.out.println("¿Cuántas entradas quieras comprar?");
              quiereComprar = Integer.parseInt(s.nextLine());
              compraVenta.vender(quiereComprar);
              opcion = 0;
              break;
            case 3:
              System.out.println("¿Cuántas entradas quieras comprar?");
              quiereComprar = Integer.parseInt(s.nextLine());
              vip.vender(quiereComprar);
              opcion = 0;
              break;
          }//switch case 2
          break;
      }//switch opcion
    }//WHILE
  }//MAIN
}//CLASS
