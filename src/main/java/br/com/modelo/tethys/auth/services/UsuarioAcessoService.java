package br.com.modelo.tethys.auth.services;

import java.util.Calendar;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import br.com.modelo.tethys.auth.model.Modulo;
import br.com.modelo.tethys.auth.model.Usuario;
import br.com.modelo.tethys.auth.model.UsuarioAcesso;
import br.com.modelo.tethys.auth.repository.ModuloRepository;
import br.com.modelo.tethys.auth.repository.UsuarioAcessoRepository;

@Service
public class UsuarioAcessoService {
	
	@Autowired
	private UsuarioAcessoRepository usuarioAcessoRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	   
	public void regitrarDateEndLogout(){
		
		ResourceBundle resource = ResourceBundle.getBundle("project");
    	Long moduloId = Long.parseLong(resource.getString("modulo.id"));
    	Modulo modulo = moduloRepository.findOne(moduloId);
		
		Usuario user = new Usuario();
		UsuarioAcesso access = usuarioAcessoRepository.findByUsuarioAndModulo(user, modulo);
		access.setDataInicio(Calendar.getInstance().getTime());
		//usuarioAcessoRepository.save(access);
	}  
}
