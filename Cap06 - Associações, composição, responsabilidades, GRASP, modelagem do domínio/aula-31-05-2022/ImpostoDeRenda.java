public class ImpostoDeRenda extends Desconto {
  public ImpostoDeRenda(String tipoDesconto) {
    super(tipoDesconto);
  }

  @Override
  public int calcular(Funcionario funcionario) {
    return (int) (funcionario.getSalario() * 0.430);
  }
  
}
