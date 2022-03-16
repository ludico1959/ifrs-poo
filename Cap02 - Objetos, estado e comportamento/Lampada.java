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
}
