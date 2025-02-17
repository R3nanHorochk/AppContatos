package br.com.rha.AppContatos.Enum;

public enum TipoContatoEnum {
	TELEFONE(1),
	EMAIL(2),
	DISCORD(3),
	TEAMS(4),
	INSTAGRAM(5);
	
	public final int tipoValor;

	TipoContatoEnum(int tipoValor) {
		this.tipoValor = tipoValor;
		
	}

	public int getTipoValor() {
		return tipoValor;
	}
	
	
}
