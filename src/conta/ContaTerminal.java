package conta;

import java.util.Scanner;

import conta.controllers.Cliente;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nome;
		Double saldo;
		
		System.out.println("olá! bem vindo ao sistema banco");
		System.out.println("Digite seu usuario");
		numero = sc.nextInt();
		System.out.println("Digite sua Agencia");
		agencia = sc.next();
		System.out.println("Digite seu nome");
		nome = sc.next();
		System.out.println("Digite seu saldo");
		saldo = sc.nextDouble();
		
		Cliente cliente = new Cliente(numero, agencia, nome, saldo);
		
		System.out.println("Olá "+ cliente.getNome() +", obrigado por criar uma conta em nosso banco, sua agência é "
				 + cliente.getAgencia() +" , conta: " + cliente.getNumero() +" e seu saldo "+ cliente.getSaldo() + 
				 " já está disponível para saque.");
		
		System.out.println("Digite 1 para sacar ou 0 para sair");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
			System.out.println("Seu saldo é de " + cliente.getSaldo() +" Digite valor do saque valor do saque");
			Double saldoSacar;
			cliente.sacar(saldoSacar = sc.nextDouble());
		} else {
			System.out.println("Obridao por usar nosso banco");
		}
	}

}
