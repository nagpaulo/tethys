package br.com.modelo.tethys.auth.services;

import static br.com.modelo.tethys.config.constants.SpringConfigurationConstants.PROJECT_CONFIGURATION_FILE_NAME;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.modelo.tethys.auth.model.Grupo;
import br.com.modelo.tethys.auth.model.Transacao;
import br.com.modelo.tethys.auth.model.Usuario;
import br.com.modelo.tethys.auth.repository.TransacaoRepository;
import br.com.modelo.tethys.auth.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
    private UsuarioRepository userRepository;
	
	@Autowired
	private TransacaoRepository transacaoRepository;
	
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Set<GrantedAuthority> grantedAuthorities = new HashSet<>();    	
    	Usuario user = userRepository.findByLogin(username);
    	List<Transacao> listTransacao = new ArrayList<>();   	
    	
    	if(!user.getUsuarioGrupo().isEmpty()){
    		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER_AUTH"));
	    	for (Grupo grupo : user.getUsuarioGrupo()) {
				if(grupo.getGrupo().equals(new String("MASTER"))){
					listTransacao = transacaoRepository.findAll();
					listTransacao.forEach(transacao->{
						grantedAuthorities.add(new SimpleGrantedAuthority("PERM_"+transacao.getNome().toUpperCase()));
					});
				}
			}
    	}else{
    		 return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getSenha(), false, false, false, false, grantedAuthorities);
    	}

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getSenha(), grantedAuthorities);
    }

}
