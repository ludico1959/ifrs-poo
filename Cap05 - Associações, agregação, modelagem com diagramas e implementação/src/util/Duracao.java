package src.util;

public class Duracao {
  private int segundos;

  public Duracao(int horas, int minutos, int segundos) {
    this.segundos = horas * 3600 + minutos * 60 + segundos;
  }

  public int getHoras() {
    return this.segundos / 3600;
  }

  public int getMinutos() {
    return this.segundos % 3600 / 60;
  }

  public int getSegundos() {
    return this.segundos % 3600 % 60;
  }

  public void somar(Duracao d) {
    this.segundos += d.segundos;
  }

  @Override
  public String toString() {
    return String.format("%02dh%02dm%02ds",
      this.getHoras(),
      this.getMinutos(),
      this.getSegundos()
    );
  }
}