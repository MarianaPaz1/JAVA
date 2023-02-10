package atividade04;

import java.util.Scanner;

public class atv4_ex5 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int i = 0, num, somaPositivos, contagem = 0, res = 0;
//		Função
		num = 1;
		do {
			System.out.println("Digite aqui o número: ");
			num = leia.nextInt();

			if (num > 0) {
				res = +contagem;
			}
			contagem++;
		} while (num != 0);
		res+=contagem;
		System.out.println("Os números positivos são: " + res);
	}

}
