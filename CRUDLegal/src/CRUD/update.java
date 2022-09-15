package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class update {

	public void Alterar(ArrayList<String> lista) {
		update u = new update();
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia atualmente. Nenhum elemento a ser alterado.");
		} else {
			Scanner sc = new Scanner(System.in);
			String antigoElement = new String();
			String novoElement = new String();
			
			System.out.println("Informe o elemento a ser alterado na lista: "); 
			antigoElement = sc.nextLine();
			
			if(lista.contains(antigoElement)) {
				System.out.println("Informe o novo elemento que irá substituir " + antigoElement + " na lista: ");
				novoElement = sc.nextLine();
				
				for(int i = 0; i < lista.size(); i++) {
					if(lista.get(i).equals(antigoElement)) {
						lista.set(i, novoElement);
						System.out.println(antigoElement + " alterado para " + novoElement + " com Sucesso!!!");
					}
				}
			} else {
				System.out.println(antigoElement + " não existe na lista! Tente informar outro elemento");
				u.Alterar(lista);
			}
		}
	}
}
