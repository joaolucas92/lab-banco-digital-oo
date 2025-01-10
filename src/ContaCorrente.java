
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Banco banco, Agencia agencia) {
		super(cliente, banco, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("BANCO " + banco.getNome());
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
