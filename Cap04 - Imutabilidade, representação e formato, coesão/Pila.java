// final => a classe não pode ser estendida
public final class Pila {

  private final int pila; 

  public Pila(int quantia) {
    this.pila = quantia;
  }

  public Pila somar(Pila quantia) {
    return new Pila(this.pila + quantia.pila);
  }
  /**
   * System.out.println(doisPila);
   * Transforma a chamada acima em string.
   * */ 
  public String toString() {
    return "R$ " + this.pila; 
  }

  public int getPila() {
    return this.pila;
  }

//   public void setPila(int quantia) {
//     this.pila = quantia;
//   }
}
