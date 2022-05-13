package src;

import src.util.*;
import src.model.*;

class App {
  public static void main(String[] args) {
    Duracao d1 = new Duracao(5, 40, 31);
    System.out.println(d1);
    
    Duracao d2 = new Duracao(12, 38, 51);
    d1.somar(d2);
    System.out.println(d1);

    Musica papoReto = new Musica("Papo Reto", new Duracao(0, 11, 28));
    Musica soPorUmaNoite = new Musica("So Por Uma Noite", new Duracao(0, 4, 1));

    // variable arguments (VARARGS)
    Album album = new Album("Acustico MTV", papoReto, soPorUmaNoite);
    System.out.println(album.getTitulo().equals("Acustico MTV"));
    System.out.println(album.getDuracao().toString()); //0h51m29s
    System.out.println(album);

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
  }
}