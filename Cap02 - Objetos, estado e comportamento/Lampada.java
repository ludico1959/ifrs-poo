class Lampada {
  // atributos
  // OS VALORES ARMAZENADOS NOS ATRIBUTOS DEFINEM O ESTADO DO OBJETO!
  final int tensao; // final indica um estado constante
  final int potencia;
  boolean ligada; 

  // construtor
  Lampada(int tensao, int potencia) {
    this.tensao = tensao;
    this.potencia = potencia;
  }

  // métodos
  void ligar() { // void (vazio) = não há retorno nada
    this.ligada = true;
  }

  void desligar() {
    this.ligada = false;
  }

  // consultas / perguntas
  // deixam o código mais idiomático e natural
  boolean estaLigada() {
    return this.ligada;
  }

  boolean estaDesligada() {
    return !this.ligada;
  }
}
