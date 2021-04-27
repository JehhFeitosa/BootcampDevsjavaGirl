package dominio;

public class Usuario {
	
	private int codigoUsuario;
	private String nomeCompleto;
	private String dataNascimento;
	private String endereco;
	
	public Usuario() {
		
	}
	
	public void imprimirDadosUsuario() {
		System.out.println("Nome: " + this.nomeCompleto +
				"\nData de nascimento: " + this.dataNascimento+
				"\nEndereço: " + endereco);
	}

	

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	
	

}
