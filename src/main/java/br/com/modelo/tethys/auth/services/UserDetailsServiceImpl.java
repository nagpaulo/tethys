package br.com.modelo.tethys.auth.services;

import java.util.ArrayList;
import java.util.Calendar;
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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.modelo.tethys.auth.model.Grupo;
import br.com.modelo.tethys.auth.model.Modulo;
import br.com.modelo.tethys.auth.model.Transacao;
import br.com.modelo.tethys.auth.model.Usuario;
import br.com.modelo.tethys.auth.model.UsuarioAcesso;
import br.com.modelo.tethys.auth.repository.ModuloRepository;
import br.com.modelo.tethys.auth.repository.TransacaoRepository;
import br.com.modelo.tethys.auth.repository.UsuarioAcessoRepository;
import br.com.modelo.tethys.auth.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
    private UsuarioRepository userRepository;
	
	@Autowired
	private TransacaoRepository transacaoRepository;
	
	@Autowired
	private UsuarioAcessoRepository usuarioAcessoRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Set<GrantedAuthority> grantedAuthorities = new HashSet<>();    	
    	Usuario user = userRepository.findByLogin(username);
    	List<Transacao> listTransacao = new ArrayList<>();
    	List<Grupo> listGrupo = new ArrayList<>();
    	
    	ResourceBundle resource = ResourceBundle.getBundle("project");
    	Long moduloId = Long.parseLong(resource.getString("modulo.id"));
    	Modulo modulo = moduloRepository.findOne(moduloId);
    	
    	if(!user.getUsuarioGrupo().isEmpty()){
    		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER_AUTH"));
	    	for (Grupo grupo : user.getUsuarioGrupo()) {
	    		if(grupo.getModulo().getId() == moduloId){
	    			listGrupo.add(grupo);
	    			if(grupo.getGrupo().equals(new String("MASTER"))){
						listTransacao = transacaoRepository.findAll();
						listTransacao.forEach(transacao->{
							grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+transacao.getLabel().toUpperCase()));
						});
						
						//Gravar Acesso do Usuario.	    		
				    	GravarAcesso(user, modulo);						
						return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getSenha(), grantedAuthorities);
					}else{
						Set<Transacao> setTransacao = grupo.getGrupoTransacao();
						setTransacao.forEach(transacao->{
							grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+transacao.getLabel().toUpperCase()));
						});
					}
	    		}
			}
	    	
	    	//Gravar Acesso do Usuario.	    		
	    	GravarAcesso(user, modulo);	    		
	    	return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getSenha(), grantedAuthorities);
    	}else{
    		 return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getSenha(), false, false, false, false, grantedAuthorities);
    	}

    }
    
    public void GravarAcesso(Usuario user, Modulo modulo){
    	UsuarioAcesso usuarioAcesso = new UsuarioAcesso();    	
    	List<UsuarioAcesso> listAcessUser = usuarioAcessoRepository.findListByUsuarioAndModulo(user, modulo);
    	
		if(!listAcessUser.isEmpty()){
			usuarioAcesso = listAcessUser.get(0);
		}
    	
    	usuarioAcesso.setModulo(modulo);
		usuarioAcesso.setUsuario(user);
		usuarioAcesso.setDataInicio(Calendar.getInstance().getTime());
		usuarioAcesso.setDataFim(null);
		usuarioAcesso.setIp(null);		
		
		usuarioAcessoRepository.save(usuarioAcesso);
    	
    }
}
 