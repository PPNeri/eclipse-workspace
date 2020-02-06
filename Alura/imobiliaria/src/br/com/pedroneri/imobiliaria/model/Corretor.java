package br.com.pedroneri.imobiliaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corretor {
	
	@Id
	private String creci;
	private String nome;
	
	
	
	
	
	public Corretor(String creci, String nome) {
		super();
		this.creci = creci;
		this.nome = nome;
	}
	public Corretor() {
		super();
	}
	public String getCreci() {
		return creci;
	}
	public void setCreci(String creci) {
		this.creci = creci;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	

}
