
public class Indicacoes extends Premiacao {
	
	private int ano;

	public Indicacoes() {
		super();
		this.ano = 0;
	}
	public Indicacoes(int id, String nome, int ano) {
		super(id, nome);
		this.ano = ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , Indicado no Ano: " + this.ano;
	}
}
