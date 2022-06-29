class Funcionario {
  private String nome;
  private int salario;
  private int dependentes;

  public Funcionario(String nome, int salario, int dependentes) {
    this.nome = nome;
    this.salario = salario;
    this.dependentes = dependentes;
  }

  public String getNome() {
    return this.nome;
  }

  public int getSalario() {
    return this.salario;
  }

  public int dependentes() {
    return this.dependentes;
  }

  @Override
  public String toString() {
    return this.nome;
  }
}