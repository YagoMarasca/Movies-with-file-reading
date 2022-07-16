
public class Premio extends Premiacao{
	
	private int ano;

	public Premio() {
		super();
		this.ano = 0;
	}
	public Premio(int id, String nome, int ano) {
		super(id, nome);
		this.ano = ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , Vencedor no Ano: " + this.ano;
	}
}
