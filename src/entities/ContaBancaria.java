package entities;

public class ContaBancaria {
	
	private int numero ;
	private String nome;
	private double saldo;
	
	public ContaBancaria(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		//chama a função depositar
		depositar(depositoInicial);
	}

	public  ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo () {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5;
	}
	public String toString() {
		return "Conta: "+
	            numero + " Cliente: " +
				nome +  " Saldo: $" +
	            String.format("%.2f", saldo);
	}
	
	
}
