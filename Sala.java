
public class Sala {

	private int id;
	private String nome;
	private int capacidade;
	
	public Sala() {
		this.id = 0;
		this.nome = "";
		this.capacidade = 0;
	}
	
	public Sala(int id, String nome, int capacidade) {
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sala: " + this.nome + ", Capacidade: " + this.capacidade + 
				", Id: " + this.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
