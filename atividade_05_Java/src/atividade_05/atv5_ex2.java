package atividade_05;

import java.util.Scanner;

public class atv5_ex2 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Vari�veis		
		int num, par=0, impar=0, x;
		
//		Fun��o
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite aqui o valor do " + i + "�n�mero:");
			num= leia.nextInt();
			if(num%2==0) {
				par++;
			}else if(num%2!=0) {
				impar++;
			}
			
		}
		System.out.println("Temos " + par + " n�meros par(es) e " + impar + "n�meros impar(es)");
	}

}
