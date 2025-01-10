public class Agencia {
	
	private static int SEQUENCIAL = 1;
	private int codAgencia;
	private String cidade;
	private Banco banco;
	
	public Agencia(String cidade, Banco banco) {
		this.codAgencia = SEQUENCIAL++;
		this.cidade = cidade;
		this.banco = banco;
	}

	public int getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(int codAgencia) {
		this.codAgencia = codAgencia;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
}
