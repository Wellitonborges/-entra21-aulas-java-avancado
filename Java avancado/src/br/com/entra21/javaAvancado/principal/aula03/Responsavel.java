package br.com.entra21.javaAvancado.principal.aula03;


/**
* Um TODO voltado para grupos
* de desenvolvedores, onde pode-se
* especificar a pessoa a quem se destina o item
*/
public @interface Responsavel {
	public enum OrdemPrioridade {
		CRITICO, IMPORTANTE, TRIVIAL, DOCUMENTAR
	};

	OrdemPrioridade ordemPrioridade() ;

	String item();

	String quemAssume();
}