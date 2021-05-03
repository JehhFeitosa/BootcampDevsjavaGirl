package br.com.jessica_feitosa.servico;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jessica_feitosa.dominio.Emprestimo;
import br.com.jessica_feitosa.respositorio.EmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired
	private EmprestimoRepository emprestimoRepository;

	public void save(Emprestimo emprestimo) {
		if (validaDataDevolucao(emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao())) {
			emprestimoRepository.save(emprestimo);
		} else
			throw new IllegalArgumentException("Data de devolução inválida");
	}

	private Boolean validaDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
		if (dataDevolucao.isBefore(dataEmprestimo)) {
			return false;
		}
		return true;
	}

}
