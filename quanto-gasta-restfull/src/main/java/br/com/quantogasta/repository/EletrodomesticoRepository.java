package br.com.quantogasta.repository;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import br.com.quantogasta.domain.Eletrodomestico;


public class EletrodomesticoRepository {

	private final ObjectContainer container;

	public EletrodomesticoRepository() {
		container = Db4oEmbedded.openFile("bd/eletrodomesticos.db4o");
	}
	
	/**
	 * Método responsável por inserir no banco um  {@link Eletrodomestico}
	 * @param eletrodomestico
	 */
	public void salvar(final Eletrodomestico eletrodomestico) {
		container.store(eletrodomestico);
	}
	
	
	
}
