package atividade03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv3_ex4 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
		String palavra1, palavra2, palavra3;
		System.out.println("Entre com a primeira palavra: ");
		palavra1 = leia.next();
		System.out.println("Entre com a segunda palavra: ");
		palavra2 = leia.next();
		System.out.println("Entre com a terceira palavra: ");
		palavra3 = leia.next();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnívoro")) {
					System.out.println("É uma águia ");
				}else {
					System.out.println("É uma pomba");
				}
			}else{
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um homem");	
				}else {
					System.out.println("É uma vaca");	
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma pulga");	
				}else {
					System.out.println("É uma lagarta");	
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga");
				}else {
					System.out.println("É uma minhoca");
				}
			}
		}

	}

}
