package atividade_05;

import java.util.Scanner;

public class atv5_ex4 {
	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int idade, genero, caracteristica, generoF = 0, generoM = 0, generoN = 0, caracteristicaC = 0,
				caracteristicaCalma = 0, caracteristicaNervosa = 0, caracteristicaAgressiva = 0, cCalma18 = 0,
				cNervosa40 = 0;
		int i=0;
//		Função
		while (i <= 150) {
			System.out.println("\t Pesquisa da empresa: ");
			System.out.println("Digite idade: ");
			idade = leia.nextInt();
			System.out.println(" Digite identidade de genero: ");
			System.out.println("1 - Feminino ");
			System.out.println("2 - Masculino ");
			System.out.println("3 - Outros ");
			genero = leia.nextInt();
			System.out.println("Digite sua característica: ");
			System.out.println("1 - Sou uma pessoa calma");
			System.out.println("2 - Sou uma pessoa nervosa");
			System.out.println("3 - Sou uma pessoa agressiva");
			caracteristica = leia.nextInt();

			if (genero == 1) {
				generoF++;
			} else if (genero == 2) {
				generoM++;
			} else if (genero == 3) {
				generoN++;
			}
			if (caracteristica == 1) {
				caracteristicaCalma++;
			}
			if (caracteristica == 1 && idade < 18) {
				cCalma18++;
			} else if (caracteristica == 2) {
				caracteristicaNervosa++;
			}
			if (caracteristica == 2 && idade > 40) {
				cNervosa40++;
			} else if (caracteristica == 2) {
				caracteristicaAgressiva++;
			}
		}

		System.out.println("Número de pessoas calmas " + caracteristicaCalma);
		System.out.println("Número de pessoas nervosas " + caracteristicaNervosa);
		System.out.println("Número de pessoas agressivas " + caracteristicaAgressiva);
		System.out.println("Número de pessoas nervosas com mais de 40 anos " + cNervosa40);
		System.out.println("Número de pessoas calmas com mais de 18 anos " + cCalma18);
	}
}
