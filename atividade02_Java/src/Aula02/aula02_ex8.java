package Aula02;

import java.util.Scanner;

public class aula02_ex8 {

	public static void main(String[] args) {
	
//		Scanner
		Scanner leia = new Scanner(System.in);
				
//		Variáveis		
		double custo, porcentagem, impostos, custo1,custo2, valorTotal;
		porcentagem = 28;
		impostos = 45;
		custo=50000;
		
		//		Função
		custo1=(custo/100)*impostos;
		custo2=(custo/100)*porcentagem;
		valorTotal = custo + custo1 + custo2;
		
		System.out.printf("O custo do seu novo carro é %.2f : ", valorTotal);		
	}

}
