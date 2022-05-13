package src.model;

public class PlaylistNaoPodeFicarVaziaException extends RuntimeException {
  public PlaylistNaoPodeFicarVaziaException() {
    super("playlist nao pode ficar vazia");
  }
}
