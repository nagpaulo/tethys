package br.com.modelo.tethys.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.modelo.tethys.auth.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
	
}
