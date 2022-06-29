/** classe abstrata (o contrário é uma classe concreta)
 * não funciona sozinha
 * não é possível estanciá-la
 * ele serve apenas para ser extendida
 *  */ 
abstract public class Desconto {
  private String nome;

  public Desconto(String tipoDesconto) {
    this.nome = tipoDesconto;
  }

  public String getNome() {
    return this.nome;
  }

  /** assinatura do método
   * deve haver esse método em uma classe extendida
   * recebendo um Funcionario de parâmetro e retornando um inteiro
   *  */
  abstract public int calcular(Funcionario funcionario); // não tem corpo

  @Override
  public String toString() {
    return this.nome;
  }
}
