import java.util.HashSet;
import java.util.Set;

public class ContraCheque {
  private final Funcionario funcionario;

  /*
    nunca referenciar a classe concreta (não usar inss, ir, vt, etc.)
    usar a classe asbtrata porque nos dá liberdade de adicionar novo descontos (classes concretas)
  */ 
  private Set<Desconto> descontos = new HashSet<Desconto>();       // não permite repetições
  // private List<Desconto> descontos = new ArrayList<Desconto>(); // permite repetições

  public ContraCheque(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  public Funcionario getFuncionario() {
    return this.funcionario;
  }

  public int getSalarioLiquido() {
    int liquido = funcionario.getSalario();

    for (Desconto desc : this.descontos) {
      int valor = desc.calcular(funcionario);
      liquido -= valor;
    }

    return liquido;
  }

  public void adicionarDesconto(Desconto desc) {
    this.descontos.add(desc);
  }

  public void adicionarDesconto(Desconto... varioDescontos) { // varargs: vvários argumentos
    for (Desconto desc : varioDescontos) {
      this.descontos.add(desc);
    }
  }

  @Override
  public String toString() {
    return "Funcionário: " + this.funcionario + "\nDescontos: " + descontos;
  }
}
