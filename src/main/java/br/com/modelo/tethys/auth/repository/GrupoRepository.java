package br.com.modelo.tethys.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.modelo.tethys.auth.model.Grupo;
import br.com.modelo.tethys.auth.model.Transacao;

public interface GrupoRepository extends JpaRepository<Grupo, Long>{
	
	List<Transacao> findByGrupoTransacao(Long id);
}
