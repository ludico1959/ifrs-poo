package model;

public class Passagem {
  private Passageiro passageiro;
  private final Viagem viagem;
  private final Assento assento;

  public Passagem(Viagem viagem, Assento assento) {
    this.viagem = viagem;
    this.assento = assento;
  }

  public Assento getAssento() {
    return this.assento;
  }

  public Viagem getViagem() {
    return this.viagem;
  }

  public boolean isDisponivel() {
    return this.passageiro == null;
  }

  public boolean isComprada() {
    return this.passageiro != null;
  }

  public void comprar(Passageiro passageiro) {
    if (this.isComprada()) {
      throw new IllegalStateException("a passagem já foi comprada");
    }

    // comprar passagem é bidirecional 
    this.passageiro = passageiro;
    this.passageiro.adquiriu(this);
  }

  public void cancelar() {
    // cancelar passagem também é bidirecional 
    this.passageiro.cancelou(this);

    this.passageiro = null;
  }

  @Override
  public String toString() {
    return this.getViagem() + " no assento nro." + this.getAssento().getNumero();
  }
}
