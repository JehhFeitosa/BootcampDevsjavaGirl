package dominio;

public class TestaUsuario {

	public static void main(String[] args) {
		
		Usuario zezinho = new Usuario();
		zezinho.setNomeCompleto("Zezinho Silva");
		zezinho.setDataNascimento("10/10/1994");
		zezinho.setEndereco("Rua");
		
		zezinho.imprimirDadosUsuario();
		
		Emprestimo a = new Emprestimo();
		
	}

}