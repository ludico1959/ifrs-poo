class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo");

    //////////////////////////////////////////////////////
    // LIVRO
    System.out.println("-- LIVRO ----------------------");
    Livro livro1, livro2; // declaração
    livro1 = new Livro("Padrões de Implementação"); // instanciação
    livro2 = new Livro("Algortimos para viver");

    System.out.println(livro1.titulo);
    System.out.println(livro1.paginas);
    System.out.println(livro2.titulo);

    livro1.subtitulo = "Um catálogo de padrões";
    livro1.autor = "Kent Beck";
    livro1.editora = "Bookman";
    livro1.paginas = 154;

    System.out.printf("O livro %s do autor %s tem %d páginas\n", livro1.titulo, livro1.autor, livro1.paginas);

    //////////////////////////////////////////////////////
    // LÂMPADA
    System.out.println("-- LÂMPADA --------------------");
    Lampada lamp1 = new Lampada(220, 65);

    System.out.println(lamp1.tensao);
    System.out.println(lamp1.potencia);
    System.out.println(lamp1.ligada);

    System.out.println(lamp1.tensao);
    System.out.println(lamp1.potencia);
    System.out.println(lamp1.ligada);

    Lampada lamp2 = new Lampada(110, 25);
    lamp2.ligar();

    // invocando/chamando métodos de consulta
    if (lamp2.estaLigada()) 
      System.out.println("Lâmpada ligada!");
    else
      System.out.println("Lâmpada desligada!");

    //////////////////////////////////////////////////////
    // FONE DE OUVIDO
    System.out.println("-- FONE DE OUVIDO -------------");
    FoneDeOuvido fone1 = new FoneDeOuvido();

    fone1.tipo = EnumTiposDeFone.INTRA_AURICULAR;
    fone1.fabricante = "Xiaomi";
    fone1.bluetooth = true;
    fone1.pecas = 2;

    System.out.println(fone1.tipo);
    System.out.println(fone1.fabricante);
    System.out.println(fone1.bluetooth);
    System.out.println(fone1.pecas);

    //////////////////////////////////////////////////////
    // AR CONDICIONADO
    System.out.println("-- AR CONDICIONADO ------------");
    ArCondicionado ar1 = new ArCondicionado("Samsung", 7500);
    
    // estado inicial
    System.out.println(ar1.temperatura);

    // estado final 
    ar1.temperatura++;
    System.out.println(ar1.temperatura);

    // ArCondicionado ar2 = new ArCondicionado("   ", 9000);
    // System.out.println(ar2.fabricante);
    
    // TRY/CATCH não interrompe o programa
    try {
      ArCondicionado ar3 = new ArCondicionado("LG", 1000);
      System.out.println(ar3.fabricante);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    System.out.println("Chegamos aqui!");

    System.out.println("Aumentando a temperatura do ar: ");
    ArCondicionado ar4 = new ArCondicionado("Philco", 12000);
    System.out.println(ar4.temperatura);
    ar4.temperatura = 25;
    ar4.aumentarTemperatura();
    ar4.aumentarTemperatura();
    ar4.aumentarTemperatura();
    ar4.aumentarTemperatura();
    ar4.aumentarTemperatura();
    System.out.println(ar4.temperatura);

    // burlando a sava-guarda do método objeto:
    ar4.temperatura = 31; // deveria ser impossível fazer isso
    ar4.aumentarTemperatura();
    ar4.aumentarTemperatura();
    System.out.println(ar4.temperatura);

    //////////////////////////////////////////////////////
    // COPO
    System.out.println("-- COPO ----------------------");
    Copo copo1 = new Copo(500);
    
    copo1.encher(); // invocar/chamar o método encher
    System.out.println(copo1.quantidade);

    copo1.esvaziar();
    System.out.println(copo1.quantidade);
    
    copo1.encherMetade();
    System.out.println(copo1.quantidade);
    
    try {
      copo1.encherQuantidade(501);
      System.out.println(copo1.quantidade);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    copo1.encherQuantidade(325);
    System.out.println(copo1.quantidade);

    //////////////////////////////////////////////////////
    // EVENTO
    System.out.println("-- EVENTO ------------------------");
    Evento show = new Evento("Show do Exaltasamba", 10);
    
    System.out.println(show.descricao);
    System.out.println(show.totalIngressos);
    System.out.println(show.ingressosDisponiveis());
    System.out.println(show.ingressosVendidos());

    show.venderIngresso();
    System.out.println(show.ingressosDisponiveis()); 
    System.out.println(show.ingressosVendidos());

    show.venderIngresso();
    // Assertivas / casos de teste
    System.out.println(show.ingressosDisponiveis() == 8);
    System.out.println(show.ingressosVendidos() == 2);
    
    try {
      for (int i = 0; i < 10; i++) {
        show.venderIngresso();
      }
      
      // métodos de consulta não alteram o estado do objeto
      System.out.println(show.ingressosDisponiveis());
      System.out.println(show.ingressosVendidos());
    } catch (Exception e) {
      System.err.println("Ingressos esgotados");
    }
  }
}