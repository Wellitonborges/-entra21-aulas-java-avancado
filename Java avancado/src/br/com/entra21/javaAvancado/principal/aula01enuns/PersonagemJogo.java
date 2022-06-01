package br.com.entra21.javaAvancado.principal.aula01enuns;

public enum PersonagemJogo {

	BARBARO(1000, "Muito HP"), // Barbaro
	ANAO(100, "Ferreiro"), // Anao
	DRUIDA(50, "Supoporte"), // Sacerdote

	SACERDOTE(10, "Cura e Corre"), // Sacerdote
	MAGO(20, "Tem Poder de Ataques Magicos"); // Apelão

	private final int VIDA;
	private final String DESCRICAO;

	private PersonagemJogo(int vida, String descricao) {
		this.VIDA = vida;
		this.DESCRICAO = descricao;
	}

	public int getVIDA() {
		return VIDA;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}
	public String getDetails() {
		return "Veja a Discrição completa do "+PersonagemJogo.MAGO+" Sua vida é "+VIDA+" E sua discrição é "+DESCRICAO;
	}

}
