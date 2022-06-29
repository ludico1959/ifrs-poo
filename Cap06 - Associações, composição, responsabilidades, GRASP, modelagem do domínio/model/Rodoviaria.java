package model;

import java.util.ArrayList;

import util.DataHora;

public class Rodoviaria {
  private final String nome;
  private final Cidade cidade;
  private ArrayList<Box> boxes = new ArrayList<Box>();
  // do ponto de vista da Rodoviaria, os passageiros são vistos como usuários
  private ArrayList<Passageiro> usuarios = new ArrayList<Passageiro>();
  private ArrayList<Viagem> viagens = new ArrayList<Viagem>();

  public Rodoviaria(String nome, Cidade cidade) {
    this.nome = nome;
    this.cidade = cidade;
  }

  public String getNome() {
    return this.nome;
  }

  public ArrayList<Box> getBoxes() {
    return this.boxes;
  }

  public ArrayList<Passageiro> getUsuarios() {
    return this.usuarios;
  }

  public ArrayList<Viagem> getViagens() {
    return this.viagens;
  }

  public Viagem getViagem(int numero) {
    return this.viagens.get(numero - 1);
  }

  public void cadastrarUsuario(String nome, String cpf) {
    Passageiro novoUsuario = new Passageiro(nome, cpf);

    if (usuarios.contains(novoUsuario)) {
      throw new IllegalArgumentException("passageiro já está cadastrado");
    }

    this.usuarios.add(novoUsuario);
  }

  public void registrarBox(int numero) {
    Box novoBox = new Box(numero);

    if (boxes.contains(novoBox)) {
      throw new IllegalArgumentException("box já está registrado");
    }

    this.boxes.add(novoBox);
  }

  public void novaViagem(Box box, Cidade destino, DataHora dataHora, Onibus onibus) {
    Viagem novaViagem = new Viagem(this.cidade, destino, dataHora, onibus, box);

    if (viagens.contains(novaViagem)) {
      throw new IllegalArgumentException("viagem já está registrada");
    }

    this.viagens.add(novaViagem);
  }

  @Override
  public String toString() {
    return this.nome + " (" + this.cidade.toString() + ")";
  }
}
