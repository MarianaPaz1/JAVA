package atividade_05;

import java.util.Scanner;

public class atv5_ex5 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Vari�veis		
		int num, soma = 0, somaIdadeMaior = 0;
//		Fun��o
				do {
				System.out.println("Digite um n�mero: ");
				num = leia.nextInt();
				if(num!=0) {
					soma+=num;
				}
			}while(num !=0);
			System.out.println("A soma dos valores digitado �: " + soma);
	}


}
