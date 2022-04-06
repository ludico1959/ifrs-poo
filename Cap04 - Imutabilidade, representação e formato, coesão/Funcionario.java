public class Funcionario {
  private final String nome;
  private Pila salario;

  // pode inicializar a String imutável nome no construtor
  Funcionario(String nome, Pila salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void aumentarSalario(double percentualAumento) {
    int aumento = (int) (percentualAumento * salario.getPila());
    
    Pila novoPila = new Pila(aumento);

    this.salario = salario.somar(novoPila);
  }

  public String toString() {
    return this.nome + ", salário: " + this.salario;
  }
}
