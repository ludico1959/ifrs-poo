package util;

public class Hora {
  private int horas;
  private int minutos;
  private int segundos;

  public Hora(int horas, int minutos,  int segundos){
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", horas, minutos, segundos);
  }
}
