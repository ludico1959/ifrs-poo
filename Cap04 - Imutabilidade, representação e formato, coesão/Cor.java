/** Tornando Cor um OBJETO DE VALOR:
 * 1. Tornar os objetos constantes (final / readonly)
 * 2. Sempre há um construtor que inicialize as constantes
 * 3. Sobrescrever o método 'equals' comparando todos os atributos, no caso do Java
 * 4. OPCIONAL: adicionar comandos que retirnam uma nova instância
*/

public class Cor {
  // atributos constantes ✔
  public final int red;
  public final int blue;
  public final int green;

  // construtor que inicialize as constantes ✔
  public Cor (int red, int green, int blue) {
    if (red < 0 || green < 0 || blue < 0)
      throw new IllegalArgumentException("Há valor RGB menor que 0");
    
    if (red > 255 || green > 255 || blue > 255)
      throw new IllegalArgumentException("Há valor RGB maior que 255");

    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  // adicionar comandos que retirnam uma nova instância ✔
  // comandos em objetos imutáveis retornam o tipo do objeto
  public Cor avermelhar() {
    return new Cor(this.red + 1, this.green, this.blue);
  }

  // Sobrescrever o método'equals' ✔
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Cor) {
      Cor outraCor = (Cor) obj;

      return this.red   == outraCor.red   &&
             this.green == outraCor.green &&
             this.blue  == outraCor.blue;
    }

    return false;
  }

  // Não é relevante no momento...
  @Override
  public int hashCode() {
    return this.red * 7 + this.green * 13 + this.blue * 17;
  }
}
