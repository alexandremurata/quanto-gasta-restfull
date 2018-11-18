package br.com.quantogasta.service;

import java.util.List;

import br.com.quantogasta.domain.ConsumoEletro;
import br.com.quantogasta.repository.ConsumoEletroRepository;

public class ConsumoEletroService {

private ConsumoEletroRepository repository = new ConsumoEletroRepository();
	
	public List<ConsumoEletro> findAll() {
		return repository.listAll();
	}
	
	public void save(final ConsumoEletro consumoEletro) {
		repository.salvar(consumoEletro);
	}
	
	public void delete(final Long id) {
		repository.delete(id);
	}
}
