package atividade03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv3_ex4 {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
//		Variáveis		
//		List listaVertebrado = new ArrayList();
//		List listaInvertebrado = new ArrayList();
		String verificar;
		
//		listaVertebrado.add("Ave");
//		listaVertebrado.add("Mamífero");
//		listaInvertebrado.add("Inseto");
		
//		Função
//		System.out.println("Lista de Vertebrados: " + listaVertebrado);
//		System.out.println("Lista de Invertebrados: " + listaInvertebrado);
		System.out.println("Digite aqui: ");
		verificar = leia.next();
		
		
		if(verificar == "ave") {
			System.out.println("O" + verificar + "Faz parte da lista de Vertebrados.");
		}else if(verificar != verificar) {
			System.out.println("O" + verificar + "Faz parte da lista de Invertebrados.");
		}

	}

}
