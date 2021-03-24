package model;

public class ContaUsuario {
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		cc1.setSaldo(100);
		cp1.setSaldo(200);
		
		cc1.sacar(50);
		cp1.sacar(200);
		
		System.out.println(cc1.getSaldo());
		System.out.println(cp1.getSaldo());
		
		
		
		//Conta Corrente
		/*cc1.setNome("André Santana");
		cc1.setAgencia("0001");
		cc1.setNumeroConta(202021);
		cc1.setSaldo(600);
		cc1.setContaAtiva(true);
		
		
		//Conta Poupança
		cp1.setNome("André Santana");
		cp1.setAgencia("0001");
		cp1.setNumeroConta(202022);
		cp1.setSaldo(200);
		cp1.setContaAtiva(true);
		
		
		
		cc1.transferir(cp1, 200);
		cc1.exibirDados();
		cp1.exibirDados();*/
	}
}
