package tema9POO.Ejercicio04;

/**
 * Ejercicio 01: Implementa la clase Caballo vista en un ejercicio anterior.
 * Pruébala creando instancias y aplicándole algunos métodos.
 *
 * @author Salvador Rebollo Benitez
 */
public class PruebaFraccion {

  public static void main(String[] args) {

    Fraccion a = new Fraccion(12, 24);
    Fraccion b = new Fraccion(15, 30);

    System.out.println(a);
    System.out.println(b);

    System.out.println("Ahora multiplico la fraccion A por 5: ");
    System.out.println(a + " * 5 = " + a.multiplica(5));

    System.out.println("Ahora multiplico la fraccion A por B: ");
    System.out.println(a + " * " + b + " = " + a.multiplica(b));

    System.out.println("Ahora divido la fraccion A entre 5: ");
    System.out.println(a + " / 5 = " + a.divide(5));

    System.out.println("Ahora divido la fraccion A entre B: ");
    System.out.println(a + " / " + b + " = " + a.divide(b));

    System.out.println("Ahora simplifico la fraccion A: ");
    System.out.println(a + " simplificada: " + a.simplifica());

    System.out.println("Ahora invierto A");
    System.out.println(a + " invertida = " + a.invierte());
    System.out.println("Ahora invierto B");
    System.out.println(b + " invertida = " + b.invierte());

  }
}
