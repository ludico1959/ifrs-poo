public class Inss extends Desconto {

  public Inss(String tipoDesconto) {
    super(tipoDesconto);
  }

  @Override
  public int calcular(Funcionario funcionario) {
    return (int) (funcionario.getSalario() * 0.175);
  }
  
}
