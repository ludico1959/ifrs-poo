class ArCondicionado {
  final String fabricante;
  final int btus;
  int temperatura = 21;
  boolean split = true;

  ArCondicionado(String fabricante, int btus) {
    // salva-guardas (guard-clauses)
    if (fabricante == null) {
      throw new NullPointerException("fabricante nulo");
    }

    if (fabricante.isBlank()) {
      throw new IllegalArgumentException("fabricante vazio");
    }

    if (btus < 7500 || btus > 22000) {
      throw new IllegalArgumentException("btus fora do intervalo 7.5k-22k");
    }

    // fabricante terá ao menos 1 caracter
    // btus estará entre 7500 e 20000 btus
    this.fabricante = fabricante;
    this.btus = btus;
  }

  private void validarInvariantes() {
    if (this.temperatura == 30) 
      throw new IllegalStateException("O ar está no máximo / 30°");
  }

  void aumentarTemperatura() {
    this.validarInvariantes();
    
    this.temperatura++;
  }
}
