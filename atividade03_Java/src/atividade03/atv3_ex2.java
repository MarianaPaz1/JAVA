package atividade03;

import java.util.Scanner;

public class atv3_ex2 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Vari�veis		
		int numero;
		
//		Fun��o
		System.out.println("Digite aqui o valor : ");
		numero = leia.nextInt();	
		
		if((numero%2)==0 && numero>=0 ) {
			System.out.println("O n�mero � par e positivo!");
		}else if((numero%2)==0 && numero<0) {
			System.out.println("O n�mero � par e negativo!");
		}else if((numero%2)!=0 && numero>=0) {
			System.out.println("O n�mero � �mpar e positivo! ");
		}else if((numero%2)!=0 && numero<0) {
			System.out.println("O n�mero � �mpar e negativo");
		}else {
			System.out.println("Deu ruim! Reveja o c�digo. ");
		}
		
// L�GICA PARA N�MEROS POSITIVOS E NEGATIVOS
//		if(numero >=0) {
//			System.out.println("Esse n�mero � positivo ");
//		}else if(numero<0) {
//			System.out.println("Esse n�mero � negativo ");
//		} else {
//			System.out.println("Erro! ");
//		}
	}

}
