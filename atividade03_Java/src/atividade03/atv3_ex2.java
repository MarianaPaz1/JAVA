package atividade03;

import java.util.Scanner;

public class atv3_ex2 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int numero;
		
//		Função
		System.out.println("Digite aqui o valor : ");
		numero = leia.nextInt();	
		
		if((numero%2)==0 && numero>=0 ) {
			System.out.println("O número é par e positivo!");
		}else if((numero%2)==0 && numero<0) {
			System.out.println("O número é par e negativo!");
		}else if((numero%2)!=0 && numero>=0) {
			System.out.println("O número é ímpar e positivo! ");
		}else if((numero%2)!=0 && numero<0) {
			System.out.println("O número é ímpar e negativo");
		}else {
			System.out.println("Deu ruim! Reveja o código. ");
		}
		
// LÓGICA PARA NÚMEROS POSITIVOS E NEGATIVOS
//		if(numero >=0) {
//			System.out.println("Esse número é positivo ");
//		}else if(numero<0) {
//			System.out.println("Esse número é negativo ");
//		} else {
//			System.out.println("Erro! ");
//		}
	}

}
