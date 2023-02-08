package Aula02;

import java.util.Scanner;

public class aula02_ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,r,s;
		System.out.println("Digite um número :");
		a = leia.nextInt();
		System.out.println("Digite um número :");
		b = leia.nextInt();
		System.out.println("Digite um número :");
		c = leia.nextInt();
		
		r= Math.pow((a + b), 2);
		s= Math.pow((b + c), 2);
		d= (r+s)/2;
		
		System.out.println("O resultado é :" + d);
	}

}
