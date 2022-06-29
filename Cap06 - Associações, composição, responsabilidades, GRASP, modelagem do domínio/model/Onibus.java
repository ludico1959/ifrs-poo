package model;

import java.util.ArrayList;

public class Onibus {
  private final String identificacao;
  private final ArrayList<Assento> assentos = new ArrayList<Assento>();

  public Onibus(String id, int  assentosNormais, int assentosExecutivos) {
    this.identificacao = id;

    for  (int e = 1; e <= assentosExecutivos; e++) {
      this.assentos.add(new Assento(e, true, e % 2 == 1));
    }
    for  (int n = 1; n <= assentosNormais; n++) {
      this.assentos.add(new Assento(n, false, n % 2 == 1));
    }
  }

  public String getIdentificacao() {
    return this.identificacao;
  }

  public ArrayList<Assento> getAssentos() {
    return this.assentos;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Onibus) {
      return ((Onibus) obj).identificacao.equals(this.identificacao);
    }
    return false;
  }

  @Override
  public String toString() {
    return "o" + this.identificacao + "(" + this.assentos.size() + " assentos)";
  }
}
