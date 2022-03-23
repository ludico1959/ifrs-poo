class Data {
  private int dia, mes, ano;

  Data (int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  @Override // equal está sendo sobreposto
  public boolean equals(Object obj) {
    if (obj instanceof Data) { // salva-guardas
      Data outraData = (Data) obj;

      return (this.dia == outraData.dia 
        && this.mes == outraData.mes 
        && this.ano == outraData.ano); 
    }

    return false;
  }
}
