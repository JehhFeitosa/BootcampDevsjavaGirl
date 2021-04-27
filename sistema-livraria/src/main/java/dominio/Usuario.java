package dominio;

public class Usuario {
	
	private int codigoUsuario;
	private String nomeCompleto;
	private String dataNascimento;
	private String endereco;
	
	
	public Usuario(Long codigo, String nomeCompleto, String dataNascimento, String endereco) {
		this.codigoUsuario = codigoUsuario;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	public void imprimirDadosUsuario() {
		System.out.println("Nome: " + this.getNomeCompleto() +
				"\nData de nascimento: " + this.getDataNascimento()+
				"\nEndereço: " + this.getEndereco());
	}

	

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
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
