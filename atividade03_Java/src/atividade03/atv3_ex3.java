package atividade03;

import java.util.Scanner;

public class atv3_ex3 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
		int idade;
		boolean doacao = true;
		String nome;
		
//		Função
		System.out.println("Nome do doador(a): ");
		nome = leia.next();	
		System.out.println("Idade do doador(a): ");
		idade = leia.nextInt();
//		System.out.println("Já é doador(a)? ");
//		doacao= leia.hasNext();

		if(idade<18 && idade>=70) {
			System.out.println(" O Paciente" + nome + "não está apto para doar sangue");
			}else if(idade>= 18 && idade<=59) {
			System.out.println(" O Paciente" + nome + " está apto para doar sangue ");
			}else if(idade>=60 && idade<=69 && doacao==true) {
			System.out.println(" O Paciente" + nome + "está apto para doar sangue ");
			}else {
				System.out.println("O paciente não pode doar ");
			}
		
		
		
		
		
	}

}
