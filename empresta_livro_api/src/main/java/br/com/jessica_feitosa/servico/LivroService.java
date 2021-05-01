package br.com.jessica_feitosa.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jessica_feitosa.dominio.Livro;
import br.com.jessica_feitosa.respositorio.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRespository;

	public void save(Livro livro) {
		livroRespository.save(livro);
		
	}
	

}
