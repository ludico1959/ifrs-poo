public class App03 {
  public static void main(String[] args) {
    // imutabilidade
    Cor cinza01 = new Cor(215, 215, 215); 
    Cor cinza02 = new Cor(35, 5, 35); 
    Cor cinza03 = new Cor(215, 215, 215); 

    System.out.println(cinza01.equals(cinza02)); // false
    System.out.println(cinza02.equals(cinza03)); // false
    System.out.println(cinza01.equals(cinza03)); // false

    Cor teste01 = new Cor(100, 50, 50);
    System.out.println(teste01.red); // 100

    Cor teste02 = teste01.avermelhar();
    System.out.println(teste02.red); // 101
  }
}
