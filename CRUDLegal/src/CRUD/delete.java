package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {

	public void Excluir(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			System.out.println("Atualmente a lista encontra-se vazia. Nenhum elemento a ser exclu�do!");
		} else {
			Scanner sc = new Scanner(System.in);
			String antigoElement;
			System.out.println("Informe o elemento a ser exclu�do da lista: ");
			antigoElement = sc.nextLine();
			
			if(lista.contains(antigoElement)) {
				lista.remove(antigoElement);
				System.out.println(antigoElement + " removido da lista com Sucesso!!!");
			} else {
				System.out.println(antigoElement + " N�o existe na lista.");
			}
		}
	}
}
