package br.com.entra21.javaAvancado.principal.aula02enuns.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AprenderCollections {
	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte option;

		do {
			System.out.println("");
			System.out.println("Escolha uma das opções:\n");
			System.out.println("0 -Voltar ao menu principal");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindoooo....");
				break;
			case 1:
				aprenderArrayList();
				break;
			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção valida");
				break;
			}

		} while (option != 0);
		System.out.println("Volte sempre que quiser aprender Collection - List ");
	}

	private static void aprenderArrayList() {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Welliton");
		nomes.add("Emerson");
		nomes.add("Barbara");
		nomes.add(0, "Primeiro");
		nomes.add("Rubem");

		System.out.println("Quantos Nomes? " + nomes.size());

		for (String item : nomes) {
			System.out.println("O nome no momento é " + item);
		}
		System.out.println("=-=-=-=-=-=-=");
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " Tem o valor " + nomes.get(nome));

		}
        // seleciona o lugar no índice 0 
        System.out.println("O primeiro nome é " + nomes.get(0));
        System.out.println("O terceiro nome é " + nomes.get(2));
 
        nomes.set(2, "Henrique atualizado");
        System.out.println("O terceiro nome é " + nomes.get(2));
        nomes.set(0, nomes.get(3).toUpperCase());
        System.out.println("O primeiro nome é " + nomes.get(0));
		
        
        System.out.println("Onde será que está o primeiro? "+nomes.indexOf("Rubem"));
        
        System.out.println("Vou deletar quem estiver no indice 2 "+nomes.get(2));
        nomes.remove(2);//removendo o item no indice 2
       nomes.remove( nomes.indexOf("Rubem"));// primeiro localiza a posição que esta o rubem e depois remove a posição que rubem esta
        
System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-");

//criar uma lista de interesses.
// inclua 5 interesses
// Liste todos os interesses.
//dessa lista escolha 2 que são favoritos para mostrar 
// exclua um item por posição e outro por valor.
// um syso para cada ação dessa.


ArrayList<String> frutas = new ArrayList<>();
frutas.add("Maça");
frutas.add("Laranja");
frutas.add("Banana");
frutas.add("Abacate");
frutas.add("Mamão");
System.out.println("A minha Lista frutas é: ");
for (String item : frutas) {
	System.out.println(item);	
}
System.out.println("");
System.out.println("dessa lista os itens "+frutas.get(1)+" e "+frutas.get(2)+" são meus favoritos");
System.out.println("Da minha lista eu vou  remover "+frutas.get(3));
frutas.remove(3);
System.out.println("ainda tenho esses itens na minha lista");
for (String itens : frutas) {
	System.out.println(itens);
}
System.out.println("Vou remover também o Item "+frutas.get(3));
frutas.remove(frutas.indexOf("Mamão"));
System.out.println("Então minha lista de frutas ficou ");
for (String item : frutas) {
	System.out.println(item);
	
}






	}
	private static void aprenderLinkedList() {

	}
}