class Evento {
  final String descricao;
  final int totalIngressos;
  int ingressosVendidos = 0;

  public Evento(String descricao, int totalIngressos) {
    validaTotalIngressos(totalIngressos);

    this.descricao = descricao;
    this.totalIngressos = totalIngressos;
  }

  // private porque é um método usado apenas dentro da classe
  private void validaTotalIngressos(int totalIngressos) {
    if (totalIngressos > 10)
      throw new IllegalArgumentException("Total de ingressos deve ser maior que 10");
  }

  int ingressosDisponiveis() {
    return this.totalIngressos - this.ingressosVendidos;
  }

  int ingressosVendidos() {
    return this.ingressosVendidos;
  }

  boolean haIngressosDissponiveis() {
    return this.ingressosVendidos < this.totalIngressos;
  }

  void venderIngresso() {
    if (this.haIngressosDissponiveis()) // salva-guarda
      this.ingressosVendidos++;
    else
      throw new IllegalStateException("Não há mais ingressos");
  }
}
