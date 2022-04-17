// classse com alta coesão 
public class ArCondicionado {
  private final String marcaModelo;
  private Temperatura temp = new Temperatura(21, 17, 32);
  private Modo modo;

  public ArCondicionado(String marcaModelo) {
    this.marcaModelo = marcaModelo;
    this.modo = new Modo();
  }

  public String getMarcaModelo() {
    return this.marcaModelo;
  }

  public int getTemperatura() {
    return this.temp.getValor();
  }

  public void aumentarTemperatura() {
    try {
      this.temp = this.temp.aumentar();
    } catch (IllegalArgumentException e) {
      return;
    }
  }

  public void baixarTemperatura() {
    try {
      this.temp = this.temp.baixar();
    } catch (IllegalArgumentException e) {
      return;
    }
  }

  public String getModo() {
    return this.modo.get();
  }

  public void mudarModo() {
    this.modo = this.modo.mudar();
  }

  @Override
  public String toString() {
    return "Ar-condicionado " + this.getMarcaModelo() + " operando no " + this.modo + " a " + this.temp;
  }
}