package model;

public abstract class Conta {
	private String nome;
	private int numeroConta;
	private String agencia;
	private double saldo;
	private boolean saldoOk;
	private boolean contaAtiva = false;
	
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public boolean getContaAtiva() {
			return contaAtiva;
		}
		public void setContaAtiva(boolean contaAtiva) {
			this.contaAtiva = contaAtiva;
		}
		
		//Criando Verificações
		abstract boolean sacar(double valor);
			
		
		public void depositar(double valor) {
			saldo = saldo + valor;
		}
		
		public void transferir(Conta destino, double valor) {
			this.saldo = this.saldo - valor;
			
	        if(this.saldo<=this.saldo) {
	        	destino.saldo = destino.saldo + valor;
	        }
	        
	    }
		
		public void abrirConta() {
			this.contaAtiva=true;
		}
		
		public void fecharConta() {
			if (this.contaAtiva == false) {
				System.out.println("Conta está inativa");
			}
			else if(this.saldo>0){
				this.setAgencia(null);
				this.setNome(null);
				this.setNumeroConta(0);
				this.setSaldo(0);
				System.out.println("Conta fechada com sucesso!");
			}
		}
}
