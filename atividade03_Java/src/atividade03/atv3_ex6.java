package atividade03;

import java.util.Scanner;

public class atv3_ex6 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
		
//		Variável
		int codigo;
		float salario, novoSalario,reajuste;
		String nome;
		
//		Função
		System.out.println("\n\t\tEmpresa Generation");
		System.out.println("\nCód    Cargo     Percentual");
		System.out.println("\n 1- Gerente     Reajuste 10%");
		System.out.println("\n 2- Vendedor    Reajuste 7%");
		System.out.println("\n 3- Supervisor  Reajuste 9%");
		System.out.println("\n 4- Motorista   Reajuste 6%");
		System.out.println("\n 5- Estoquista  Reajuste 5%");
		System.out.println("\n 6- Técnico TI  Reajuste 8%");
	
		System.out.println("\n Digite o nome do colaborador:");
		nome= leia.next();
		System.out.println("\nDigite o código do colaborador:");
		codigo= leia.nextInt();
		System.out.println("\nDigite o salário do colaborador:");
		salario= leia.nextFloat();
	
		
		
		
		
switch(codigo) {
		
		case 1:
			reajuste = 10;
			novoSalario = (salario/100)*reajuste + salario;
			System.out.println("\nO novo salário do "+ nome + " é R$" + novoSalario);
		break;
		case 2:
			reajuste = 7;
			novoSalario = (salario/100)*reajuste+ salario;
			System.out.println("\nO novo salário do "+ nome + " é R$" + novoSalario);
		break;
		case 3:
			reajuste = 9;
			novoSalario = (salario/100)*reajuste + salario;
			System.out.println("\nO novo salário do "+ nome + " é R$" + novoSalario);
		break;
		case 4:
			reajuste = 6;
			novoSalario = (salario/100)*reajuste+ salario;
			System.out.println("\nO novo salário do "+ nome + " é R$" + novoSalario);
		break;
		case 5:
			reajuste = 5;
			novoSalario = (salario/100)*reajuste+ salario;
			System.out.println("\nO novo salário do "+ nome + " é R$" + novoSalario);
		break;
		case 6:
			reajuste = 8;
			novoSalario = (salario/100)*reajuste+ salario;
			System.out.println("\nO novo salário do "+ nome + " é R$" + novoSalario);
		break;
		default:
			System.out.println("\nOpção Inválida!!!");
}

		
		
	}

}
