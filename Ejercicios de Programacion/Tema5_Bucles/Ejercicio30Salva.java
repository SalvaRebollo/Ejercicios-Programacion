/**
 * Ejercicio 30: Realiza un programa que calcule las horas transcurridas entre dos horas de 
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos. 
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una 
 * cadena (de lunes a domingo). Se debe comprobar que el usuario introduce 
 * los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author Salvador Rebollo Benítez
 */
public class Ejercicio30Salva {
  public static void main (String[] args) {
  
  String stringPrimerDia;
  String nombrePrimerDia = "";
  int primerDia;
  int horaPrimerDia;

  String stringSegundoDia;
  String nombreSegundoDia = "";
  int segundoDia;
  int horaSegundoDia;
  
  boolean correcto = true;
  
//Primero pedimos los datos, en este caso con un switch, así que será largo.
//Tambien lo meteremos en un bucle para que se repita hasta que los datos estén correctos.
  
  do{
    System.out.println("\nPor favor introduzca la informaci\u00f3n del primer d\u00eda.");
    System.out.print("D\u00eda: ");
    stringPrimerDia=System.console().readLine();
    
    System.out.print("Hora: ");
    horaPrimerDia=Integer.parseInt(System.console().readLine());
    
    switch(stringPrimerDia) {
        case "lunes":
        case "Lunes":
        case "1":
          primerDia = 1;
          nombrePrimerDia = "lunes";
          break;
          
        case "martes":
        case "Martes":
        case "2":
          primerDia = 2;
          nombrePrimerDia = "martes";
          break;
          
        case "miercoles":
        case "Miercoles":
        case "mi\u00e9rcoles":
        case "Mi\u00e9rcoles":
        case "3":
          primerDia = 3;
          nombrePrimerDia = "mi\u00e9rcoles";
          break;
        
        case "jueves":
        case "Jueves":
        case "4":
          primerDia = 4;
          nombrePrimerDia = "jueves";
          break;
        
        case "viernes":
        case "Viernes":
        case "5":
          primerDia = 5;
          nombrePrimerDia = "viernes";
          break;
          
        case "sabado":
        case "s\u00e1bado":
        case "Sabado":
        case "S\u00e1bado":
        case "6":
          primerDia = 6;
          nombrePrimerDia = "s\u00e1bado";
          break;
        
        case "domingo":
        case "Domingo":
        case "7":
          primerDia = 7;
          nombrePrimerDia = "domingo";
          break;
        default:
          primerDia = 0;
    }
    
    System.out.println("\nAhora introduzca la informaci\u00f3n del segundo d\u00eda.");
    System.out.print("D\u00eda: ");
    stringSegundoDia=System.console().readLine();
    
    System.out.print("Hora: ");
    horaSegundoDia=Integer.parseInt(System.console().readLine());
    
    switch(stringSegundoDia) {
        case "lunes":
        case "Lunes":
        case "1":
          segundoDia = 1;
          nombreSegundoDia = "lunes";
          break;
          
        case "martes":
        case "Martes":
        case "2":
          segundoDia = 2;
          nombreSegundoDia = "martes";
          break;
          
        case "miercoles":
        case "Miercoles":
        case "mi\u00e9rcoles":
        case "Mi\u00e9rcoles":
        case "3":
          segundoDia = 3;
          nombreSegundoDia = "mi\u00e9rcoles";
          break;
        
        case "jueves":
        case "Jueves":
        case "4":
          segundoDia = 4;
          nombreSegundoDia = "jueves";
          break;
        
        case "viernes":
        case "Viernes":
        case "5":
          segundoDia = 5;
          nombreSegundoDia = "viernes";
          break;
          
        case "sabado":
        case "s\u00e1bado":
        case "Sabado":
        case "S\u00e1bado":
        case "6":
          segundoDia = 6;
          nombreSegundoDia = "s\u00e1bado";
          break;
        
        case "domingo":
        case "Domingo":
        case "7":
          segundoDia = 7;
          nombreSegundoDia = "domingo";
          break;
          
        default:
          segundoDia = 0;
    }
    
//A continuación haremos que correcto = false; cuando los datos estén erroneos, el segundo día tiene que ser posterior al primero.
//Tampoco podemos dejar que introduzca un 0, ni más de 7 ya que no representa ningun dia de la semana.
//La hora no puede ser superior a 23h,
    
    
    if (correcto){
      //Si introduce una cifra inferior a 0 o superior a 7 en el primer/segundo dia.
      if((primerDia <= 0) || (segundoDia <= 0) || (primerDia > 7) || (segundoDia > 7)){
        System.out.println("\n- Datos incorrectos. No puedes introducir el n\u00famero 0,");
        System.out.print("ni tampoco una cifra superior a 7 ya que NO representa ning\u00fan d\u00eda.\n");
        correcto=false;
      }
      
      //Si segundo dia es posterior o igual a primer dia
      if(segundoDia <= primerDia){
        System.out.println("\n- Datos incorrectos. El segundo d\u00eda debe ser posterior al primer d\u00eda. Y debe estar bien escrito.");
        correcto=false;
      }
      
      //Si la hora del primer/segundo dia es superior a 23 o inferior a 0.
      if((horaPrimerDia > 23) || (horaPrimerDia < 0) || (horaSegundoDia > 23) || (horaSegundoDia < 0)) {
        System.out.println("\n- Datos incorrectos. Las horas v\u00e1lidas van de 0 a 23.");
        correcto=false;
      }
    } else{
        correcto=true;
      }
      
  } while (!correcto);
//-----------------------FIN PROCESO PEDIR DATOS.-------------------------------

    int formulaRespuesta = (((segundoDia * 24) + horaSegundoDia) - ((primerDia * 24) + horaPrimerDia));
    
    System.out.print("\nEntre las " + horaPrimerDia + ":00h del " + nombrePrimerDia);
    System.out.print(" y las " + horaSegundoDia + ":00h del " + nombreSegundoDia);
    System.out.println(" hay " + formulaRespuesta + " horas.");
  
  
  }
}
