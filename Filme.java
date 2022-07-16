public class Filme {

	private int id;
	private String titulo;
	private int ano;
	
	public Filme() {
		this.id = 0;
		this.titulo ="";
		this.ano = 0;
	}
	
	public Filme(int id, String nome, int ano) {
		this.id = id;
		this.titulo = nome;
		this.ano = ano;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.titulo + ", Ano: " + this.ano +
				", Id: " + this.id;
	}
	
}
