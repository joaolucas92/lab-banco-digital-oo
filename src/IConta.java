public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void transferirTed(double valor,Banco banco, Agencia agencia, IConta contaDestino);
	
	void imprimirExtrato();
}
