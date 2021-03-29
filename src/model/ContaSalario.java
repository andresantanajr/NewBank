package model;

public class ContaSalario extends Conta {
		private double desconto = 1.50;
	
		@Override
		boolean sacar(double valor) {
			this.setSaldo(this.getSaldo()-valor);
			this.setSaldo(this.getSaldo()-desconto);
			return true;
		}
		
		public void totalDescontoSalario() {
			if(this.getContaAtiva()) {
				this.getDesconto();
			}
		}
		
		public void exibirDados() {
			System.out.println("Ol�, Seja bem-vindo ao MainBank!");
			System.out.println("Nome: "+this.getNome());
			System.out.println("Ag�ncia: "+this.getAgencia());
			System.out.println("N�mero da Conta Sal�rio: "+this.getNumeroConta());
			System.out.println("Saldo: "+this.getSaldo());
		}

		public double getDesconto() {
			return desconto;
		}

		public void setDesconto(double desconto) {
			this.desconto = desconto;
		}
	
}
