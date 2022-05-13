package src.model;

public class Artista {
  private String nome;

  public Artista(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  @Override
  public String toString() {
    return "((" + this.nome + "))";
  }
}


