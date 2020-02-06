package br.com.imobiliaria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.imobiliaria.dao.DAO;
import br.com.imobiliaria.modelo.Corretor;
import br.com.imobiliaria.modelo.Imovel;

@ManagedBean
@ViewScoped
public class ImovelBean {

	private Imovel imovel = new Imovel();
	private Integer corretorId;

	public Integer getCorretorId() {
		return corretorId;
	}

	public void setCorretorId(Integer corretorId) {
		this.corretorId = corretorId;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public List<Corretor> getCorretores() {
		return new DAO<Corretor>(Corretor.class).listaTodos();

	}

	public void gravar() {

		if (imovel.getCorretor().isEmpty()) {
			throw new RuntimeException("Imovel deve ter pelo menos um Corretor.");
		}

		new DAO<Imovel>(Imovel.class).adiciona(this.imovel);
	}

	public List<Corretor> getCorretoresDoImovel() {

		return this.imovel.getCorretor();

	}

	public void gravarCorretor() {

		Corretor corretor = new DAO<Corretor>(Corretor.class).buscaPorId(this.corretorId);
		this.imovel.addCorretor(corretor);
		System.out.println("Imovel escrito por " + corretor.getNome());
	}

}
