public class Horario {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String hora;
	
	public Horario() {
		this.id = 0;
		this.hora = "";
	}
	
	public Horario(int id, String hora) {
		this.id = id;
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Horario : " + this.hora + ", Id: " + this.id;
	}
}
