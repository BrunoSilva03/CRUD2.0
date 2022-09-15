package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class create {

	public void Inserir(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String novoElement = new String();
		System.out.println("Digite o elemento a ser inserido na lista: ");
		novoElement = sc.nextLine();
		create c = new create();
		
		if(lista.contains(novoElement)) {
			char opcao;
			System.out.println("A lista já contêm " + novoElement + ", quer adicionar mais um " + novoElement + " na lista? Digite S para Sim ou N para Não");
			opcao = sc.next().charAt(0);
			
			if(opcao != 'S' && opcao != 's' && opcao != 'N' && opcao != 'n') {
				while(opcao != 'S' && opcao != 's' && opcao != 'N' && opcao != 'n') {
					System.out.println("Opção Inválida. Tente novamente:");
					System.out.println("A lista já contêm " + novoElement + ", quer adicionar mais um " + novoElement + " na lista? Digite S para Sim ou N para Não");
					opcao = sc.next().charAt(0);
				}
			}
			
			if(opcao == 's' || opcao == 'S') {
				lista.add(novoElement);
				System.out.println(novoElement + " adicionado a lista com Sucesso!!!");
			}
			
			if(opcao == 'n' || opcao == 'N') {
				System.out.println("Ok. Tente adicionar um elemento que ainda não está na lista!");
				c.Inserir(lista);
			}
		} else {
			lista.add(novoElement);
			System.out.println(novoElement + " adicionado a lista com Sucesso!!!");
		}
	}
}
