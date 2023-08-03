import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private int id;
	private String nome;
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	public Pessoa(int id, String nome, List<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.telefones = telefones;
	}
}

// Acredito que o professor irá criar os tipos de manager em cima desse exemplo. 
