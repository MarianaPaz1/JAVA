package Aula02;

import java.util.Scanner;

public class aula02_ex6 {

	public static void main(String[] args) {
		
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Vari�veis		
		double x2, x1, y2, y1, d, a,b;
//		Fun��o
		System.out.println("Digite um n�mero :");
		x1 = leia.nextInt();
		System.out.println("Digite um n�mero :");
		x2 = leia.nextInt();
		System.out.println("Digite um n�mero :");
		y1 = leia.nextInt();
		System.out.println("Digite um n�mero :");
		y2 = leia.nextInt();
		
		a= Math.pow((x2 - x1), 2);
		b= Math.pow((y2 - y1), 2);
		d= Math.sqrt(a+b);
		
		System.out.println("resultado :" + d);
		
	}

}
