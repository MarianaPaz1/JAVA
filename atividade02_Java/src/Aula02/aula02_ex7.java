package Aula02;

import java.util.Scanner;

public class aula02_ex7 {

	public static void main(String[] args) {
		double a, b, c, d, e,f,x,y;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		a= leia.nextFloat();
		System.out.println("Digite um n�mero: ");
		b= leia.nextFloat();
		System.out.println("Digite um n�mero: ");
		c= leia.nextFloat();
		System.out.println("Digite um n�mero: ");
		d= leia.nextFloat();
		System.out.println("Digite um n�mero: ");
		e= leia.nextFloat();
		System.out.println("Digite um n�mero: ");
		f= leia.nextFloat();
		
		x= (c*e - b*f)/(a*e - b*d);
		y= (a*f - c*d)/(a*e - b*d);
		System.out.println("O valor de x �: " + x);
		System.out.println("O valor de y �: " + x);

	}

}
