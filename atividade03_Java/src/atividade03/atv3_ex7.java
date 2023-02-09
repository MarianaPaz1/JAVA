package atividade03;

import java.util.Scanner;

public class atv3_ex7 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
		
//		Variável
		float n1,n2, total;
		int operacao;
		
//		Função
		System.out.println("\n\t\tCalculadora da Generation");
		System.out.println("\n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		System.out.println("\nDigite o numero1: ");
		n1= leia.nextFloat();
		System.out.println("\nDigite o numero2: ");
		n2= leia.nextFloat();
		System.out.println("\nDigite a sua opção: ");
		operacao= leia.nextInt();
		
		
		
switch(operacao) {
		
		case 1:
			total = n1+n2;
			System.out.println("\nA soma do "+n1+" e n2 " +n2+ "é de:" + total);
		break;
		case 2:
			total = n1-n2;
			System.out.println("\nA soma do "+n1+" e n2 " +n2+ "é de:" + total);
		break;
		case 3:
			total = n1*n2;
			System.out.println("\nA soma do "+n1+" e n2 " +n2+ "é de:" + total);
		break;
		case 4:
			total = n1/n2;
			System.out.println("\nA soma do "+n1+" e n2 " +n2+ "é de:" + total);
		break;
		default:
			System.out.println("\nOpção Inválida!!!");
}

	}

}
