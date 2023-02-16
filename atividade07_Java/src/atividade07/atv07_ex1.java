package atividade07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atv07_ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		String client, a;
		Queue<String> fila = new LinkedList<String>();
		do {
			System.out.println("\n-------------------------------------------------");
			System.out.println("\n(1) Adicionar Cliente na Fila");
			System.out.println("\n(2) Listar todos os Clientes");
			System.out.println("\n(3) Retirar Cliente da Fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n-------------------------------------------------");
			System.out.println("\nPor favor, digite a opção: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nAdicione o nome do cliente: ");
				client=leia.next();
				fila.add(client);
				break;
			case 2:
				a= fila.peek();
				//System.out.println(a);
				if(a!=null) {
					System.out.println("Estão nas filas os Clientes: " + fila);
				}else {
					System.out.println("Esta fila está vazia! " +a);
				} 
				
				break;
			case 3:
				System.out.println("\nChegou a sua vez! Você sairá da fila." +fila.remove());
				System.out.println("\nFila atualizada: " +fila);
				break;
			case 0:
				System.out.println("\nVocê acaba de sair, obrigada por utilizar o sistema!!!");
				break;
			default:
				System.out.println("\nOpção inválida!!!");
			}

		} while (opcao != 0);
	}

}
