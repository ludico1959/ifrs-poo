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

    Musica papoReto = new Musica("Papo Reto", new Duracao(0, 3, 57));
    Musica soPorUmaNoite = new Musica("So Por Uma Noite", new Duracao(0, 3, 57));

    // variable arguments (VARARGS)
    Album album = new Album("Acustico MTV", papoReto, soPorUmaNoite);
    System.out.println(album.getTitulo().equals("Acustico MTV"));
    System.out.println(album.getDuracao().toString()); //0h51m29s
    System.out.println(album);
  }
}