package exercicio;

public class Conta {
	
	private int numeroDaConta;
	private String titular;
	private double saldoDaConta;
	
	// Construtor padrão
	
	public Conta(int numeroDaConta, String titular) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
	}
	
	// Construtor com Depósito inicial
	
	public Conta(int numeroDaConta, String titular, double depositoInicial) {
		this.titular = titular;
		this.numeroDaConta = numeroDaConta;
		this.saldoDaConta += depositoInicial;
	}
	
	// Métodos auxiliares
	
	public void depositar(double quantity) {
		this.saldoDaConta += quantity;
	}
	
	public void sacar(double quantity) {
		this.saldoDaConta -= (quantity+5.0);
	}

	// Getters e setters
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public double getSaldo() {
		return this.saldoDaConta;
	}
}
