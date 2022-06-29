package util;

public class DataHora {
  private Hora hora;
  private Data data;

  public DataHora(int dia, int mes, int ano, int horas, int minutos, int segundos) {
    this.data = new Data(dia, mes, ano);
    this.hora = new Hora(horas, minutos, segundos);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof DataHora) {
      return ((DataHora) obj).data.equals(this.data) && ((DataHora) obj).hora.equals(this.hora);
    }
    
    return false;
  }

  @Override
  public String toString() {
    return this.data.toString() + " " + this.hora.toString();
  }
}
