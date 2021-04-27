package dominio;

public class Livro {
	
	private int codLivro;
    private String nome;
    private String autor;

    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;

    }

    public void imprimeLivro(){
        System.out.println("Nome Livro:" + this.nome+
                "\n autor: " + this.autor);
    }

	public int getCodLivro() {
		return codLivro;
	}

	public void setCodLivro(int codLivro) {
		this.codLivro = codLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
    
    
    

}
