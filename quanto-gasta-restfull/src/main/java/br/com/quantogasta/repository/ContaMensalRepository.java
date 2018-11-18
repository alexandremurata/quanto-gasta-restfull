package br.com.quantogasta.repository;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.quantogasta.domain.ContaMensal;

public class ContaMensalRepository {

	private final ObjectContainer container;
	
	public ContaMensalRepository() {
		container = Db4oEmbedded.openFile("bd/contasMensal.db4o");
	}
	
	/**
	 * Método responsável por buscar do banco todas as {@link ContaMensal}
	 * 
	 * @return List of {@link ContaMensal}
	 */
	public List<ContaMensal> listAll() {
		Query query = container.query();
		query.constrain(ContaMensal.class);
		return query.execute();
	}

	/**
	 * Método responsável por inserir no banco uma {@link ContaMensal}
	 * 
	 * @param contaMensal to be saved
	 */
	public void salvar(final ContaMensal contaMensal) {
		container.store(contaMensal);
	}
	
	/**
	 * Método responsável por deletar do banco uma {@link ContaMensal}
	 * @param id	contaMensal's id to be deleted
	 */
	public void delete(final Long id) {
		Query query = container.query();
		query.constrain(ContaMensal.class);
		List<ContaMensal> contasMensal = query.execute();
		
		for (ContaMensal contaMensal : contasMensal) {
			if(contaMensal.getId().equals(id)) {
				container.delete(contaMensal);
				container.commit();
				break;
			}
		}
	}
}
