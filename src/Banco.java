import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static int SEQUENCIAL = 1;
	private int codigo;
	private String nome;
	private List<Agencia> agencias;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.codigo = SEQUENCIAL++;
		this.nome = nome;
		this.agencias = new ArrayList<>();
		this.contas = new ArrayList<>();
	}
	
	public void adicionarAgencia(Agencia agencia) {
		agencias.add(agencia);
		System.out.println("Agencia adicionada ao banco: " + agencia.getCodAgencia());
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
		System.out.println("Conta adicionada ao banco: " + conta.getNumero());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}

	@Override
	public String toString() {
		return "Banco [" + codigo + "," + nome + "," + agencias + "," + contas + "]";
	}

}
