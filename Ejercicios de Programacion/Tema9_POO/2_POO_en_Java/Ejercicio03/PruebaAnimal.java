package tema9POO.Ejercicio03;
/**
 * Ejercicio 01: Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Salvador Rebollo Benitez
 */
public class PruebaAnimal {
  public static void main(String[] args) {
    
    Perro luci = new Perro("Luci", 1, Sexo.HEMBRA);
    System.out.println("\n*Perro*\n" + luci);
    
    Gato bigotes = new Gato("Bigotes", 3, Sexo.MACHO);
    System.out.println("\n*Gato*\n" + bigotes);
    
    Canario pichi = new Canario("Pichi", 2, Sexo.MACHO, "Amarillo");
    System.out.println("\n*Canario*\n" + pichi);
    
    Pinguino helado = new Pinguino("Helado", 1, Sexo.HEMBRA, "Grisecillo");
    System.out.println("\n*Pinguino*\n" + helado);
    
    Lagarto bowser = new Lagarto("Bowser", 30, Sexo.MACHO);
    System.out.println("\n*Lagarto*\n" + bowser);
    
    System.out.println("\n////ACCIONES DE PERROS/////");
    luci.duerme();
    luci.amamanta();
    luci.anda();
    luci.corre();
    luci.hacerElMuerto();
    luci.ladra();
    
    System.out.println("\n////ACCIONES DE GATOS/////");
    bigotes.holgazanea();
    bigotes.limpia();
    bigotes.maulla();
    
    System.out.println("\n////ACCIONES DE CANARIOS/////");
    pichi.vuela();
    pichi.alimentarCrias();
    pichi.migra();
    pichi.come();
    pichi.come("pipas");
    pichi.enfada();
    
    System.out.println("\n////ACCIONES DE PINGUINOS/////");
    helado.cuentame();
    helado.nada();
    helado.reflexionar();
    helado.muere();
    
    System.out.println("\n////ACCIONES DE CAMALEONES/////");
    bowser.tomarElSol();
    bowser.cazarInsecto("mosca");
    bowser.mudarPiel();
    
    
  }
}
