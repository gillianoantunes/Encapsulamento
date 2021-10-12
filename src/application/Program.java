package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.println("Digite o número da conta");
		int numero = sc.nextInt();
		//depois de nextint tem que dar um nextLine para pular linha
		sc.nextLine();
		System.out.println("Digite o nome do titular da conta:");
		String nome = sc.nextLine();
		System.out.println("Deseja entrar com valor inicial? s/n");
		char resposta = sc.next().charAt(0);
		double depositoInicial;
		
		if (resposta == 's') {
			System.out.println("qual valor do depósito inicial?");
			depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, nome, depositoInicial);
		}
		else {
			 conta = new ContaBancaria(numero, nome);
		}
		System.out.println("Dados da conta:");
		System.out.println(conta);
		System.out.println("Entre com um depósito:");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		System.out.println("Entre com o valor de saque:");
		double valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		sc.close();
		
		/* Para buscar nome, 
		 * System.out.println(conta.getNome());
		 * para alterar nome cria uma variavel com nome que deseja
		 * String nomeNovo = sc.next.Line();
		 * e chama o setNome passando o nomeNovo como parametro
		 * conta.setNome(nomeNovo);
		 */
	}

}
