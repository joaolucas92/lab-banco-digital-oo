
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco, Agencia agencia) {
		super(cliente, banco, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("BANCO " + banco.getNome());
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
