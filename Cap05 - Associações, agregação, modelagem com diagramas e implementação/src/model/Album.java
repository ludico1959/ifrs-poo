package src.model;

import java.util.Arrays;
import src.util.Duracao;

public class Album {
  private String titulo;
  private final Musica[] musicas;

  /** Outras opções de agregação:
   * private final ArrayList musicas;
   * private final HashSet musicas;
   */

   // Musica... significa música varargs a, b, c, d...
   public Album(String titulo, Musica... musicas) {
    this.titulo = titulo;
    this.musicas = musicas;
   }

   public String getTitulo() {
     return this.titulo;
   }

  public Duracao getDuracao() {
    Duracao total = new Duracao(0, 0, 0);

    for (Musica m: this.musicas) {
      total.somar(m.getDuracao());
    }

    return total;
  }

  public Musica[] getMusicas() {
    return this.musicas;
  }

  public Musica getMusica(int index) {
    return getMusicas()[index];
  }

  @Override
  public String toString() {
    return "\n----------\nAlbum: " + this.getTitulo() + "\n" + Arrays.toString(this.musicas) + "\n----------\n";
  }
}
