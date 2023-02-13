package atividade_05;

import java.util.Scanner;

public class atv5_ex3 {
	public static void main(String[] args) {
		
//				Scanner
				Scanner leia = new Scanner(System.in);
//				Variáveis		
				int num, somaIdadeMenor = 0, somaIdadeMaior = 0;
//				Função
				System.out.println("\t Digite o número: ");
				num = leia.nextInt();
				while (num != -99) {
					if (num < 21) {
						somaIdadeMenor++;
					}
					if (num > 50) {
						somaIdadeMaior++;
					}
					System.out.println("Digite aqui o valor de idade: ");
					num = leia.nextInt();

				}
				System.out.println("Total de pessoas menores de 21 anos: " + somaIdadeMenor);
				System.out.println("Total de pessoas maiores de 50 anos: " + somaIdadeMaior);
			}
			
		
	}
	

