// Codado em aula presencial
class App01 {
  public static void main(String[] args) {
    // Identidade: mesmo objeto
    // Igualdade: objetos diferentes, mas equivalentes em valor.

    ///////////////////////////////////////////////////////////////////
    // PESSOA
    Pessoa lucas = new Pessoa("Lucas");
    System.out.println(lucas.getNome()); // Lucas

    Pessoa matheus = new Pessoa("Rodrigo");
    System.out.println(matheus.getNome()); // Rodrigo

    System.out.println(lucas == matheus); // false
    // System.out.println(lucas == lucas); // true

    // referências (um pouco semelhante a ponteiros em C)
    Pessoa rodrigo = lucas;
    System.out.println(lucas == rodrigo); // true

    rodrigo.setNome("Matheus");
    System.out.println(rodrigo.getNome()); // Matheus
    System.out.println(lucas.getNome()); // Matheus
    // rodrigo aponta para o mesmo lugar da memória do objeto lucas
    // eles salvam só os endereços do objeto
    
    lucas = null;
    rodrigo = null;
    /* como não há mais referência ao objeto
     * o garbage collector irá apagar o objeto em alguns momento
     * e limpará a memória
    */

    Pessoa luiz1 = new Pessoa("Luiz");
    Pessoa luiz2 = new Pessoa("Luiz");
    System.out.println(luiz1 == luiz2); // false

    ///////////////////////////////////////////////////////////////////
    // ALUNO
    
    // Entidade
    Aluno aluno1 = new Aluno(11223344, "Luiza Léa Coelho");
    Aluno aluno2 = new Aluno(11223344, "Luiza Léa Coelho");
    System.out.println(aluno1 == aluno2); // false
    System.out.println(aluno1.equals(aluno2)); // true
    // tem um método equals no aluno

    ///////////////////////////////////////////////////////////////////
    // DATA

    // Objeto de valor
    Data data1 = new Data(22, 3, 2022);
    Data data2 = new Data(22, 3, 2022);
    Data data3 = data1;
    System.out.println(data1 == data2); // false
    System.out.println(data1 == data3); // true
    System.out.println(data1.equals(data2)); // true

    ///////////////////////////////////////////////////////////////////
    // CARRINHO
    Carrinho meuCarrinho = new Carrinho();
		System.out.println(meuCarrinho.getId()); // 1
		String item = "Caneta";

		meuCarrinho.adicionarItem(item);

		System.out.println(meuCarrinho.getItens()); // Caneta
		System.out.println(meuCarrinho.getQuantidadeItens()); // 1

		meuCarrinho.adicionarItem("Boné");

		System.out.println(meuCarrinho.getItens()); // [Térmica, Cuia]
		System.out.println(meuCarrinho.getQuantidadeItens()); // 2

		Carrinho outroCarrinho = new Carrinho();
		System.out.println(outroCarrinho.getId()); // 2

    String termica = "Térmica";
    String cuia = "Cuia";

    outroCarrinho.adicionarItem(termica, cuia);
    outroCarrinho.adicionarItem(5, "Erva Mate");

    System.out.println(outroCarrinho.getItens()); // [Térmica, Cuia, Erva Mate, Erva Mate, Erva Mate, Erva Mate, Erva Mate]
		System.out.println(outroCarrinho.getQuantidadeItens()); // 7
  }
}