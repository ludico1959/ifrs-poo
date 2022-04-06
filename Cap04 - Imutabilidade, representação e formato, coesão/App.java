public class App {
  public static void main(String[] args) {
    Pila doisPila = new Pila(2);

    System.out.println(doisPila.getPila()); // 2

    // Pila dois = doisPila;
    // dois.setPila(8);

    // System.out.println(doisPila.getPila()); // 8

    System.out.println(doisPila); // R$ 2

    Pila tresPila = new Pila(3);
    
    System.out.println(tresPila.getPila()); // 3

    // Chamam o mesmo método:
    System.out.println(tresPila.toString()); // R$ 3
    System.out.println(tresPila); // R$ 3

    Pila cincoPila = doisPila.somar(tresPila);

    System.out.println(cincoPila); // R$ 5

    Pila divida = new Pila(10);

    System.out.println(divida); // R$ 10

    System.out.println(divida.somar(divida)); // R$ 20

    // Imutabilidade
    System.out.println(divida); // R$ 10

    Pila base = new Pila(2100);
    Funcionario fulano = new Funcionario("Pedro Geromel", base);
    Funcionario beltrano = new Funcionario("Valter Kannemann", base);
    Funcionario ciclano = new Funcionario("Diego Sousa", base);

    System.out.println(fulano); // R$ 2100
    System.out.println(beltrano); // R$ 2100
    System.out.println(ciclano); // R$ 2100

    fulano.aumentarSalario(0.5);

    System.out.println(fulano);
  }
}
