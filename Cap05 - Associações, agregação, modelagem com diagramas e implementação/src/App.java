package src;

import src.util.*;
import src.model.*;

// essa API é inspirada no Spotify, como álbums, músicas, playlists, etc.
class App {
  public static void main(String[] args) {
    Duracao d1 = new Duracao(5, 40, 31);
    System.out.println(d1);
    
    Duracao d2 = new Duracao(12, 38, 51);
    d1.somar(d2);
    System.out.println(d1);

    Artista cbjr = new Artista("Charlie Brown Jr.");

    Musica papoReto = new Musica("Papo Reto", new Duracao(0, 11, 28), cbjr);
    Musica soPorUmaNoite = new Musica("So Por Uma Noite", new Duracao(0, 4, 1), cbjr);

    // variable arguments (VARARGS)
    Album acusticoMTV = new Album("Acustico MTV", papoReto, soPorUmaNoite);
    System.out.println(acusticoMTV.getTitulo().equals("Acustico MTV"));
    System.out.println(acusticoMTV.getDuracao().toString()); //0h51m29s
    System.out.println(acusticoMTV);

    Playlist curtidas = new Playlist("Músicas Curtidas");
    System.out.println(curtidas.getNome());
    System.out.println(curtidas.getDataHoraCriacao());

    curtidas.adicionarMusica(papoReto);
    curtidas.adicionarMusica(soPorUmaNoite);
    curtidas.adicionarMusica(new Musica("Me Encontra", new Duracao(0, 2, 57)));
    System.out.println(curtidas.getMusicas());

    System.out.println(curtidas.getDuracao());
    System.out.println(curtidas);

    curtidas.removerMusica(papoReto);
    System.out.println(curtidas.getDuracao());
    System.out.println(curtidas);

    curtidas.reordenarMusica(soPorUmaNoite, 1);
    System.out.println(curtidas);

    curtidas.removerMusica(0);
    System.out.println(curtidas);
    
    try {
      curtidas.removerMusica(soPorUmaNoite);
    } catch (Exception e) {
      System.out.println(e);
    }

    Playlist sk8 = new Playlist("Sk8 Old School Vibration", papoReto);
    System.out.println(sk8);

    try {
      sk8.adicionarMusica(papoReto);
    } catch (Exception e) {
      System.out.println(e);
    }

    Musica meEncontra = new Musica("Me Encontra", d1, cbjr);
    Musica soOsLoucosSabem = new Musica("Só Os Loucos Sabem", d2, cbjr);

    Album camisa10 = new Album("Camisa 10 Joga Bola Até na Chuva", meEncontra, soOsLoucosSabem);
    System.out.println(camisa10);

    Colecao minhaColecao = new Colecao("Minha Coleção de Álbuns");
    minhaColecao.adicionarAlbum(acusticoMTV);
    minhaColecao.adicionarAlbum(camisa10);


    ///////////////////////////////////////////////////////////////////////
    // navegar pelo/atravessar o grafo de objetos

    // DUVIDA: Por que alguns arrays precisam de .get(index) e outros de [index]?
    System.out.println(minhaColecao);
    System.out.println(minhaColecao.getAlbuns().get(1)
      .getMusicas()[0]
      .getArtista()
      .getNome());

      System.out.println(sk8.getMusicas().get(0)
        .getDuracao()
        .getMinutos());
  }
}