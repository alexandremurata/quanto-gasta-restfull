package br.com.quantogasta.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.quantogasta.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByNome(String nome);
	
	Page<Usuario> findByNomeContainingAllIgnoringCase(@Param("nome") String nome,Pageable pageable);
	
	Usuario findByNomeAllIgnoringCase(@Param("nome") String nome);
}
