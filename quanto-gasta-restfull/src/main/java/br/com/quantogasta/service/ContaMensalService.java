package br.com.quantogasta.service;

import java.util.List;

import br.com.quantogasta.domain.ContaMensal;
import br.com.quantogasta.repository.ContaMensalRepository;

public class ContaMensalService {

	private ContaMensalRepository repository = new ContaMensalRepository();
	
	public List<ContaMensal> findAll() {
		return repository.listAll();
	}
	
	public void save(final ContaMensal contaMensal) {
		
		repository.salvar(contaMensal);
	}
	
	public void delete(final Long id) {
		// TODO: Validação para não remover contasMensal que já são usadas
		repository.delete(id);
	}
}
