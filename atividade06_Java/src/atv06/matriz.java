package atv06;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
public static void main(String[] args) {
	int[][] valor = new int[3][3];
	int linha,coluna, x,somaValor=0;
	int somaNotaAluno =0, mediaNotaAluno=0,nota, aluno=10;
	int[] media = new int[aluno];
	Scanner leia = new Scanner(System.in);
	
	for(linha=0;linha<10;linha++) {
		somaNotaAluno=0;
		for(coluna=0;coluna<4;coluna++) {
			System.out.println("\nEntre com a " +(coluna + 1)+" nota do " + (linha+1)+" aluno: ");
			nota= leia.nextInt();
			somaNotaAluno += nota;
			mediaNotaAluno = somaNotaAluno/4;
			media[linha] = mediaNotaAluno;
		
				}
	}
	
	System.out.println(Arrays.toString(media));
}
}
