class Pessoa { // Java Bean: objeto com getters e setters
  private String nome;
  
  Pessoa (String nome) {
    this.nome = nome;
  }

  // Por convenção, coloca-se o get do nome do métodos na frente
  String getNome() { // getter
    return this.nome;
  }

  void setNome(String novoNome) { // setter
    this.nome = novoNome;
  }
}
