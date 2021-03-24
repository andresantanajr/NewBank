package model;

public class ContaPoupanca extends Conta{
		private double bonus = 50;
		
		@Override
		boolean sacar(double valor) {
			this.setSaldo(this.getSaldo()-valor);
			this.setSaldo(this.getSaldo()+bonus);
			return true;
		}
	
		public void exibirDados() {
			System.out.println("Olá, Seja bem-vindo ao MainBank!");
			System.out.println("Nome: "+this.getNome());
			System.out.println("Agência: "+this.getAgencia());
			System.out.println("Número da Conta Poupança: "+this.getNumeroConta());
			System.out.println("Saldo: "+this.getSaldo());
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
}
