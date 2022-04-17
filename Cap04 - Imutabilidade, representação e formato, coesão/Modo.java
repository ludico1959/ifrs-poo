public class Modo {
  private static final String[] MODOS = { "ventilar", "frio", "quente" };
  private final int modo;

  public Modo(int novoModo) {
    if (novoModo < 0 || novoModo > 2) {
      throw new IllegalArgumentException();
    }
    this.modo = novoModo;
  }

  public Modo() {
    this.modo = 0;
  }

  public String get() {
    return MODOS[this.modo];
  }

  public Modo mudar() {
    return new Modo((this.modo + 1) % 3);
  }

  @Override
  public String toString() {
    return "modo " + this.get();
  }

}