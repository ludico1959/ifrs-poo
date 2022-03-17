class Copo {
  final int capacidade; // estado constante
  int quantidade = 0; // estado variável ou instantâneo
  
  Copo (int capacidade) {
    this.capacidade = capacidade;
  }

  void encher() {
    this.quantidade = this.capacidade;
  }

  void esvaziar() {
    this.quantidade = 0;
  } 

  void encherMetade() {
    this.quantidade = this.capacidade / 2;
  }

  void encherQuantidade(int quantidade) {
    if (quantidade <= 0 || quantidade > 500) {
      throw new IllegalArgumentException("quantidade inválida");
    }

    this.quantidade = quantidade;
  }
}
