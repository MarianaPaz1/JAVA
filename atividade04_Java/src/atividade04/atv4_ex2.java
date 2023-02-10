package atividade04;

import java.util.Scanner;

public class atv4_ex2 {

	public static void main(String[] args) {
		
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int i, num, somaPar=0,somaImpar=0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		
//		Função
		for(i=0; i<=11; i++) {
		System.out.println("Digite aqui o valor de número1: ");
		num1 = leia.nextInt();
		System.out.println("Digite aqui o valor de número2: ");
		num2 = leia.nextInt();
		System.out.println("Digite aqui o valor de número3: ");
		num3 = leia.nextInt();
		System.out.println("Digite aqui o valor de número4: ");
		num4 = leia.nextInt();
		System.out.println("Digite aqui o valor de número5: ");
		num5 = leia.nextInt();
		System.out.println("Digite aqui o valor de número6: ");
		num6 = leia.nextInt();
		System.out.println("Digite aqui o valor de número7: ");
		num7 = leia.nextInt();
		System.out.println("Digite aqui o valor de número8: ");
		num8 = leia.nextInt();
		System.out.println("Digite aqui o valor de número9: ");
		num9 = leia.nextInt();
		System.out.println("Digite aqui o valor de número10: ");
		num10 = leia.nextInt();
		
		if(num1%2==0) {
			somaPar+=1;
		}else{
			somaImpar+=1;
		}
		
		if(num2%2==0){
			somaPar+=1;
		}else {
			somaImpar+=1;
		}
	
			
		if(num3%2==0){
			somaPar+=1;
		}else {
			somaImpar+=1;
		}

		if(num4%2==0){
			somaPar+=1;
		}else{
			somaImpar+=1;
		}
		if(num5%2==0){
			somaPar+=1;
		}else{
			somaImpar+=1;
		}
		if(num6%2==0){
			somaPar+=1;
		}else{
			somaImpar+=1;
		}
		if(num7%2==0){
				somaPar+=1;
		}else{
			somaImpar+=1;
		}
			
		if(num8%2==0){
			somaPar+=1;
		}else {
			somaImpar+=1;
		}
		if(num9%2==0){
			somaPar+=1;
		}else {
			somaImpar+=1;
		}
				
		if(num10%2==0){
			somaPar++;
		}else {
			somaImpar+=1;
		}
		
		System.out.println("Temos " +somaPar+ " número(s) par(es)");
		System.out.println("Temos " +somaImpar+ " número(s) ímpar(es)");
		}
	}

}
