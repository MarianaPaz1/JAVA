package atividade04;

import java.util.Scanner;

public class atv4_ex2 {

	public static void main(String[] args) {
		
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Vari�veis		
		int i, num, somaPar=0,somaImpar=0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		
//		Fun��o
		for(i=0; i<=11; i++) {
		System.out.println("Digite aqui o valor de n�mero1: ");
		num1 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero2: ");
		num2 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero3: ");
		num3 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero4: ");
		num4 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero5: ");
		num5 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero6: ");
		num6 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero7: ");
		num7 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero8: ");
		num8 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero9: ");
		num9 = leia.nextInt();
		System.out.println("Digite aqui o valor de n�mero10: ");
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
		
		System.out.println("Temos " +somaPar+ " n�mero(s) par(es)");
		System.out.println("Temos " +somaImpar+ " n�mero(s) �mpar(es)");
		}
	}

}
