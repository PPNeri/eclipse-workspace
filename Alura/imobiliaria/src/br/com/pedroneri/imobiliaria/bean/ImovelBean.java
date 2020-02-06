package br.com.pedroneri.imobiliaria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.pedroneri.imobiliaria.dao.DAO;
import br.com.pedroneri.imobiliaria.model.Corretor;
import br.com.pedroneri.imobiliaria.model.Imovel;

@ManagedBean
@ViewScoped
public class ImovelBean {

	private Imovel imovel = new Imovel();
	private Integer corretorId;

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Integer getCorretorId() {
		return corretorId;
	}

	public void setCorretorId(Integer corretorId) {
		this.corretorId = corretorId;
	}

	public List<Corretor> listaDeCorretores() {
		return new DAO<Corretor>(Corretor.class).listaTodos();

	}

	public void cadastrarImovel() {

		if (imovel.getCorretores().isEmpty()) {
			throw new RuntimeException("Imovel deve ter 1 Corretor");
		}

		new DAO<Imovel>(Imovel.class).adiciona(this.imovel);
	}

	public List<Corretor> getCorretoresDoImovel() {

		return this.imovel.getCorretores();

	}

	public void gravarCorretor() {

		Corretor corretor = new DAO<Corretor>(Corretor.class).buscaPorId(this.corretorId);
		this.imovel.addCorretor(corretor);
		System.out.println("Imovel cadastrado por : " + corretor.getNome());
	}

}
