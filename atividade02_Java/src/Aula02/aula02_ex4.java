package Aula02;

import java.util.Scanner;

public class aula02_ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,r,s;
		System.out.println("Digite um n�mero :");
		a = leia.nextInt();
		System.out.println("Digite um n�mero :");
		b = leia.nextInt();
		System.out.println("Digite um n�mero :");
		c = leia.nextInt();
		
		r= Math.pow((a + b), 2);
		s= Math.pow((b + c), 2);
		d= (r+s)/2;
		
		System.out.println("O resultado � :" + d);
	}

}
