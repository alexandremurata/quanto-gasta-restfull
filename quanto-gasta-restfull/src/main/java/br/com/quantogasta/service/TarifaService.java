package br.com.quantogasta.service;

import java.util.List;

import br.com.quantogasta.domain.Tarifa;
import br.com.quantogasta.repository.TarifaRepository;

public class TarifaService {

	private TarifaRepository repository = new TarifaRepository();
	
	public List<Tarifa> findAll() {
		return repository.listAll();
	}
	
	public void save(final Tarifa tarifa) {
		repository.salvar(tarifa);
	}
	
	public void delete(final Long id) {
		// TODO: Validação para não remover tarifas que já são usadas
		repository.delete(id);
	}
}
