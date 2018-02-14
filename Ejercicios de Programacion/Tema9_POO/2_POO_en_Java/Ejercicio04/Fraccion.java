package tema9POO.Ejercicio04;

public class Fraccion {

  private int numerador;
  private int denominador;
  private int signo;

  //CONSTRUCTOR
  public Fraccion(int n, int d) {
    if (d == 0) {
      System.out.println("No puede haber una fracción con denominador 0.");
    } else {
      if (n * d < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
    }

    this.numerador = Math.abs(n);
    this.denominador = Math.abs(d);
  }

  //TOSTRING
  public String toString() {
    return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
  }

//GETTERS
  //GETTER Numerador
  public int getNumerador() {
    return this.numerador;
  }

  //GETTER Denominador
  public int getDenominador() {
    return this.denominador;
  }
//SETTERS
  //SETTER Numerador

  public void setNumerador(int n) {
    this.numerador = numerador;
  }

  //SETTER Denominador
  public void setDenominador(int d) {
    this.denominador = denominador;
  }

  //METODOS ESPECIFICOS///////////////
  /**
   * Invierte
   *
   * @return Resultado de invertir el numerador por el denominador y viceversa
   */
  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }

  /**
   * Multiplica fraccion por numero entero
   *
   * @param numero entero
   * @return Nueva fraccion multiplicada por numero entero
   */
  public Fraccion multiplica(int n) {
    return new Fraccion(this.signo * this.numerador * n, this.denominador);
  }

  /**
   * //SOBRECARGA Multiplica fraccion por fraccion a.multiplica(f)
   *
   * @param fraccion
   * @return Nueva fraccion multiplicada por numero entero
   */
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }

  /**
   * Divide una fraccion por un numero entero
   *
   * @param numero entero
   * @return Nueva fraccion dividida por numero entero
   */
  public Fraccion divide(int n) {
    return new Fraccion(this.signo * this.numerador, this.denominador * n);
  }

  /**
   * //SOBRECARGA Divide fraccion entre fraccion a.divide(f)
   *
   * @param fraccion entre la cual dividir la fraccion original
   * @return Nueva fraccion dividida por fraccion
   */
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
  }

  /**
   * Simplifica una fraccion hasta ser irreducible, si ya es irreducible
   * desvuelve la misma fraccion introducida.
   *
   * @return Simplifica una fraccion hasta ser irreducible, si ya es irreducible
   * desvuelve la misma fraccion introducida.
   */
  public Fraccion simplifica() {
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;

    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }
    return new Fraccion(s * n, d);
  }

}//class Fraccion
