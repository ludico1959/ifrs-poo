class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo");

    //////////////////////////////////////////////////
    // LIVRO
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

    //////////////////////////////////////////////////
    // LÂMPADA
    Lampada lamp1 = new Lampada(220, 20);

    System.out.println(lamp1.tensao);
    System.out.println(lamp1.potencia);
    System.out.println(lamp1.ligada);

    // lamp1.tensao = 110;
    // lamp1.potencia = 15;
    lamp1.ligada = true;

    System.out.println(lamp1.tensao);
    System.out.println(lamp1.potencia);
    System.out.println(lamp1.ligada);

    //////////////////////////////////////////////////
    // FONE DE OUVIDO
    FoneDeOuvido fone1 = new FoneDeOuvido();

    fone1.tipo = EnumTiposDeFone.INTRA_AURICULAR;
    fone1.fabricante = "Xiaomi";
    fone1.bluetooth = true;
    fone1.pecas = 2;

    System.out.println(fone1.tipo);
    System.out.println(fone1.fabricante);
    System.out.println(fone1.bluetooth);
    System.out.println(fone1.pecas);

    //////////////////////////////////////////////////
    // AR CONDICIONADO
    ArCondicionado ar1 = new ArCondicionado("Samsung", 7500);
    
    // estado inicial
    System.out.println(ar1.temperatura);

    // estado final
    ar1.temperatura++;
    System.out.println(ar1.temperatura);
  }
}