
public class Premiacao {

	protected int id;
	protected String nome;


	
	public Premiacao(int id, String premio) {
		this.id = id;
		this.nome = premio;
	}
	
	public Premiacao() {
		this.id = 0;
		this.nome = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "ID: "+this.id + " Premio: " + this.nome;
	}
	
}
