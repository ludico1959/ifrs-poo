package model;

import java.util.ArrayList;

public class Passageiro {
  private String nome;
  private String email;
  private final String cpf;
  private ArrayList<Passagem> passagens = new ArrayList<Passagem>(); 

  Passageiro(String nome, String cpf, String email) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
  }

  public Passageiro(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getEmail() {
    return this.email;
  }
  
  public ArrayList<Passagem> getPassagens() {
    return this.passagens;
  }

  public void adquiriu(Passagem passagem) {
    this.passagens.add(passagem);
  }

  public void cancelou(Passagem passagem) {
    this.passagens.remove(passagem);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Passageiro) {
      return ((Passageiro) obj).cpf.equals(this.cpf);
    }

    return false;
  }

  @Override
  public String toString() {
    return this.nome + ", CPF: " + this.cpf;
  }
}
