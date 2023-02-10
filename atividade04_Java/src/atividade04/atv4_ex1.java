package atividade04;

import java.util.Scanner;

public class atv4_ex1 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int num1, num2, intervalo;
		
//		Função
		System.out.println("Digite aqui o valor de número1: ");
		num1 = leia.nextInt();
		System.out.println("Digite aqui o valor de número2: ");
		num2 = leia.nextInt();
		intervalo = num1-num2;
		
		if(num1>num2) {
			System.out.println("Número inválido");
		}else{
		for(int i=num1; i<=num2; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i +" Múltiplo por 3 e 5");
			}
		}
				
		
		
		
	}
	}
}

