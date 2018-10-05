package br.com.quantogasta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quantogasta.domain.Tarifa;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa,Long> {

}
