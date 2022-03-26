// colocou o arquivo da classe numa pasta, precisa declarar o package:
package util;

/**
 * a ausência da palavra-chave de visibilidade torna "privado do pacote"
 * é preciso deixa os construtores, os métodos e os atributos públicos também
 *  */
public class Tempo {
  private int segundos;

  public Tempo(int segundos) {
    this.segundos = segundos;
  }

  public Tempo(int minutos, int segundos) {
    this(minutos * ConstTempo.MINUTOS.segundos + segundos);
  }
  
  public Tempo(String tempo) { // 00:00
    this(Integer.parseInt(tempo.substring(0, 2)) * 60 + Integer.parseInt(tempo.substring(3, 5)));
  }

  public int getSegundos() {
    return this.segundos;
  }

  public int getMinutos() {
    return this.segundos / 60;
  }
}
