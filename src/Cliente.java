public class Cliente {

	private static int SEQUENCIAL = 1;
	private int id;
	private String nome;

	public Cliente(String nome) {
		this.id = SEQUENCIAL++;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("id: %04d", id + 
				"nome: %s", nome);
	}

}
