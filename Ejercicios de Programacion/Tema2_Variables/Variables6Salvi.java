/**Ejercicio 6: Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
*/
public class Variables6Salvi {
  public static void main(String[] args) {
   double baseImponible;
   
   baseImponible = 150.00;
   
   
  System.out.println("***CALCULADORA IVA***");
  System.out.printf("Base imponible a aplicar IVA: %.2f €\n", baseImponible);
  System.out.printf("TOTAL CON IVA: %.2f €", (baseImponible + (baseImponible*21/100)));
  }
}
