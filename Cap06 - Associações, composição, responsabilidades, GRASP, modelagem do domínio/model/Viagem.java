package model;

import java.util.ArrayList;

import util.DataHora;

public class Viagem {
  private final Cidade origem;
  private final Cidade destino;
  private final DataHora dataHora;
  private Onibus onibus;
  private Box boxSaida;
  private final ArrayList<Passagem> passagens = new ArrayList<Passagem>();

  public Viagem(Cidade origem, Cidade destino, DataHora dataHora, Onibus onibus, Box box) {
    this.origem = origem;
    this.destino = destino;
    this.dataHora = dataHora;
    this.onibus = onibus;
    this.boxSaida = box;
    criarPassagemParaCadaAssento();
  }

  private void criarPassagemParaCadaAssento() {
    for (Assento assento : this.onibus.getAssentos()) {
      this.passagens.add(new Passagem(this, assento));
    }
  }

  public Cidade getOrigem() {
    return this.origem;
  }

  public Cidade getDestino() {
    return this.destino;
  }

  public DataHora getDataHora() {
    return this.dataHora;
  }

  public Onibus getOnibus() {
    return this.onibus;
  }

  public Box getBoxSaida() {
    return this.boxSaida;
  }

  public ArrayList<Passagem> getPassagens() {
    return this.passagens;
  }

  public Passagem getPassagem(int numero) {
    return this.passagens.get(numero - 1);
  }

  public int getQuantidadePassagensDisponiveis() {
    int contador = 0;

    for (Passagem passagem : this.passagens) {
      if (passagem.isDisponivel()) {
        contador++;
      }
    }

    return contador;
  }

  @Override
  public String toString() {
    return "Viagem de " + this.getOrigem() 
      + " para " + this.getDestino() 
      + ". Horario: " + this.getDataHora() 
      + ". Saída no box nro." + this.getBoxSaida()
      + " no ônibus nro." + this.getOnibus().getIdentificacao();
  }
}
