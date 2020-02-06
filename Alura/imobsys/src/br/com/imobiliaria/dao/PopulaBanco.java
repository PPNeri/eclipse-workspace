package br.com.imobiliaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;

import br.com.imobiliaria.modelo.Corretor;
import br.com.imobiliaria.modelo.Imovel;

public class PopulaBanco {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		Corretor assis = geraCorretor("Machado de Assis");
		em.persist(assis);

		Corretor amado = geraCorretor("Jorge Amado");
		em.persist(amado);

		Corretor coelho = geraCorretor("Paulo Coelho");
		em.persist(coelho);

		Imovel A = geraImovel("Campos", "casa",24.90, assis);
		Imovel B = geraImovel("Koeller", "apartamento", 19.90,amado);
		Imovel C = geraImovel("Koeller", "apartamento", 19.90,coelho);

		em.persist(A);
		em.persist(B);
		em.persist(C);

		Imovel D = geraImovel("Samanbaia", "casa",24.90, assis);
		Imovel E = geraImovel("Koeller", "apartamento", 19.90,amado);
		Imovel F = geraImovel("Quitandinha", "apartamento", 19.90,coelho);
		Imovel G = geraImovel("Itaipava", "apartamento", 19.90,coelho);

		em.persist(D);
		em.persist(E);
		em.persist(F);
		em.persist(G);


		em.getTransaction().commit();
		em.close();

	}

	private static Corretor geraCorretor(String nome) {
		Corretor corretor = new Corretor();
		corretor.setNome(nome);
		return corretor;
	}

	private static Imovel geraImovel(String endereco, String tipo, double valor, Corretor corretor) {
		Imovel imovel = new Imovel();
		imovel.setEndereco(endereco);
		imovel.setTipo(tipo);
		imovel.setValor(valor);
		imovel.addCorretor(corretor);
		return imovel;
	}

	
	 @SuppressWarnings("unused") private static Calendar parseData(String data) {
	 try { Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data); Calendar
	 calendar = Calendar.getInstance(); calendar.setTime(date); return calendar; }
	 catch (ParseException e) { throw new IllegalArgumentException(e); } }
	 
	

}
