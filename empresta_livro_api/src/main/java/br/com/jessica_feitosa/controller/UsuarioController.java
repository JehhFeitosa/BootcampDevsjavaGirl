package br.com.jessica_feitosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jessica_feitosa.dominio.Usuario;
import br.com.jessica_feitosa.servico.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/usuario")
	public void save(@RequestBody Usuario usuario){
	    usuarioService.salvaUsuario(usuario);
	}

}
