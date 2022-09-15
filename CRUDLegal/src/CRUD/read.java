package CRUD;

import java.util.ArrayList;

public class read {

	public void Listar(ArrayList<String> lista) {
		if (lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia atualmente");
		} else {
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		}

	}

}
