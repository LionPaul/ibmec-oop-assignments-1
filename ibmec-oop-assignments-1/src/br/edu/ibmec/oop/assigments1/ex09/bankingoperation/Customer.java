package br.edu.ibmec.oop.assigments1.ex09.bankingoperation;

public class Customer {
	private String nome;
	private String cpf;
	private String numeroConta;
	private double saldo;
	
	
	
	public Customer(String nome, String cpf, String numeroConta, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor; 
			System.out.println("Depósito de R$" + valor + "realizado com sucesso!");
		} else {
			System.out.println("Valor inválido para depósito");
		}
	}
	public void sacar (double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido para saque.");
		} else if (valor > saldo) {
			System.out.println("Saldo Insuficiente.");
		} else {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + "realizado com sucesso!");
		}
	}
	
}
