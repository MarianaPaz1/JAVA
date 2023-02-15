package atividade_06Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class atv06_ex1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList();
		String cor;
		int x;
		System.out.println("digite aqui a cor no indice: ");
		cor = leia.next();
		cores.add(cor);
		
		for(x = 0;x<3;x++){
			System.out.println("digite aqui a cor no indice " + x + ": ");
			cor = leia.next();
			cores.add(cor);
			}
		System.out.println(cores);
		/*		Scanner leia = new Scanner(System.in);
		String[] cores = new String[5];
		String cor;
		int x;

			for(x = 0;x<cores.length;x++){
				System.out.println("digite aqui a cor no indice " + x + ": ");
				cor = leia.next();
				}
			System.out.println("As cores digitadas foram : ");
			System.out.println(Arrays.toString(cores)); */
	}

}

