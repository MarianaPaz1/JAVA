package atv06;

import java.util.Scanner;

public class matriz {
public static void main(String[] args) {
	int[][] valor = new int[3][3];
	int linha,coluna, x,somaValor=0, res=0;
	int[] media = new int[10];
	Scanner leia = new Scanner(System.in);
	
	for(linha=0;linha<3;linha++) {
		for(coluna=0;coluna<3;coluna++) {
			System.out.println("\nEntre com uma nota:");
			valor[linha][coluna] = leia.nextInt();
						
		}
		for(x=0; x<valor.length; x++) {
			somaValor += valor[linha][coluna];
			res=somaValor/4;
			media[x]++;
		}
		
	
		System.out.println(res);
	}
	
	}
}

