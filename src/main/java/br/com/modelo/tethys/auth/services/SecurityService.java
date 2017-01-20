package br.com.modelo.tethys.auth.services;

public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
    
}
