public class Copo {
  private final int capacidade; // estado constante
  private int quantidade = 0; // estado variável ou instantâneo
  /**
   * private: somente objetos da mesma classe podem ter acesso
   * visível apenas na própria classe
   */
  
  public Copo (int capacidade) {
    if (capacidade <= 0)
      throw new IllegalArgumentException("Capacidade deve ser maior que 0");

    this.capacidade = capacidade;
  }

  // sobrecarga de construtor
  public Copo () {
    this.capacidade = 300;
  }

  public void encher() {
    this.quantidade = this.capacidade;
  }

  // sobrecarga do método encher
  public void encher(int quantidade) {
    if (this.quantidade + quantidade > this.capacidade)
      throw new IllegalArgumentException("quantidade inválida");

    this.quantidade += quantidade;
  }

  // sobrecarga do método encher
  public void encher(double percentual) {
    if (this.quantidade + (percentual * this.capacidade) > this.capacidade)
      throw new IllegalArgumentException("percentual inválido");

    /** this.quantidade += (int) (percentual * this.capacidade);
     *  (int) é uma coerção:
     *  ato de induzir, pressionar ou compelir alguém a fazer algo pela força
     */
    this.encher((int) (percentual * this.capacidade));
  }

  public void esvaziar() {
    this.quantidade = 0;
  } 

  public void encherMetade() {
    this.quantidade = this.capacidade / 2;
  }

  public void encherQuantidade(int quantidade) {
    if (quantidade <= 0 || quantidade > 500) {
      throw new IllegalArgumentException("quantidade inválida");
    }

    this.quantidade = quantidade;
  }

  // método de consulta / getter
  public int getQuantidade() {
    return this.quantidade;
  }

  // getter
  public int getQCapacidade() {
    return this.capacidade;
  }

  // indica que o método está sendo sobreescrito
  @Override
  public boolean equals(Object outroObjecto) {
    if (this == outroObjecto) return true; // é a mesma identidade?

    if (null == outroObjecto) return false; // é nulo?

    if (outroObjecto instanceof Copo) { // é um copo?
      Copo outroCopo = (Copo) outroObjecto;

      if (this.capacidade == outroCopo.capacidade) return true;
    }

    return false;
  }
}
