package br.com.quantogasta.service;

import java.util.List;

import br.com.quantogasta.domain.Eletrodomestico;
import br.com.quantogasta.repository.EletrodomesticoRepository;

public class EletrodomesticoService {

	private EletrodomesticoRepository repository = new EletrodomesticoRepository();
	
	/**
	 * Método responsavel por retornar Lista de {@link Eletrodomestico}
	 * @return List of {@link Eletrodomestico}
	 */
	public List<Eletrodomestico> findAll() {
		return repository.listAll();
	}
	
	/**
	 * Método responsável por fazer a chamada do save de {@link Eletrodomestico}
	 * @param eletrodomestico	Objeto {@link Eletrodomestico} a ser salvo
	 */
	public void save(final Eletrodomestico eletrodomestico) {
		repository.salvar(eletrodomestico);
	}
	
	/**
	 * Método responsável por fazer a chamada do delete de {@link Eletrodomestico}
	 * @param id	Id do eletrodoméstico a ser deletado
	 */
	public void delete(final Long id) {
		// TODO: Validação para não remover eletrodomesticos que já foram usados
		repository.delete(id);
	}
}
