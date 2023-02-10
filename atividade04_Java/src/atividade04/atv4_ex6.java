package atividade04;

import java.util.Scanner;

public class atv4_ex6 {

	public static void main(String[] args) {
//			Scanner
			Scanner leia = new Scanner(System.in);
//			Variáveis		
			int num, quant =-1, media=0, media1=0;
	
//			Função

			do {
				System.out.println("Digite o número: ");
				num = leia.nextInt();
				
				if(num%3==0 && num!=0) {
					media1+=num;
					quant++;
				}
				
			}while(num!=0);
			media = media1/quant;
			System.out.println("A média é: "+ media);
	}

}
