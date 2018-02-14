package tema9POO.Ejercicio06;

public class Tiempo {
  //ATRIBUTOS DE CLASE

  private static int totalHoras = 0;
  private static int totalMinutos = 0;
  private static int totalSegundos = 0;

  //ATRIBUTOS DE INSTANCIA
  private int horas;
  private int minutos;
  private int segundos;

  //CONSTRUCTORS
  public Tiempo(int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;

    while (this.segundos > 60) {
      this.minutos = this.minutos + (this.segundos / 60);
      this.segundos = this.segundos % 60;
    }

    while (this.minutos > 60) {
      this.horas = this.horas + (this.minutos / 60);
      this.minutos = this.minutos % 60;
    }

  }

  //TO STRING
  @Override
  public String toString() {
    return this.horas + "h " + this.minutos + "m "
      + this.segundos + "s";
  }

  //GETTERS
  //SETTERS
  //METODOS ESPECIFICOS//////////////////////////////////////////////////////////
  /**
   * Suma dos intervalos de tiempo, t1.suma(t2), tanto t1 como t2 son objetos
   * que tienen 3 numeros (las variables de horas,minutos y segundos). Asi que
   * sumamos cada una con su respectivo destino y luego lo pasamos por un filtro
   * (bucles while) para reasignar bien la distribucion de
   * horas/minutos/segundos sin que sobrepasen la cifra 60.
   *
   * @param Intervalo de tiempo con la que sumar la otra instancia.
   * @return Nueva instancia de tiempo con el resultado de la suma.
   */
  public Tiempo suma(Tiempo d) {
    int resultadoH = this.horas + d.horas;
    int resultadoM = this.minutos + d.minutos;
    int resultadoS = this.segundos + d.segundos;

    //FILTRO REASIGNACION HORAS/MINUTOS/SEGUNDOS
    while (resultadoS >= 60) {
      resultadoM = resultadoM + (resultadoS / 60);
      resultadoS = resultadoS % 60;
    }

    while (resultadoM >= 60) {
      resultadoH = resultadoH + (resultadoM / 60);
      resultadoM = resultadoM % 60;
    }
    //FIN FILTRO REASIGNACION

    return new Tiempo(resultadoH, resultadoM, resultadoS);
  }

  /**
   * Resta dos intervalos de tiempo, t1.resta(t2), tanto t1 como t2 son objetos
   * que tienen 3 numeros (las variables de horas,minutos y segundos). Asi que
   * restamos cada una con su respectivo destino y luego lo pasamos por un
   * filtro (bucles while) para reasignar bien la distribucion de
   * horas/minutos/segundos sin que sobrepasen la cifra 60.
   *
   * @param Intervalo de tiempo con la que restar la otra instancia.
   * @return Nueva instancia de tiempo con el resultado de la resta.
   */
  public Tiempo resta(Tiempo d) {
    int resultadoH = this.horas - d.horas;
    int resultadoM = this.minutos - d.minutos;
    int resultadoS = this.segundos - d.segundos;

    //FILTRO REASIGNACION HORAS/MINUTOS/SEGUNDOS
    while (resultadoS >= 60) {
      resultadoM = resultadoM + (resultadoS / 60);
      resultadoS = resultadoS % 60;
    }

    while (resultadoM >= 60) {
      resultadoH = resultadoH + (resultadoM / 60);
      resultadoM = resultadoM % 60;
    }
    //FIN FILTRO REASIGNACION
    return new Tiempo(resultadoH, resultadoM, resultadoS);
  }

}//class Tiempo
