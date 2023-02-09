package atividade03;

import java.util.Scanner;

public class atv3_ex5 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
		
//		Variável
		int opcao;
		double valor, valorTotal, quantidade;
		
//		Função
		System.out.println("\n\t\tLanchonete da Generation");
		System.out.println("\nEscolha um item da nossa lanchonete:");
		System.out.println("\n1- Cachorro quente");
		System.out.println("\n2- X-Salada");
		System.out.println("\n3- X-Bacon");
		System.out.println("\n4- Bauru");
		System.out.println("\n5- Refrigerante");
		System.out.println("\n6- Suco de Laranja");
		System.out.println("\nDigite a sua opção: ");
		opcao= leia.nextInt();
		System.out.println("\nDigite a quantidade: ");
		quantidade= leia.nextInt();
		
		
switch(opcao) {
		
		case 1:
			valor= 10;
			valorTotal = valor*quantidade;
			System.out.println("\nO valor total é de R$" + valorTotal);
		break;
		case 2:
			valor= 15;
			valorTotal = valor*quantidade;
			System.out.println("\nO valor total é de R$" + valorTotal);
		break;
		case 3:
			valor= 18;
			valorTotal = valor*quantidade;
			System.out.println("\nO valor total é de R$" + valorTotal);
		break;
		case 4:
			valor= 12;
			valorTotal = valor*quantidade;
			System.out.println("\nO valor total é de R$" + valorTotal);
		break;
		case 5:
			valor= 8;
			valorTotal = valor*quantidade;
			System.out.println("\nO valor total é de R$" + valorTotal);
		break;
		case 6:
			valor= 13;
			valorTotal = valor*quantidade;
			System.out.println("\nO valor total é de R$" + valorTotal);
		break;
		default:
			System.out.println("\nOpção Inválida!!!");
}

	}

}
