package src.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import src.util.Duracao;

public class Playlist {
  private String nome;
  private final LocalDateTime dataHoraCriacao;
  private ArrayList<Musica> musicas = new ArrayList<Musica>();
  // private Musica[] musicas; // não é recomendado o atributo desse tipo, pois o array não pode ter tamanho fixo


  public Playlist(String nome) {
    this.nome = nome;
    this.dataHoraCriacao = LocalDateTime.now();
  }

  public Playlist(String nome, Musica primeiraMusica) {
    this.nome = nome;
    this.dataHoraCriacao = LocalDateTime.now();
    this.musicas.add(primeiraMusica);
  }

  public void renomear(String novoNome) {
    this.nome = novoNome;
  }

  public String getNome() {
    return this.nome;
  }

  public LocalDateTime getDataHoraCriacao() {
    return this.dataHoraCriacao;
  }

  public ArrayList<Musica> getMusicas() {
    return this.musicas;
  }

  public Duracao getDuracao() {
    Duracao duracaoTotal = new Duracao();

    for (Musica musica : this.musicas) {
      duracaoTotal.somar(musica.getDuracao());
    }

    return duracaoTotal;
  }

  public void adicionarMusica(Musica novaMusica) {
    for (Musica musica : this.musicas) {
      if (musica.equals(novaMusica))
        throw new IllegalArgumentException("musica ja foi adicionada");
    }

    this.musicas.add(novaMusica);
  }

  public void removerMusica(Musica musica) {
   if (this.musicas.size() == 1) 
    throw new PlaylistNaoPodeFicarVaziaException();


    this.musicas.remove(musica);
  }

  public void removerMusica(int posicao) {
  if (this.musicas.size() == 1) 
    throw new PlaylistNaoPodeFicarVaziaException();


    this.musicas.remove(posicao);
  }

  public void reordenarMusica(Musica musica, int posicao) {
    this.musicas.remove(musica);
    this.musicas.add(posicao, musica);
  }

  @Override
  public String toString() {
    return "\n==========\nPlaylist: " + this.getNome() + " " + this.dataHoraCriacao + 
    "\n" + getMusicas() + "\n==========\n";
  }
}
