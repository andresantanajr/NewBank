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
			System.out.println("Ol�, Seja bem-vindo ao MainBank!");
			System.out.println("Nome: "+this.getNome());
			System.out.println("Ag�ncia: "+this.getAgencia());
			System.out.println("N�mero da Conta Poupan�a: "+this.getNumeroConta());
			System.out.println("Saldo: "+this.getSaldo());
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
}
