package src.model;

import java.util.ArrayList;

public class Colecao {
  private ArrayList<Album> albuns = new ArrayList<Album>();
  private String nome;

  public Colecao(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public ArrayList<Album> getAlbuns() {
    return this.albuns;
  }

  public void adicionarAlbum(Album novoAlbum) {
    this.albuns.add(novoAlbum);
  }

  @Override
  public String toString() {
    return "##############\n" + this.nome + " " + this.albuns + "\n###############";
  }
}
