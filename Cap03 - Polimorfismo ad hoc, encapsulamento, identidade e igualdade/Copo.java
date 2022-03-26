class Copo {
  final int capacidade; // estado constante
  int quantidade = 0; // estado variável ou instantâneo
  
  Copo (int capacidade) {
    this.capacidade = capacidade;
  }

  void encher() {
    this.quantidade = this.capacidade;
  }

  // sobrecarga do método encher
  void encher(int quantidade) {
    if (this.quantidade + quantidade > this.capacidade)
      throw new IllegalArgumentException("quantidade inválida");

    this.quantidade += quantidade;
  }

  // sobrecarga do método encher
  void encher(double percentual) {
    if (this.quantidade + (percentual * this.capacidade) > this.capacidade)
      throw new IllegalArgumentException("percentual inválido");

    /** this.quantidade += (int) (percentual * this.capacidade);
     *  (int) é uma coerção:
     *  ato de induzir, pressionar ou compelir alguém a fazer algo pela força
     */
    this.encher((int) (percentual * this.capacidade));
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
