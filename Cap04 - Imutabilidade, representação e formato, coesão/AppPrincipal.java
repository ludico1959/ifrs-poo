import java.util.Arrays;

public class AppPrincipal {
  public static void main(String[] args) {
    ///////////////////////////////////////////////////////////////////////////////////
    // Imutabilidade:
    Cor cinza01 = new Cor(215, 215, 215); 
    Cor cinza02 = new Cor(35, 5, 35); 
    Cor cinza03 = new Cor(215, 215, 215); 

    System.out.println(cinza01.equals(cinza02)); // false
    System.out.println(cinza02.equals(cinza03)); // false
    System.out.println(cinza01.equals(cinza03)); // false

    Cor testeDeCor = new Cor(100, 50, 50);
    System.out.println(testeDeCor.red); // 100

    Cor outroTesteDeCor = testeDeCor.avermelhar();
    System.out.println(outroTesteDeCor.red); // 101

    ///////////////////////////////////////////////////////////////////////////////////
    // Representação e Formato:
    int[] corArray1 = outroTesteDeCor.toArray();
    System.out.println(Arrays.toString(corArray1)); // [101, 50, 50]

    System.out.println(testeDeCor.toMap()); // {red=100, green=50, blue=50}

    int[] cores = { 120, 67, 13 };
    Cor corArray2 = new Cor(cores);

    System.out.println(corArray2.red); // 120

    ///////////////////////////////////////////////////////////////////////////////////
    // Contexto estático e métodos de fábrica:
    System.out.println(Cor.fromArray(new int[] {12, 65, 178})); // ex.: Cor@f73

    Cor corHex = Cor.fromHexString("#ADFF2F"); // rgb(173, 255, 47)
    System.out.println(corHex.blue); // 47

    Cor corName = Cor.fromName("indigo");
    System.out.println(corName.blue); // 130

    System.out.println(Cor.COR_PRETA); // ex.: Cor@0

    ///////////////////////////////////////////////////////////////////////////////////
    // método especial 'toString': vem da classe Object
    // todas as classes herdam tudo da classe pai Object
    // outro método que é herdado é o 'equals'
    Cor novaCor = new Cor (155, 10, 0);
    System.out.println(novaCor.toString()); // método toString sobrescrito na classe Cor
    System.out.println(novaCor);
    // devido a estrutura dos métodos de Object, o método 'println' invoca automaticamente o 'toString'

    System.out.println(novaCor.toRGBString());
    System.out.println(novaCor.toHEXString());
  }
}
