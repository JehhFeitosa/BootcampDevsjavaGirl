package br.com.jessica_feitosa.respositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jessica_feitosa.dominio.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
