class App {
  public static void main(String[] args) {
    System.out.println("Fala, gurizada!");

    Funcionario lucas = new Funcionario("Lucas", 1800, 5);
    Funcionario luiz = new Funcionario("Luiz", 1500, 0);

    // pode colocar Inss como o tipo de inss ao invés de desconto
    Desconto inss = new Inss("inss");

    int valor1 = inss.calcular(lucas);
    int valor2 = inss.calcular(luiz);
    System.out.println(valor1 + " " + valor2);

    Desconto vt = new ValeTransporte("vale transporte");

    int valor3 = vt.calcular(luiz);
    System.out.println(valor3);


    Desconto desc = new ValeTransporte("vt");
    System.out.println(desc.getNome());
    System.out.println(desc.calcular(lucas));
  }
}