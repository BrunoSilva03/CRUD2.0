package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class INDEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		ArrayList<String> lista = new ArrayList<String>();

		create c = new create();
		read r = new read();
		update u = new update();
		delete d = new delete();

		System.out.println("BEM - VINDO(A)");
		while (opcao != 0) {
			System.out.println("Escolha uma opção: ");
			System.out.println("0 - Fechar o Programa");
			System.out.println("1 - Listar");
			System.out.println("2 - Inserir");
			System.out.println("3 - Excluir");
			System.out.println("4 - Alterar");
			System.out.println("5 - Limpar");
			opcao = sc.nextInt();

			switch (opcao) {

			case 0: {
				System.out.println("Finalizando o Programa");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				System.exit(0);
			}
				break;

			case 1: {
				r.Listar(lista);
			}
				break;

			case 2: {
				c.Inserir(lista);
			}
				break;

			case 3: {
				d.Excluir(lista);
			}
				break;

			case 4: {
				u.Alterar(lista);
			}
				break;

			case 5: {
				if(lista.isEmpty()) {
					System.out.println("A lista já está vazia. Nada a esvaziar");
				} else {
					lista.clear();
					System.out.println("Lista esvaziada com sucesso!!!");
				}
				
			}
				break;

			default: {
				System.out.println("Opção Inválida. Tente novamente!");
			}
				break;

			}
		}

	}

}
