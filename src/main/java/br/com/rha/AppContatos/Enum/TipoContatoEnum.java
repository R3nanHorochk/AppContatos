package br.com.rha.AppContatos.Enum;

public enum TipoContatoEnum {
	TELEFONE(0),
	EMAIL(1),
	DISCORD(2),
	TEAMS(3),
	INSTAGRAM(4);
	
	public final int tipoValor;

	TipoContatoEnum(int tipoValor) {
		this.tipoValor = tipoValor;
		
	}

	public int getTipoValor() {
		return tipoValor;
	}
	
	
}
