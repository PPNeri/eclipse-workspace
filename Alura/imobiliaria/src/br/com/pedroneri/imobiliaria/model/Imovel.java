package br.com.pedroneri.imobiliaria.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Imovel {

	@Id
	@GeneratedValue
	private Integer id_Imovel;
	private String endereco;
	private String tipo;
	private Double valor;

	@ManyToOne
	private List<Corretor> corretor =new ArrayList<Corretor>();
	
	
	public void addCorretor(Corretor corretor) {
		this.corretor.add(corretor);
	}

	public List<Corretor> getCorretores() {
		return corretor;
	}

	public void setCorretor(List<Corretor> corretor) {
		this.corretor = corretor;
	}

	public Integer getId_Imovel() {
		return id_Imovel;
	}

	public void setId_Imovel(Integer id_Imovel) {
		this.id_Imovel = id_Imovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Imovel() {
		super();
	}

	public Imovel(Integer id_Imovel, String endereco, String tipo, Double valor) {
		super();
		this.id_Imovel = id_Imovel;
		this.endereco = endereco;
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
