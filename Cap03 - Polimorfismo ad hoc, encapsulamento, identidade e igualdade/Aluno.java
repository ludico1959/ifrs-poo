class Aluno { 
  private int matricula;
  private String nome;

  Aluno(int matricula, String nome) {
    this.matricula = matricula;
    this.nome = nome;
  }

  public int getMatricula() {
    return this.matricula;
  
  }
  public String getNome() {
    return this.nome;
  }

  @Override // equal está sendo sobreposto
  public boolean equals(Object obj) {
    if (obj instanceof Aluno) { // salva-guardar: checa se o tipo de obj é aluno
      Aluno outro = (Aluno) obj;

      return this.matricula == outro.matricula;
    }

    return false;
  }
}
