package Aula02;

import java.util.Scanner;

public class aula02_ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
//		Variáveis	
		int tempo,shoras,sminutos,segundos;
		segundos = 1;
		System.out.println("Quantos segundos o evento durou: ");
		tempo = leia.nextInt();
		shoras = tempo/3600;
		System.out.println("O evento durou: " + shoras + " horas");
		sminutos = (tempo/3600)% 60;
		System.out.println("O evento durou: " + sminutos + " minutos");
        segundos = (tempo%3600)% 60;
		System.out.println("O evento durou: " + segundos + " segundos");
	}

}
