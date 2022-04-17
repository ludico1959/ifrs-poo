public class Temperatura {
  private final int temp;
  private final int min;
  private final int max;

  public Temperatura(int valorInicial, int minimo, int maximo) {
    if (valorInicial < minimo || valorInicial > maximo) {
      throw new IllegalArgumentException("valorInicial fora do intervalo");
    }
    
    this.temp = valorInicial;
    this.min = minimo;
    this.max = maximo;
  }

  public Temperatura(int valorInicial) {
    this(valorInicial, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public int getValor() {
    return this.temp;
  }

  public Temperatura aumentar() {
    return new Temperatura(this.temp + 1, this.min, this.max);
  }

  public Temperatura baixar() {
    return new Temperatura(this.temp - 1, this.min, this.max);
  }

  @Override
  public String toString() {
    return this.temp + "°";
  }

  public String toCelsiusString() {
    return this.temp + "° C";
  }
}