package br.com.jessica_feitosa.respositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jessica_feitosa.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
