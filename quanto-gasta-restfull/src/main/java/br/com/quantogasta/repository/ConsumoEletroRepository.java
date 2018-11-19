package br.com.quantogasta.repository;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.quantogasta.domain.ConsumoEletro;

public class ConsumoEletroRepository {

	private final ObjectContainer container;
	
	public ConsumoEletroRepository() {
		container = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/consumoEletros.db4o");
	}
	
	/**
	 * Método responsável por buscar do banco todas as {@link ConsumoEletro}
	 * 
	 * @return List of {@link ConsumoEletro}
	 */
	public List<ConsumoEletro> listAll() {
		Query query = container.query();
		query.constrain(ConsumoEletro.class);
		return query.execute();
	}

	/**
	 * Método responsável por inserir no banco uma {@link ConsumoEletro}
	 * 
	 * @param consumoEletro to be saved
	 */
	public void salvar(final ConsumoEletro consumoEletro) {
		container.store(consumoEletro);
	}
	
	/**
	 * Método responsável por deletar do banco uma {@link ConsumoEletro}
	 * @param id	consumoEletro's id to be deleted
	 */
	public void delete(final Long id) {
		Query query = container.query();
		query.constrain(ConsumoEletro.class);
		List<ConsumoEletro> consumoEletros = query.execute();
		
		for (ConsumoEletro consumoEletro : consumoEletros) {
			if(consumoEletro.getId().equals(id)) {
				container.delete(consumoEletro);
				container.commit();
				break;
			}
		}
	}
}
