package br.com.rha.AppContatos.modelo;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_pessoa")
public class Pessoa {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY	)
	private Long id;
	
	@Column(name="nome",nullable = false,length=150)
	private String nome;
	
	@Column(name="endereco", nullable=true, length=200)
	private  String endereco;
	
	@Column(name="cep", nullable=true, length=9)//ppodemos colocar outras como name=""
	private  Integer CEP;
	
	@Column(name="cidade", nullable=true, length=200)//ppodemos colocar outras como name=""
	private   String Cidade;
	
	@Column(name="uf", nullable=true, length=2)//ppodemos colocar outras como name=""
	private   String UF;
	
	public Pessoa() { }

	public Pessoa(Long  id,String nome, String endereco, Integer CEP, String Cidade ,String UF) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.CEP = CEP;
		this.Cidade = Cidade;
		this.UF = UF;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setendereco(String endereço) {
		endereco = endereço;
	}

	public Integer getCEP() {
		return CEP;
	}

	public void setCEP(Integer cEP) {
		CEP = cEP;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getUF(){
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public Long getId() {
		return id;
	}

	@Override   
	public String toString() {
		
		String retorno = "[" + " Nome: " + this.nome +
				" - Endereço: " + this.endereco + 
				" - CEP: " + this.CEP + 
				" - Cidade: " + this.Cidade +
				" - UF: " + this.UF +
				" ]";
		return retorno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CEP, Cidade, endereco, UF, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(CEP, other.CEP) && Objects.equals(Cidade, other.Cidade)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(UF, other.UF)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
}
