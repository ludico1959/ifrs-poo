import java.util.Arrays;

public class App02 {
  public static void main(String[] args) {
    // int i = 2;
    // double d = 2.2;
    // boolean b = true;
    // final float f = 3.5F;

    // i = 5;
    // f = 78; a variável f não ode ser reatribuida porque é constante

    // arrays em Java são objetos mutáveis
    final int[] idades = new int[3];
    System.out.println(Arrays.toString(idades));
    idades[0] = 15;
    idades[1] = 25;
    idades[2] = 35;
    System.out.println(Arrays.toString(idades));

    /**
     * idades = new int[10]; => erro!
     * o final torna o símbolo 'idades' não reatribuível,
     * mas não torna o array imutável 
     */

    zeraArray(idades);
    System.out.println(Arrays.toString(idades));

    // Strings em Java (e em muitas outras linguagens) são IMUTÁVEIS
    final String nome = "Lucas Dias Coelho";
    System.out.println(nome);
    nome.toUpperCase(); // a String nome é imutável 
    System.out.println(nome);
    // nome = nome.toUpperCase();
    String novoNome = nome.toUpperCase();
    System.out.println(novoNome);

    System.out.println("\nTestando imutabilidades de array e string...");
    
    zeraArray(idades); // mutável, por isso há a alteração dentro do método
    System.out.println(Arrays.toString(idades));

    maiusculas(nome); // imutável
    System.out.println(nome);
  }

  static void zeraArray(int[] array) {
    for (int i = 0; i < array.length; i++) 
      array[i] = 0;
  }
  
  static void maiusculas(String s) {
    s.toUpperCase();
  }
}
