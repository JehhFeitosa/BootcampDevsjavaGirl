package br.com.jessica_feitosa.respositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jessica_feitosa.dominio.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

}
