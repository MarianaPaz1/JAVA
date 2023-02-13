package atividade_05;

import java.util.Scanner;

public class atv5_ex5 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int num, soma = 0, somaIdadeMaior = 0;
//		Função
				do {
				System.out.println("Digite um número: ");
				num = leia.nextInt();
				if(num!=0) {
					soma+=num;
				}
			}while(num !=0);
			System.out.println("A soma dos valores digitado é: " + soma);
	}


}
