package br.com.entra21.javaAvancado.principal.aula03;

import java.nio.file.LinkOption;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.entra21.javaAvancado.principal.Main;

public class Aula03 {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte option;

		do {
			System.out.println("");
			System.out.println("0 - Voltar para o menu principal");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			option = input.nextByte();

			switch (option) {
			case -1:
				System.out.println("Saindoo ");
				System.exit(3);// o exit retorna um valor pra quem chamou o progrma.
				break;
			case 0:
				System.out.println("Retornando ao menu principal");

				break;
			case 1:
				AprenderDatas();

				break;
			case 2:

				break;

			default:
				break;
			}

		} while (option != 0);

	}

	private static void AprenderDatas() {
	    Instant inicio = Instant.now();
	    
        System.out.println("Escolha um numero aleatorio, menos esse que voce acabou de pensar");
        long numero = input.nextLong();
 
        Instant fim = Instant.now();
        Duration tempo = Duration.between(inicio, fim);
        System.out.println("Voce demorou " + tempo.toSeconds() + " segundos para escolher o numero " + numero);
        System.out.println("Para datas, levamos " + tempo.toSeconds() + " segundos");

        aprenderDatasHumanizadas();
 
    }
	  @Anotacao
    private static void aprenderDatasHumanizadas() {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate nascimento =  LocalDate.of(1991, 12, 15);
        System.out.println(nascimento);

        LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
        System.out.println("Essa quinta é igual a " + essaQuinta);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(hoje));        
        System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));
        
        
        
        Period vida = Period.between(nascimento, hoje);
        System.out.println("Durante minha vida ja gastei "+vida.getYears()+" Anos "+vida.getMonths()+" Meses e "+vida.getDays()+" Dias");
        
    

        LocalTime lanche = LocalTime.of(20, 10);
        LocalTime finalAula03 = LocalTime.of(22, 15);
        LocalTime avaliacao = LocalTime.of(22, 0);
 
        System.out.println("Fomos lanchar as: " + lanche + " Vamos avaliar a aula as " + avaliacao
                + " temos que aprender tudo até " + finalAula03);

        
        
      
        
        
        

    }
}