package atv06;

import java.util.Scanner;

public class vetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numero, x, auxiliar = -1;
		System.out.println("Digite aqui um número para comparação: ");
		numero = leia.nextInt();

		for (x = 0; x < num.length; x++) {
			if (numero == num[x]) {
				auxiliar = x;

			}
		}
		
		if (auxiliar != -1) {
				System.out.println(numero + " esta na posição " + auxiliar + " do array.");
			} else {
				System.out.println(numero + " não esta na posição do array.");
			}
		}

	}


