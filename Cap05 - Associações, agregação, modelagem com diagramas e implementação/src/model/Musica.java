package src.model;

import src.util.Duracao;

public class Musica {
  private final String titulo;
  private final Duracao duracao;
  private Artista artista;

  public Musica(String titulo, Duracao duracao) {
    this.titulo = titulo;
    this.duracao = duracao;
  }

  public Musica(String titulo, Duracao duracao, Artista artista) {
    this.titulo = titulo;
    this.duracao = duracao;
    this.artista = artista;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public Duracao getDuracao() {
    return this.duracao;
  }

  public Artista getArtista() {
    return this.artista;
  }

  @Override
  public String toString() {
    return this.getTitulo() + " " + this.artista + " " + this.getDuracao();
  }
}
