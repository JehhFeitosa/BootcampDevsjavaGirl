package dominio;

public class Emprestimo {

	private int codigo;
	private Usuario usuario;
	private Livro livro;
	private String dataEmprestimo;
	private String dataDevolucao;
	
	public void impreDadosEmprestimo() {
		System.out.println("Codigo emprestimo" + codigo +
		"\nNome usuario: " + usuario.getNomeCompleto() +
		"\nnome do Livro: " + livro.getNome());
	}
	
	

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
	
	
}
