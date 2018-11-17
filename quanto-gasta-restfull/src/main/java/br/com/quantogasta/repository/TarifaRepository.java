package br.com.quantogasta.repository;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.quantogasta.domain.Tarifa;

public class TarifaRepository {

	private final ObjectContainer container;

	public TarifaRepository() {
		container = Db4oEmbedded.openFile("bd/tarifas.db4o");
	}

	/**
	 * Método responsável por buscar do banco todas as {@link Tarifa}
	 * 
	 * @return List of {@link Tarifa}
	 */
	public List<Tarifa> listAll() {
		Query query = container.query();
		query.constrain(Tarifa.class);
		return query.execute();
	}

	/**
	 * Método responsável por inserir no banco um {@link Tarifa}
	 * 
	 * @param tarifa to be saved
	 */
	public void salvar(final Tarifa tarifa) {
		container.store(tarifa);
	}
}
