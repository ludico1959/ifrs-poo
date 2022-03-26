import util.Tempo;

// Codado em aula remota
class App02 {
  /**
   * JavaScript não tem sobrecarga porque pode-se definir 
   * um valor pré-definido para os parâmetros na função:
   * function (tensao = 110, potencia = 20)
   * Já no Java, é preciso fazer uma SOBRECARGA
   */
  public static void main(String[] args) {
    ///////////////////////////////////////////////////////////////////
    // SOMA (funções no fim do arquivo)
    System.out.println(soma(3, 4));
    System.out.println(soma(3, 4, 7));
    System.out.println(soma("Linguagem", "Java"));

    ///////////////////////////////////////////////////////////////////
    // COPO
    Copo copo = new Copo(300);
    System.out.println(copo.getQuantidade()); // 0
    copo.encher();
    System.out.println(copo.getQuantidade()); // 300
    copo.esvaziar();
    System.out.println(copo.getQuantidade()); // 0
    copo.encher(100); 
    copo.encher(120); 
    System.out.println(copo.getQuantidade()); // 220
    copo.esvaziar();
    System.out.println(copo.getQuantidade()); // 0
    copo.encher(0.1); // 30
    copo.encher(0.2); // 60
    System.out.println(copo.getQuantidade()); // 90

    Copo copinho = new Copo();
    System.out.println(copinho.getQCapacidade()); // 300

    ///////////////////////////////////////////////////////////////////
    // LÂMPADA
    Lampada lampada20w = new Lampada(110);
    System.out.println(lampada20w.tensao); // 110
    System.out.println(lampada20w.potencia); // 20

    Lampada lampada20w220v = new Lampada();
    System.out.println(lampada20w220v.tensao); // 110
    System.out.println(lampada20w220v.potencia); // 20

    ///////////////////////////////////////////////////////////////////
    // TEMPO
    Tempo tempo01 = new Tempo(60);
    System.out.println(tempo01.getSegundos()); // 60
    
    Tempo tempo02 = new Tempo(3, 30);
    System.out.println(tempo02.getSegundos()); // 210

    Tempo tempo03 = new Tempo("01:45");
    System.out.println(tempo03.getSegundos()); // 95

    Tempo tempo04 = new Tempo("11:32");
    System.out.println(tempo04.getSegundos() == 692); //true

    Tempo tempo05 = new Tempo ("05:15");
    System.out.println(tempo05.getSegundos()); // 315
    System.out.println(tempo05.getMinutos()); // 5
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
