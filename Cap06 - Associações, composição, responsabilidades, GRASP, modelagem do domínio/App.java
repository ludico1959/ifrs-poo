import model.*;
import util.DataHora;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    Cidade rioGrande  = new Cidade("Rio Grande",  "RS");

    Rodoviaria rodoRG = new Rodoviaria("Rodoviária de RG", rioGrande);

    rodoRG.cadastrarUsuario("Ibrahima Araújo Brasil", "509.686.920-28");
    rodoRG.cadastrarUsuario("Levi Barrocas Angelim", "555.071.690-98");
    try {
      rodoRG.cadastrarUsuario("Pilar Moura Silvestre", "555.071.690-98"); // vai falhar!
    } catch (Exception error) {
      System.err.println("usuario já existe");
    } 

    for (int i = 1; i <= 5; i++ ) {
      rodoRG.registrarBox(i);
    }

    Onibus o1255 = new Onibus("1255", 30, 10);

    System.out.println(o1255);

    // cadastrar uma viagem
    Cidade pelotas = new Cidade("Pelotas", "RS");
    Cidade portoAlegre = new Cidade("Porto Alegre", "RS");

    DataHora dataHora = new DataHora(15, 9, 2022, 19, 30, 00);

    rodoRG.novaViagem(rodoRG.getBoxes().get(0), pelotas, dataHora, o1255);

    System.out.println(rodoRG.getViagens());

    // criar passageiro
    Passageiro levi = rodoRG.getUsuarios().get(1);
    Passagem pass = rodoRG.getViagem(1).getPassagem(5);

    System.out.println(levi);
    System.out.println(pass);

    pass.comprar(levi);
    System.out.println(pass.isDisponivel());
    System.out.println(levi.getPassagens());

    pass.cancelar();
    System.out.println(pass.isDisponivel());
    System.out.println(levi.getPassagens());
  }
}