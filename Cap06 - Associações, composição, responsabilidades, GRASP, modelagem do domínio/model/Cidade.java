package model;

public class Cidade {
  private final String nome;
  private final String estado; 

  public Cidade(String nome,  String estado) {
    this.nome = nome;
    this.estado = estado;
  }

  public String getNome() {
    return this.nome;
  }

  public String getEstado() {
    return this.estado;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Cidade) {
      return ((Cidade) obj).nome.equals(this.nome) && ((Cidade) obj).estado.equals(this.estado);
    }
    
    return false;
  }

  @Override
  public String toString() {
    return this.nome + "/" + this.estado;
  }
}
