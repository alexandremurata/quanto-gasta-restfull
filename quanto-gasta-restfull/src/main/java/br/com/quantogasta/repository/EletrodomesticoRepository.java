package br.com.quantogasta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quantogasta.domain.Eletrodomestico;

@Repository
public interface EletrodomesticoRepository extends JpaRepository<Eletrodomestico, Long> {

	Eletrodomestico findByNome(final String nome);
}
