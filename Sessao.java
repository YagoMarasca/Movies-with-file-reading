
public class Sessao {
	private Filme filme;
	private Horario Horario;
	private Sala sala;
	private Funcionario responsavel;
	private Premio premio;
	private Indicacoes indica;
	
	public Indicacoes getIndica() {
		return indica;
	}

	public void setIndica(Indicacoes indica) {
		this.indica = indica;
	}

	public Sessao() {
		this.filme = null;
		this.sala = null;
		this.Horario = null;
		this.responsavel = null;
		this.premio = null;
	}
	
	public Sessao(Filme filme, Sala sala, Horario horario, Funcionario func, Premio premio) {
		this.filme = filme;
		this.sala = sala;
		this.Horario = horario;
		this.responsavel = func;
		this.premio = premio;
	}
	
	public Sessao(Filme filme, Sala sala, Horario horario, Funcionario func, Indicacoes premio) {
		this.filme = filme;
		this.sala = sala;
		this.Horario = horario;
		this.responsavel = func;
		this.indica = premio;
	}
	
	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Horario getHorario() {
		return Horario;
	}

	public void setHorario(Horario horario) {
		Horario = horario;
	}

	public Premiacao getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		if(this.premio != null) {
		return this.filme.toString() + "\n" + this.sala.toString() + "\n" +
				this.Horario.toString() + "\n" + this.responsavel.toString() + "\n" +
				this.premio;
		}
		return this.filme.toString() + "\n" + this.sala.toString() + "\n" +
		this.Horario.toString() + "\n" + this.responsavel.toString() + "\n" +
		this.indica;
	}
}
