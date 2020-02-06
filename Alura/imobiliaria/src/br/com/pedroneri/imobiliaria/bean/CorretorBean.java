package br.com.pedroneri.imobiliaria.bean;

import javax.faces.bean.ManagedBean;

import br.com.pedroneri.imobiliaria.dao.DAO;
import br.com.pedroneri.imobiliaria.model.Corretor;

@ManagedBean
public class CorretorBean {

	Corretor corretor = new Corretor();

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}
	
	public void cadastrarCorretor() {
		
System.out.println("Gravando corretor " + this.corretor.getNome());
		

		new DAO<Corretor>(Corretor.class).adiciona(corretor);
		
		this.corretor=new Corretor();
	}
	

}
