package br.com.imobiliaria.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corretor {

	@Id
	private Integer creci;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCreci() {
		return creci;
	}

	public void setId(Integer creci) {
		this.creci = creci;
	}

}
