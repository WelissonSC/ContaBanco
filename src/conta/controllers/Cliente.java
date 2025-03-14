package conta.controllers;

public class Cliente {
	private int numero;
	private String agencia;
	private String nome;
	private Double saldo;
	
	public Cliente(int numero, String agencia, String nome, Double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(Double valor) {
		if (valor <= 0 || valor > this.saldo) {
			System.out.println("Valor de saque não permitido");
		} else {
			this.saldo -= valor;
			System.out.println("Saque de " + valor + " realizado com sucesso, seu saldo é de: R$" + this.saldo);
		}
	}
	
}
