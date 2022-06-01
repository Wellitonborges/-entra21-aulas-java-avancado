package br.com.entra21.javaAvancado.principal;

import java.util.Scanner;

import br.com.entra21.javaAvancado.principal.aula01enuns.PersonagemJogo;

public class Main {

	static Scanner input = new Scanner(System.in);
	
	public enum DiasSemana{
		SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA,SABADO,DOMINGO;
	}

	public static void main(String[] args) {
		byte option;

		do {
			System.out.println(exibirMenu());
			option = input.nextByte();
		
		switch (option) {
		case 0:
			System.out.println("Saindoo...");
			break;
		case 1:
			aprendendoWrapper();
			break;
		case 2:
			aprenderENUM();
			break;

		default:
			System.out.println("Opção invalida");
			System.out.println("Escolha uma opção valida Por favor");
			break;
		}
		} while (option != 0);

	}


	private static String exibirMenu() {
		System.out.println("");
		String menu = "Vamos aprender sobre convceitos avançado em Java";
		menu += "\n0 - Sair";
		menu += "\n1 - Wrapper";
		menu += "\n2 - ENUM";
		menu += "\nEscolha uma das Opções";

		return menu;
	}

	private static void aprendendoWrapper() {
		System.out.println("Olhar com Debug");

		char letra = Character.valueOf('W');
		boolean verdade = Boolean.parseBoolean("True");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("tre");
		boolean falso = Boolean.parseBoolean("t");

		byte interiro1 = Byte.parseByte("127");
		short inteiro2 = Short.parseShort("128");
		int inteiro3 = Integer.parseInt("10000");
		long inteiro4 = Long.parseLong("1000000");
		
		float decimal1 = Float.parseFloat("10.1");
		double decimal2 = Double.parseDouble("101000.5555");
	}

	private static void aprenderENUM() {
		System.out.println("Testando ENUM "+DiasSemana.TERCA);
		Boolean hoje = DiasSemana.DOMINGO ==DiasSemana.SEGUNDA;
		System.out.println(hoje ?"Sim":"não");
		
		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia+1)+" "+DiasSemana.values()[dia]);
			
		}
		System.out.println("Gosto desse tipo de personagem :"+PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe "+PersonagemJogo.ANAO+" Tem HP "+PersonagemJogo.ANAO.getVIDA());
		System.out.println("Veja a caracteristica mais comun de "+PersonagemJogo.ANAO.getDESCRICAO());
		System.out.println("Veja a Discrição completa do "+PersonagemJogo.MAGO+" Sua vida é "+PersonagemJogo.MAGO.getVIDA()+" E sua discrição é "+PersonagemJogo.MAGO.getDESCRICAO());
		
		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			System.out.println("Contador = "+personagem+ " Posição do Enum = "+PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem "+PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getVIDA());
			System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			
		}
		
		
		
	}
}
