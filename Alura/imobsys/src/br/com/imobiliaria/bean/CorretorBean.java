package br.com.imobiliaria.bean;

import javax.faces.bean.ManagedBean;

import br.com.imobiliaria.dao.DAO;
import br.com.imobiliaria.modelo.Corretor;

@ManagedBean
public class CorretorBean {

	private Corretor corretor = new Corretor();

	public Corretor getCorretor() {
		return corretor;
	} 

	
	
	public void gravar() {
		
		
		System.out.println("Gravando Corretor " + this.corretor.getNome());
		
		new DAO<Corretor>(Corretor.class).adiciona(this.corretor);
		
		this.corretor=new Corretor();
	}
	
	
}
