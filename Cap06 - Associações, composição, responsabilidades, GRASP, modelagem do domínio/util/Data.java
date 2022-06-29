package util;

public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  @Override
  public String toString() {
    return String.format("%02d/%02d/%02d", dia, mes, ano);
  }
}
