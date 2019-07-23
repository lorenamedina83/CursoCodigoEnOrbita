package Banco;

public class Cuenta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public Cuenta(double saldoInicial) {
		super();
		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}else {
			this.saldo = saldoInicial;
		}
	}
	public double depositar(double monto) {
		if (monto > 0) {
			return (this.saldo + monto);
		}else {
			return this.saldo;
		}
	}

   
	
}
