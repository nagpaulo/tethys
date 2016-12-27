package br.com.modelo.tethys.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.modelo.tethys.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
