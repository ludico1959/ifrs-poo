package src.model;

import src.util.Duracao;

public class Musica {
  private final String titulo;
  private final Duracao duracao;

  public Musica(String titulo, Duracao duracao) {
    this.titulo = titulo;
    this.duracao = duracao;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public Duracao getDuracao() {
    return this.duracao;
  }

  @Override
  public String toString() {
    return this.getTitulo() + " " + this.getDuracao();
  }
}
