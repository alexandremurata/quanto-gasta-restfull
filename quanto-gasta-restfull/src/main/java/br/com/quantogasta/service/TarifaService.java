package br.com.quantogasta.service;

import java.util.List;

import br.com.quantogasta.domain.Tarifa;
import br.com.quantogasta.repository.TarifaRepository;

public class TarifaService {

	private TarifaRepository repository;
	
	public List<Tarifa> findAll() {
		return repository.listAll();
	}
}
