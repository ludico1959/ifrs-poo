import java.util.HashMap;
import java.util.Map;
import static java.lang.Integer.parseInt;

/** Tornando Cor um OBJETO DE VALOR:
 * 1. Tornar os objetos constantes (final / readonly)
 * 2. Sempre há um construtor que inicialize as constantes
 * 3. Sobrescrever o método 'equals' comparando todos os atributos, no caso do Java
 * 4. OPCIONAL: adicionar comandos que retirnam uma nova instância
*/

public class Cor {
  // constante de classe: objetos pré-instanciados
  // semelhante ao método Math.PI
  public static Cor COR_PRETA  = new Cor(0, 0, 0);
  public static Cor COR_BRANCA = new Cor(255, 255, 255);

  // atributos constantes ✔
  public final int red;
  public final int blue;
  public final int green;

  // construtor que inicialize as constantes ✔
  public Cor() {
    this(0, 0, 0);
  }

  public Cor (int red, int green, int blue) {
    if (red < 0 || green < 0 || blue < 0)
      throw new IllegalArgumentException("há valor RGB menor que 0");
    
    if (red > 255 || green > 255 || blue > 255)
      throw new IllegalArgumentException("há valor RGB maior que 255");

    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  // sobrecarga de construtor para aceitar um array de inteiros
  public Cor (int[] array) {
    this(array[0], array[1], array[2]);
  }

  // adicionar comandos que retirnam uma nova instância ✔
  // comandos em objetos imutáveis retornam o tipo do objeto
  public Cor avermelhar() {
    return new Cor(this.red + 1, this.green, this.blue);
  }

  //////////////////////////////////////////////////////////
  // convenção de métodos toTipo e fromTipo
  public int[] toArray() { // var.toArray
    return new int[] {
      this.red,
      this.green,
      this.blue
    };
  }

  // contexto estático: 
  // os métodos 'from' tipicamento são codados como métodos fábrica esstáticos
  public static Cor fromArray(int[] array) { // Color.fromArray
    return new Cor(array[0], array[1], array[2]);
  }
                                                      //0123456
  public static Cor fromHexString(String str) { // ex.: #CD5C5C
    String r = str.substring(1, 3);
    String g = str.substring(3, 5);
    String b = str.substring(5, 7);

    return new Cor(parseInt(r, 16), parseInt(g, 16), parseInt(b, 16));
  }

  public static Cor fromName(String nome) {
    switch (nome.toLowerCase()) {
      case "black":   return new Cor(0, 0, 0);
      case "silver":  return new Cor(192, 192, 192);
      case "purple":  return new Cor(128, 0, 128);
      case "fuchsia": return new Cor(255, 0, 255);
      case "green":   return new Cor(0, 128, 0);
      case "lime":    return new Cor(0, 255, 0);
      case "indigo":  return new Cor(75, 0, 130);
    }

    throw new IllegalArgumentException("não identificamos esse nome de cor");
  }

  public Map<String, Integer> toMap() {
    Map<String, Integer> mapa = new HashMap<>();
    mapa.put("red", this.red);
    mapa.put("blue", this.blue);
    mapa.put("green", this.green);

    return mapa;
  }
  //////////////////////////////////////////////////////////

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
