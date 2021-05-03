package br.com.jessica_feitosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jessica_feitosa.dominio.Emprestimo;
import br.com.jessica_feitosa.servico.EmprestimoService;

@RestController
public class EmprestimoController {

	@Autowired
	private EmprestimoService emprestimoService;

	@PostMapping(value = "/emprestimo", consumes = "application/json")
	public void save(@RequestBody Emprestimo emprestimo) {
		emprestimoService.save(emprestimo);
	}
}
