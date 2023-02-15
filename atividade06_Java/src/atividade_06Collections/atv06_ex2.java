package atividade_06Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class atv06_ex2 {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	Set<Integer> setzinho = new HashSet<Integer>();
	int number, number1=0;
	System.out.println("digite aqui um número inteiro: ");
	number= leia.nextInt();
	setzinho.add(number);
	
	for(int x = 0;x<102;x++){
		System.out.println("digite aqui a cor no indice " + x + ": ");
		number= leia.nextInt();
		setzinho.add(number);
		}
	Iterator<Integer> iMeuSet = setzinho.iterator();
	System.out.println("digite aqui um número para comparação: ");
	number1= leia.nextInt();
		if(number1==setzinho.size()) {
			System.out.println("Número encontrado");
		}else {
		 System.out.println(number1 +"ERRO - não consta no array.");
		}
}
}

