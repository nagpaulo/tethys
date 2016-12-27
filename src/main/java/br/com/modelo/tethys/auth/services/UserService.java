package br.com.modelo.tethys.auth.services;

import br.com.modelo.tethys.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
