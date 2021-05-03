package br.com.jessica_feitosa.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jessica_feitosa.dominio.Usuario;
import br.com.jessica_feitosa.respositorio.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void salvaUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

}
