package atividade03;

import java.util.Scanner;

public class atv3_ex1 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Vari�veis		
		int A, B, C;
		
//		Fun��o
		System.out.println("Digite aqui o valor de A: ");
		A = leia.nextInt();
		System.out.println("Digite aqui o valor de B: ");
		B = leia.nextInt();
		System.out.println("Digite aqui o valor de C: ");
		C = leia.nextInt();
		
		if((A+B)>C) {
			System.out.println("A + B � MAIOR QUE C ");
		}else if((A+B)<C){
			System.out.println("A + B � MENOR QUE C ");
		}else if ((A+B)== C) {
			System.out.println("A + B � IGUAL A C ");
		}else {
			System.out.println("PANE NO SISTEMA ALGU�M ME DESCONFIGUROU");
		}

	}

}
