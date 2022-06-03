public class ValeTransporte extends Desconto {

  public ValeTransporte(String tipoDesconto) {
    super(tipoDesconto);
  }

  @Override
  public int calcular(Funcionario funcionario) {
    return (int) (funcionario.getSalario() * 0.060);
  }
  
}
