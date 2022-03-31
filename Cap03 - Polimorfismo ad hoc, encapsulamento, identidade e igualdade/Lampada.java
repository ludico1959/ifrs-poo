public class Lampada {
  // atributos
  // OS VALORES ARMAZENADOS NOS ATRIBUTOS DEFINEM O ESTADO DO OBJETO!
  private final int tensao; // final indica um estado constante
  private final int potencia;
  private boolean ligada; 

  // construtor
  public Lampada(int tensao, int potencia) {
    this.tensao = tensao;
    this.potencia = potencia;
  }

  // sobrecarga de construtor
  public Lampada(int tensao) {
    this(tensao, 20); // invoca o construtor completo
  }

  // sobrecarga de construtor
  public Lampada() {
    this(220, 20); // invoca o construtor completo
  }
  // métodos
  public void ligar() { // void (vazio) = não há retorno nada
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }

  // consultas / perguntas
  // deixam o código mais idiomático e natural
  public boolean isLigada() {
    return this.ligada;
  }

  public boolean isDesligada() {
    return !this.ligada;
  }

  public int getTensao() {
    return this.tensao;
  }

  public int getPotencia() {
    return this.potencia;
  }
}
