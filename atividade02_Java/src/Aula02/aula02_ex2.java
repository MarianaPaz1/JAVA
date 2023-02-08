package Aula02;

import java.math.BigDecimal;
import java.util.Scanner;

public class aula02_ex2 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int dias, ano, mes, dia, diaAno, diaMes, idadeDias;
		ano = 365;
		mes = 30;
//		Função
		System.out.println("Digite aqui sua idade em dias: ");
		dias = leia.nextInt();
		diaAno = dias/ano;
		System.out.println("Seu aniversário em anos é: " + diaAno);
		diaMes = (dias%ano)/mes;
		System.out.println("Seu aniversário em meses: " + diaMes);
		dia = (dias%ano)%mes;
		System.out.println("Seu aniverário em dia: " + dia);
	}

}
