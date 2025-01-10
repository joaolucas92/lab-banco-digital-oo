
public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;

	protected int numero;
	protected double saldo;
	protected Banco banco;
	protected Agencia agencia;
	protected Cliente cliente;

	public Conta(Cliente cliente, Banco banco, Agencia agencia) {
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
		this.agencia = agencia;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Novo saldo é de: R$ " + saldo);
		} else {
			System.out.println("Valor insuficiente para saque!");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		//System.out.println("Novo saldo é de: R$ " + saldo);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (valor <= saldo) {
			saldo -= valor;
			contaDestino.depositar(valor);
			System.out.println("Valor transferido para conta!");
			System.out.println("Novo saldo é de: R$ " + saldo);
		} else {
			System.out.println("Valor insuficiente para transferência!");
		}
	}
	
	public void transferirTed(double valor, Banco bancoDestino, Agencia agenciaDestino, IConta contaDestino) {
	    if (banco == bancoDestino) {
	        System.out.println("Transferências TED só podem ser feitas para bancos diferentes!");
	    } else if (valor <= saldo) {
	        saldo -= valor;
	        contaDestino.depositar(valor);
	        System.out.println("Transferência TED realizada com sucesso!");
	        System.out.println("Seu novo saldo é de: R$ " + saldo);
	    } else {
	        System.out.println("Saldo insuficiente para transferência TED!");
	    }
	}


	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("ID Titular: %04d", this.cliente.getId()));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %04d-%s", this.agencia.getCodAgencia(), this.agencia.getCidade()));
		System.out.println(String.format("Numero: %06d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
