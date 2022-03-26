class App02 {
  public static void main(String[] args) {
    System.out.println(soma(3, 4));
    System.out.println(soma(3, 4, 7));
    System.out.println(soma("Linguagem", "Java"));

    Copo copo = new Copo(300);
    System.out.println(copo.quantidade); // 0
    copo.encher();
    System.out.println(copo.quantidade); // 300
    copo.esvaziar();
    System.out.println(copo.quantidade); // 0
    copo.encher(100); 
    copo.encher(120); 
    System.out.println(copo.quantidade); // 220
    copo.esvaziar();
    System.out.println(copo.quantidade); // 0
    copo.encher(0.1); // 30
    copo.encher(0.2); // 60
    System.out.println(copo.quantidade); // 90

  }

  /**
   * Assisnatura do método:
   * é definida pelo nome do método e 
   * quantidade e tipos dos parâmetros
   */

  public static int soma(int x, int y) {
    return x + y;
  }

  // sobrecarga
  public static int soma(int x, int y, int z) {
    return x + y + z;
  }

  public static String soma(String x, String y) {
    return x + " " + y;
  }
}
