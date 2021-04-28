package dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestaUsuario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


				System.out.println("Digite seu nome Completo: ");
				String nome = scanner.nextLine();

				System.out.println("Digite sua data de Nascimento: ");
				String dataNascimento = scanner.nextLine();

				System.out.println("Digite seu endereço: ");
				String endereco = scanner.nextLine();

				Usuario usuario = new Usuario(1l, nome, dataNascimento, endereco);

				usuario.imprimirDadosUsuario();


				
				System.out.println("\n\n\nDigite o nome do livro: ");
				String nomeLivro = scanner.nextLine();

				System.out.println("Digite o nome do autor do livro: ");
				String autorLivro = scanner.nextLine();

				Livro livro = new Livro(1, nomeLivro, autorLivro);
				livro.imprimeLivro();


				
//				System.out.println("\n\n\nDigite a data do empréstimo: ");
//				String dataEmp = scanner.nextLine();
//
//				System.out.println("Digite a data da devolução: ");
//				String dataDev = scanner.nextLine();
//
//				Emprestimo emp = new Emprestimo(1, usuario, livro, dataEmp, dataDev);
//				emp.impreDadosEmprestimo();
				
				
				
				
				String dataEmprestimo = "";
				String dataDevolucao = "";
				boolean invalido = true;
				
				while(invalido) {
					
					System.out.println("Digite a data do emprestimo: ");
					dataEmprestimo = scanner.nextLine();
					
					System.out.println("Digite a data da devolução: ");
					dataDevolucao = scanner.nextLine();
					
					LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
					LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);
				
					if(localDateDevolucao.isBefore(localDateEmprestimo)){
						invalido = true;
						System.out.println("A data da devolução deve ser depois da data do empréstimo");
					} else {
						invalido = false;
					}
				}
		
				Emprestimo emprestimo = new Emprestimo(1, usuario, livro, dataEmprestimo, dataDevolucao);
				emprestimo.impreDadosEmprestimo();
				

	}

}
