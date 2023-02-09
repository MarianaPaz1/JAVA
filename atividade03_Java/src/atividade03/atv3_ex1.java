package atividade03;

import java.util.Scanner;

public class atv3_ex1 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int A, B, C;
		
//		Função
		System.out.println("Digite aqui o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite aqui o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite aqui o valor de C: ");
		C = leia.nextInt();
		
		if((A+B)>C) {
			System.out.println("A + B É MAIOR QUE C ");
		}else if((A+B)<C){
			System.out.println("A + B É MENOR QUE C ");
		}else if ((A+B)== C) {
			System.out.println("A + B É IGUAL A C ");
		}else {
			System.out.println("PANE NO SISTEMA ALGUÉM ME DESCONFIGUROU");
		}

	}

}
