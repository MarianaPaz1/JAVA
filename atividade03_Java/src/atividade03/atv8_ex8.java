package atividade03;

import java.util.Scanner;

public class atv8_ex8 {

	public static void main(String[] args) {
		
//		Scanner
		Scanner leia = new Scanner(System.in);
		
//		Vari�vel
		int opcao;
		float saldo, valorD, operacao;
		
		
//		Fun��o
		System.out.println("\n\t\tBanco da Generation");
		System.out.println("\nEscolha uma opera��o:");
		System.out.println("\n1- Saldo");
		System.out.println("\n2- Saque");
		System.out.println("\n3- Dep�sito");
		System.out.println("\nDigite a sua op��o: ");
		opcao= leia.nextInt();
		
		
		
switch(opcao) {
		
		case 1:
			saldo= 1000;
			System.out.println("\nO seu saldo � de R$" + saldo);
		break;
		case 2:
			System.out.println("\nDigite o valor para saque: ");
			valorD= leia.nextInt();
			saldo =1000;
			operacao = saldo-valorD;
			saldo = saldo-valorD;
			if(valorD >= saldo && saldo>=0) {
			System.out.println("\nSaque realizado com sucesso no valor de R$ " + valorD + " seu novo saldo � R$ " +saldo);
			}else if(valorD == saldo) {
				System.out.println("\nVoc� acaba de sacar todo o valor da conta " + valorD + " seu novo saldo � R$ " +saldo);
			}else {
				System.out.println("\nSaldo Insuficiente");
			}
		break;
		case 3:
			System.out.println("\nDigite o valor do dep�sito: ");
			valorD= leia.nextInt();
			saldo =1000;
			operacao = saldo+valorD;
			System.out.println("\nDep�sito realizado com sucesso no valor de R$ " + valorD + " seu novo saldo � R$ " +operacao);
		break;

		default:
			System.out.println("\nOp��o Inv�lida!!!");
}

	}

}
