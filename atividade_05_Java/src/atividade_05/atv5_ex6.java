package atividade_05;

import java.util.Scanner;

public class atv5_ex6 {
	public static void main(String[] args) {
//			Scanner
		Scanner leia = new Scanner(System.in);
//			Vari�veis		
		float num, soma = 0, rodada = 0;
//			Fun��o
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			if (num % 3 == 0) {
				soma = soma + num;
				rodada++;
			}
		} while (num != 0);
		System.out.printf("A m�dia dos valores digitado �: %.2f",soma / (rodada - 1));

	}

}
