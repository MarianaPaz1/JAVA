package atividade07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class atv07_ex3 {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int opcao;
	String livro;
	boolean a;
	Stack<String> pilha = new Stack<String>();
	do {
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n(1) Adicionar Livro na Pilha");
		System.out.println("\n(2) Listar todos os Livros");
		System.out.println("\n(3) Retirar Livro da Pilha ");
		System.out.println("\n(0) Sair");
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nPor favor, digite a opção desejada: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\nAdicione o Livro na pilha: ");
			livro=leia.next();
			pilha.push(livro);
			break;
		case 2:
			a=pilha.empty();
			System.out.println(pilha);
			if(a!=true) {
				System.out.println("Esses livros estão na pilha: " + pilha );
			}else {
				System.out.println("Esta pilha está vazia! " );
			} 
			
			break;
		case 3:
			System.out.println("\nAté o momento a pilha é: " + pilha );
			System.out.println(pilha.pop() + " será removido da pilha." );
			System.out.println("\nPilha atualizada: " + pilha );
			break;
		case 0:
			System.out.println("\nVocê acaba de sair, obrigada por utilizar a biblioteca!!!");
			break;
		default:
			System.out.println("\nOpção inválida!!!");
		}

	} while (opcao != 0);
}
}
