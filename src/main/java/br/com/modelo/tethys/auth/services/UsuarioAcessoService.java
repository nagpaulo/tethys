package br.com.modelo.tethys.auth.services;

import java.util.Calendar;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.modelo.tethys.auth.model.Modulo;
import br.com.modelo.tethys.auth.model.Usuario;
import br.com.modelo.tethys.auth.model.UsuarioAcesso;
import br.com.modelo.tethys.auth.repository.ModuloRepository;
import br.com.modelo.tethys.auth.repository.UsuarioAcessoRepository;
import br.com.modelo.tethys.auth.repository.UsuarioRepository;

@Service
public class UsuarioAcessoService {
	
	@Autowired
	private UsuarioAcessoRepository usuarioAcessoRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	
	@Autowired
    private UsuarioRepository userRepository;
	   
	public void regitrarDateEndLogout(){
		
		ResourceBundle resource = ResourceBundle.getBundle("project");
    	Long moduloId = Long.parseLong(resource.getString("modulo.id"));
    	Modulo modulo = moduloRepository.findOne(moduloId);    	
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	
    	Usuario usuario = userRepository.findByLogin("NAGPAULO");
		UsuarioAcesso access = usuarioAcessoRepository.findByUsuarioAndModulo(usuario, modulo);
		access.setDataInicio(Calendar.getInstance().getTime());
		usuarioAcessoRepository.save(access);
	}  
}
