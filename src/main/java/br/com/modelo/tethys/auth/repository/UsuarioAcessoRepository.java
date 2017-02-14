package br.com.modelo.tethys.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.com.modelo.tethys.auth.model.Modulo;
import br.com.modelo.tethys.auth.model.Usuario;
import br.com.modelo.tethys.auth.model.UsuarioAcesso;

public interface UsuarioAcessoRepository extends JpaRepository<UsuarioAcesso, Long>{
	
	UsuarioAcesso findByUsuario(Usuario user);
	List<UsuarioAcesso> findListByUsuarioAndModulo(Usuario user, Modulo modulo);
	UsuarioAcesso findByUsuarioAndModulo(Usuario user, Modulo modulo);
	
	@Modifying
	@Transactional
	@Query("delete from UsuarioAcesso ua where ua.usuario = ? and ua.modulo = ? ")
	void deleteUsersAccess(Usuario user, Modulo modulo);
}
