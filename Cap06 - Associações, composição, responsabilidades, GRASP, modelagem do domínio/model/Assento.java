package model;

public class Assento {
  private final int numero;
  private final boolean executivo;
  private final boolean janela;

  public Assento(int numero, boolean executivo, boolean janela) {
    this.numero = numero;
    this.executivo  = executivo;
    this.janela = janela;
  }

  public int getNumero() {
    return this.numero;
  }

  public boolean isExecutivo() {
    return this.executivo;
  }

  public boolean isJanela() {
    return this.janela;
  }

  public boolean isCorredor() {
    return !this.janela;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Assento) {
      return ((Assento) obj).numero == this.numero;
    }
    return false;
  }

  @Override
  public String toString() {
    return "Assento nro: " + this.numero + ". Janela: " + this.janela + ". Executivo: " + this.executivo;
  }
}
