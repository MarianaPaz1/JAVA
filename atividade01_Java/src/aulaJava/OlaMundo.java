package aulaJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Float valor = 15.1f, salario,bonificacao,novoSalario;
		Scanner leia = new Scanner(System.in);
//Atividade 01
		System.out.println("***ATIVIDADE 01 ****");
		System.out.println("\nSeja bem vindo ao portal do RH, digite abaixo o sal�rio do empregado: ");
		salario = leia.nextFloat();
		System.out.println("\n o sal�rio digitado foi de R$: " +salario);
		System.out.println("\n Agora digite aqui o Abono: ");
		bonificacao = leia.nextFloat();
		novoSalario = salario+bonificacao;
		System.out.printf("\nO novo sal�rio � %.2f", novoSalario);
		System.out.println("\nAtualiza��o salva com sucesso, obrigada por utilizar o sistema.");
		
		
//Atividade 02
		System.out.println("***ATIVIDADE 02 ****");
		float escola = 1,nota1, nota2, nota3,nota4, media;
		
		System.out.println("\n Nota 01: ");
		nota1 = leia.nextFloat();
		System.out.println("\n Nota 02: ");
		nota2 = leia.nextFloat();
		System.out.println("\n Nota 03: ");
		nota3 = leia.nextFloat();
		System.out.println("\n Nota 04: ");
		nota4 = leia.nextFloat();
		media = (nota1 + nota2 + nota3+ nota4) / 4;

		System.out.printf("\nA m�dia do aluno �: %.1f" , media);
		
//Atividade 03
		System.out.println("***ATIVIDADE 03 ****");
		String nome = "Mariana Paz";
		float trampo = 1, salarioB, adcNoturno, hE, descontos, salarioL;
		System.out.println("***Digite aqui o nome do funcion�rio: ****");
		nome = leia.next();
		System.out.println("\n Digite o sal�rio Bruto: ");
		salarioB = leia.nextFloat();
		System.out.println("\n Digite o Adicional Noturno: ");
		adcNoturno = leia.nextFloat();
		System.out.println("\n Digite as Horas Extras: ");
		hE = leia.nextFloat();
		System.out.println("\n Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		salarioL= salarioB+adcNoturno+ (hE*5) - descontos;
		System.out.printf("\nO sal�rio l�quido do %s � : %.2f" , nome, salarioL);
		
//Atividade 04
		System.out.println("***ATIVIDADE 04 ****");	
		int num = 1, n1, n2,n3,n4, calc;
		n1 = 5;
		n2 = 6;
		n3 = 7;
		n4 = 8;
		calc=(n1*n2) -(n3*n4);
		System.out.println(calc);
		n1 = 5;
		n2 = 6;
		n3 = -7;
		n4 = 8;
		calc=(n1*n2) -(n3*n4);
		System.out.println(calc);
	}

}
