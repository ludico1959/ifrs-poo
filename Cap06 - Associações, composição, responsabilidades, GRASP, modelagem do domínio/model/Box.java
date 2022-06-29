package model;

public class Box {
  private final int numero;

  public Box(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return this.numero;
  }

  @Override
  public int hashCode() {
    return this.numero;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Box) {
      return ((Box) obj).numero == this.numero;
    }

    return false;
  }

  @Override
  public String toString() {
    return String.valueOf(numero);
  }
}
