import java.util.ArrayList;
import java.util.List;

class Carrinho {
	// id: numeração sequencial, id universalmente único UUID/GUID
	// atributo da classe (não do objeto)
	private static long contador = 0;

	private final long id;
	// lista
	private List<String> lista = new ArrayList<String>();

	Carrinho() {
		this.id = ++contador; // pré-incremento
	}

	long getId() {
		return id;
	}

  // SOBRECARGA DE MÉTODO // MÉTODO SOBRECARREGADO
	// POLIMORFISMO AD-HOC, métodos com o mesmo nome, mas,
	// assinaturas diferentes (parâmetros)
	void adicionarItem(String item) {
		lista.add(item);
	}

  // sobrecarga:
	void adicionarItem(String item1, String item2) {
		lista.add(item1);
		lista.add(item2);
	}

  // sobrecarga:
	void adicionarItem(int quantidade, String item) {
		for (int i = 0; i < quantidade; i++) 
      lista.add(item);
	}

  // variable arguments (varargs)
	// void adicionarItem(String... itens) {}

	List<String> getItens() {
		return lista;
	}

	int getQuantidadeItens() {
		return lista.size();
	}

}
