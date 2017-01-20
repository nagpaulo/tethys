package br.com.modelo.tethys.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.modelo.tethys.auth.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByLogin(String login);
}
