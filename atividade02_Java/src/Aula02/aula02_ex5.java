package Aula02;

import java.util.Scanner;

public class aula02_ex5 {

	public static void main(String[] args) {
		
//		Scanner
		Scanner leia = new Scanner(System.in);
		
		
//		Variáveis		
		double nota1, nota2, nota3, media;
//		Função
		System.out.println("Digite aqui a nota 1: ");
		nota1 = leia.nextInt();
		System.out.println("Digite aqui a nota 2: ");
		nota2 = leia.nextInt();
		System.out.println("Digite aqui a nota 3: ");
		nota3 = leia.nextInt();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
		System.out.println("A média é igual a :" + media);
	}

}
