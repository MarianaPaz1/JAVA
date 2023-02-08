package Aula02;

import java.util.Scanner;

public class aula02_ex1 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			double ano, mes, dia, diaAno, diaMes, idadeDias;
//			System.out.println("Qual sua idade em ano/ mês e dia? ");
			System.out.println("Digite aqui sua idade em anos: ");
			ano = leia.nextDouble();
			System.out.println("Digite aqui sua idade em meses:");
			mes = leia.nextDouble();
			System.out.println("Digite aqui os dias:  ");
			dia = leia.nextDouble();
			
			diaAno = ano*365;
			diaMes = mes*30;
			idadeDias = diaAno+diaMes+dia;
			System.out.println("Seu aniversário em dias é: " + idadeDias);
		
			
			
	}

}
