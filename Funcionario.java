
public class Funcionario {
	
	private int id;
	private String nome;
	
	public Funcionario() {
		this.id = 0;
		this.nome = "";
	}
	
	public Funcionario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Funcionario responsavel: " + this.nome +
				", Id: " + this.id;
	}
}
