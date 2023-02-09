package atividade03;

import java.util.Scanner;

public class atv8_ex8 {

	public static void main(String[] args) {
		
//		Scanner
		Scanner leia = new Scanner(System.in);
		
//		Variável
		int opcao;
		float saldo, valorD, operacao;
		
		
//		Função
		System.out.println("\n\t\tBanco da Generation");
		System.out.println("\nEscolha uma operação:");
		System.out.println("\n1- Saldo");
		System.out.println("\n2- Saque");
		System.out.println("\n3- Depósito");
		System.out.println("\nDigite a sua opção: ");
		opcao= leia.nextInt();
		
		
		
switch(opcao) {
		
		case 1:
			saldo= 1000;
			System.out.println("\nO seu saldo é de R$" + saldo);
		break;
		case 2:
			System.out.println("\nDigite o valor para saque: ");
			valorD= leia.nextInt();
			saldo =1000;
			operacao = saldo-valorD;
			saldo = saldo-valorD;
			if(valorD >= saldo && saldo>=0) {
			System.out.println("\nSaque realizado com sucesso no valor de R$ " + valorD + " seu novo saldo é R$ " +saldo);
			}else if(valorD == saldo) {
				System.out.println("\nVocê acaba de sacar todo o valor da conta " + valorD + " seu novo saldo é R$ " +saldo);
			}else {
				System.out.println("\nSaldo Insuficiente");
			}
		break;
		case 3:
			System.out.println("\nDigite o valor do depósito: ");
			valorD= leia.nextInt();
			saldo =1000;
			operacao = saldo+valorD;
			System.out.println("\nDepósito realizado com sucesso no valor de R$ " + valorD + " seu novo saldo é R$ " +operacao);
		break;

		default:
			System.out.println("\nOpção Inválida!!!");
}

	}

}
