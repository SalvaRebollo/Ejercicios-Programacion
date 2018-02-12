package tema9POO.Ejercicio05;
/**
 * Ejercicio 05: Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza 
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 * El siguiente código del programa principal debe dar la salida que se muestra:
 * 
 * println(p1) = pizza margarita mediana, pedida
 * println(p2) = pizza funghi familiar, servida
 * println(p3) = pizza cuatro quesos mediana, pedida
 * p2.sirve = esa pizza ya se ha servido
 * Pizza.getTotalPedidas() = pedidas: 3
 * Pizza.getTotalServidas() = servidas: 1

 * 
 * @author Salvador Rebollo Benitez
 */
public class PruebaPizzeria {
  public static void main(String[] args) {
    
    Pizza p1 = new Pizza(Tipo.CUATRO_QUESOS, Tamanio.FAMILIAR);
    Pizza p2 = new Pizza(Tipo.FUNGHI, Tamanio.MEDIANA);
    Pizza p3 = new Pizza(Tipo.MARGARITA, Tamanio.MEDIANA);
    
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println();
    
    System.out.println("Total pizzas pedidas: " + Pizza.getTotalPedidas());
    System.out.println("Total pizzas servidas: " + Pizza.getTotalServidas());
    System.out.println();
    System.out.println("**Ahora sirvo p1 y p2**\n");
    p1.sirve();
    p2.sirve();
    
    System.out.println("Total pizzas pedidas: " + Pizza.getTotalPedidas());
    System.out.println("Total pizzas servidas: " + Pizza.getTotalServidas());
    
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
  }
}
