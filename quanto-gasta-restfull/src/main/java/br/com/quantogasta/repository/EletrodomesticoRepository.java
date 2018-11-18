package br.com.quantogasta.repository;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.quantogasta.domain.Eletrodomestico;


public class EletrodomesticoRepository {

	private final ObjectContainer container;

	public EletrodomesticoRepository() {
		container = Db4oEmbedded.openFile("bd/eletrodomesticos.db4o");
	}
	
	/**
	 * Método responsável por buscar do banco todas os {@link Eletrodomestico}
	 * 
	 * @return List of {@link Eletrodomestico}
	 */
	public List<Eletrodomestico> listAll() {
		Query query = container.query();
		query.constrain(Eletrodomestico.class);
		return query.execute();
	}
	
	/**
	 * Método responsável por inserir no banco um  {@link Eletrodomestico}
	 * @param eletrodomestico
	 */
	public void salvar(final Eletrodomestico eletrodomestico) {
		container.store(eletrodomestico);
	}
	
	/**
	 * Método responsável por deletar do banco um {@link Eletrodomestico}
	 * @param id	eletrodomestico's id to be deleted
	 */
	public void delete(final Long id) {
		Query query = container.query();
		query.constrain(Eletrodomestico.class);
		List<Eletrodomestico> eletrodomesticos = query.execute();
		
		for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			if(eletrodomestico.getId().equals(id)) {
				container.delete(eletrodomestico);
				container.commit();
				break;
			}
		}
	}
}
