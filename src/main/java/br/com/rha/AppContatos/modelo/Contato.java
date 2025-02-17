package br.com.rha.AppContatos.modelo;


import br.com.rha.AppContatos.Enum.TipoContatoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_contato")
public class Contato {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY	)
	private Long id;
	
	@Column(name="tipoContato",nullable = false)
	private TipoContatoEnum tipoContato;
	
	@Column(name="contato", nullable=true)
	private String contato ;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id", referencedColumnName ="id" )
	private Pessoa pessoa;
	
	public Contato() { }

	public Contato(Long  id,TipoContatoEnum tipoContato, String contato,Pessoa pessoa) {

		this.id = id;
		this.tipoContato = tipoContato;
		this.contato = contato;
		this.pessoa = pessoa;
	}

	public TipoContatoEnum getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContatoEnum tipoContato) {
		this.tipoContato = tipoContato;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}
	
	@Override   //sobrescre o codigo e faz isso
	public String toString() {
		// TODO Auto-generated method stub
		String retorno = "[" + " ID: " + this.id + 
				" - Tipo de Contato: " + this.tipoContato + 
				" - Contato : " + this.contato +
				" - ID da pessoa : " + this.pessoa.getId() +
				" - Nome da pessoa:" + this.pessoa.getNome() + " ]";
		return retorno;
		
		
	}
	
}
