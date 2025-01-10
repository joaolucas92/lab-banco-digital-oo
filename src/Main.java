
public class Main {

	public static void main(String[] args) {
//		Cliente venilton = new Cliente();
//		venilton.setId();
//		venilton.setNome("Venilton");
//		
//		Conta cc = new ContaCorrente(venilton);
//		Conta poupanca = new ContaPoupanca(venilton);
//
//		cc.depositar(100);
//		cc.transferir(100, poupanca);
//		
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
//		
//		Cliente venilton2 = new Cliente();
//		venilton2.setId();
//		venilton2.setNome("Venilton2");
//		
//		Conta cc2 = new ContaCorrente(venilton2);
//		Conta poupanca2 = new ContaPoupanca(venilton2);
//
//		cc2.depositar(100);
//		cc2.transferir(100, poupanca2);
//		
//		cc2.imprimirExtrato();
//		poupanca2.imprimirExtrato();
		
		Banco santander = new Banco("SANTANDER");
		Banco itau = new Banco("ITAÚ");
//		System.out.println(santander.toString());
//		System.out.println(itau.toString());
		
		Agencia porecatuItau = new Agencia("Porecatu", itau);
		itau.adicionarAgencia(porecatuItau);
		Agencia porecatuSant = new Agencia("Porecatu", santander);
		santander.adicionarAgencia(porecatuSant);
		Agencia florestopolisItau = new Agencia("Florestópolis", itau);
		itau.adicionarAgencia(florestopolisItau);
		Agencia londrinaItau = new Agencia("Londrina", itau);
		itau.adicionarAgencia(londrinaItau);
		Agencia londrinaSant = new Agencia("Londrina", santander);
		santander.adicionarAgencia(londrinaSant);
		Agencia cambeItau = new Agencia("Cambé", itau);
		itau.adicionarAgencia(cambeItau);
		
		Cliente joaolucas = new Cliente("João Lucas");
		Cliente ingrid = new Cliente("Ingrid");
		Cliente pedro = new Cliente("Pedro");
		Cliente licelio = new Cliente("Licelio");
		Cliente ludmila = new Cliente("Ludmila");
		Cliente juliane = new Cliente("Juliane");
		
		Conta ccJoao = new ContaCorrente(joaolucas,itau,porecatuItau);
		itau.adicionarConta(ccJoao);
		Conta cpJoao = new ContaPoupanca(joaolucas,santander,porecatuSant);
		santander.adicionarConta(cpJoao);
		Conta ccIngrid = new ContaCorrente(ingrid, itau, florestopolisItau);
		itau.adicionarConta(ccIngrid);
		Conta cpPedro = new ContaPoupanca(pedro, itau, londrinaItau);
		itau.adicionarConta(cpPedro);
		Conta ccLicelio = new ContaCorrente(licelio, santander, londrinaSant);
		santander.adicionarConta(ccLicelio);
		Conta cpLudmila = new ContaPoupanca(ludmila, itau, cambeItau);
		itau.adicionarConta(cpLudmila);
		Conta ccJuliane = new ContaCorrente(juliane, santander, porecatuSant);
		santander.adicionarConta(ccJuliane);
		
		ccJoao.depositar(2000.0);
		ccJoao.sacar(500.0);
		ccJoao.transferir(100.0, ccIngrid);
		ccJoao.transferirTed(200.0, santander, porecatuSant, ccJuliane);
		ccJuliane.transferirTed(50.0, santander, porecatuSant, cpJoao);
		cpPedro.depositar(1000.0);
		ccLicelio.depositar(879.67);
		cpLudmila.depositar(500.0);
		
		ccJoao.imprimirExtrato();
		ccIngrid.imprimirExtrato();
		ccJuliane.imprimirExtrato();
		cpJoao.imprimirExtrato();
		cpPedro.imprimirExtrato();
		ccLicelio.imprimirExtrato();
		cpLudmila.imprimirExtrato();
	}

}
