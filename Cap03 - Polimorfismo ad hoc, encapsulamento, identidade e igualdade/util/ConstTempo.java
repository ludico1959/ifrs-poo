package util;

/**
 * sem a palavra-chave de visibilidade, a classe ou enum é "privada do pacote"
 * só as classes do pacote podem ver
 */
enum ConstTempo { 
  MINUTOS(60), HORAS(3600);

  final int segundos;

  ConstTempo(int segundos) {
    this.segundos = segundos;
  }
}
