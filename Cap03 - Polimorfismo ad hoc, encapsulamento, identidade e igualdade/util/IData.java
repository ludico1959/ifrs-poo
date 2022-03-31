package util;

public interface IData {
  /**
   * a interface é pública por padrão
   * não precisa usar as palavras-chave de visibilidade
   */
  int getDia();
  void setDia(int dia);

  int getMes();
  void setMes(int mes);

  int getAno();
  void setAno(int ano);

  DiaDaSemana getDiaDaSemana();

  public enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
  }
}
