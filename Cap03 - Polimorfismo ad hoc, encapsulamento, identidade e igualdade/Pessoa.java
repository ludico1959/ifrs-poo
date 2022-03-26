public class Pessoa { // Java Bean: objeto com getters e setters
  private String nome;
  private String sobrenome;
  
  public Pessoa (String nome) {
    this(nome, "Coelho");
  }

  public Pessoa (String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  // Por convenção, coloca-se o get do nome do métodos na frente
  public String getNome() { // getter
    return this.nome;
  }

  public String getSobrenome() { // getter
    return this.sobrenome;
  }

  public void setNome(String novoNome) { // setter
    this.nome = novoNome;
  }

  public void setSobrenome(String novoSobrenome) { // getter
    this.sobrenome = novoSobrenome;
  }
}
