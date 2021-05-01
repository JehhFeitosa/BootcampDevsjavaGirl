package br.com.jessica_feitosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jessica_feitosa.dominio.Livro;
import br.com.jessica_feitosa.servico.LivroService;

@RestController
public class LivroController {

	@Autowired
	private LivroService livroService;

	@PostMapping("/livro")
	public void save(@RequestBody Livro livro) {
		livroService.save(livro);
	}
	
}
