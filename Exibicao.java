import java.util.ArrayList;

public class Exibicao {

	private ArrayList<Sessao> exibicoes = new ArrayList<>();
	
	public void criarExibicao(Filme filme, Sala sala, Horario hora, Funcionario func, Premio premio){
		Sessao sessao = new Sessao();
		this.vincularFilme(sessao, filme);
		this.vincularSala(sessao, sala);
		this.vincularHorario(sessao, hora);
		this.vincularFuncionario(sessao, func);
		this.vincularPremio(sessao, premio);
		exibicoes.add(sessao);

	}
	
	public void criarExibicao(Filme filme, Sala sala, Horario hora, Funcionario func, Indicacoes premio){
		Sessao sessao = new Sessao();
		this.vincularFilme(sessao, filme);
		this.vincularSala(sessao, sala);
		this.vincularHorario(sessao, hora);
		this.vincularFuncionario(sessao, func);
		this.vincularIndicacoes(sessao, premio);
		exibicoes.add(sessao);

	}
	public void Menu(Servico serv) {
		Leitor leitor = new Leitor();
		Filme filmeEscolhido = new Filme();
		Sala salaEscolhida = new Sala();
		Horario horaEscolhida = new Horario();
		Funcionario funcionarioEscolhido = new Funcionario();
		Premiacao premioEscolhido = new Premiacao();

		try {
			
			//Busca o Filme baseado no ID selecionado pelo usuário
//********************************************************************************************************
			System.out.println("Escolha um filme: \n");
			for (Filme filme : serv.getListaFilmes()) {
				System.out.println(filme.getId() + " " + filme.getTitulo());
			}
			int val = leitor.leiaInt("Digite o número correspondente ao filme que deseja: ");
			boolean existe = false;
			for (Filme filme : serv.getListaFilmes()) {
				if(filme.getId() == val) {
					existe = true;
					filmeEscolhido = serv.getListaFilmes().get(serv.getListaFilmes().indexOf(filme));
				}
				else if(val >= 23) {
					throw new IdInvalidoException();
				}
			}
			if(existe == false) {
				throw new IdUtilizadoException();
			}
			serv.getListaFilmes().remove(filmeEscolhido);
			
			//Busca a sala baseado no ID selecionado pelo usuário
//********************************************************************************************************
			System.out.println("\nEscolha uma sala: \n");
			for (Sala sala : serv.getListaSalas()) {
				System.out.println(sala);
			}
			val = leitor.leiaInt("Digite o número correspondente a sala que deseja: ");
			existe = false;
			for (Sala sala : serv.getListaSalas()) {
				if(sala.getId() == val) {
					salaEscolhida = serv.getListaSalas().get(serv.getListaSalas().indexOf(sala));
					existe = true;
				}
				else if(val >= 5) {
					throw new IdInvalidoException();
				}
			}
			if(existe == false) {
				throw new IdUtilizadoException();
			}
			serv.getListaSalas().remove(salaEscolhida);
			
			//Busca o horário baseado no ID selecionado pelo usuário
//********************************************************************************************************
			for (Horario hora : serv.getListaHorarios()) {
				System.out.println(hora);
			}
			val = leitor.leiaInt("Digite o número correspondente ao Horario que deseja: ");
			existe = false;
			for (Horario hora : serv.getListaHorarios()) {
				if(hora.getId() == val) {
					existe = true;
					horaEscolhida = serv.getListaHorarios().get(serv.getListaHorarios().indexOf(hora));
				}
				else if(val >= 6) {
					throw new IdInvalidoException();
				}
			}
			if(existe == false) {
				throw new IdUtilizadoException();
			}
			serv.getListaHorarios().remove(horaEscolhida);
			
			//Busca o funcionário baseado no ID selecionado pelo usuário
//********************************************************************************************************
			for (Funcionario funci : serv.getListaFuncionarios()) {
				System.out.println(funci);
			}
			val = leitor.leiaInt("Digite o número correspondente ao funcionario que deseja: ");
			existe = false;
			for (Funcionario func : serv.getListaFuncionarios()) {
				if(func.getId() == val) {
					existe = true;
					funcionarioEscolhido = serv.getListaFuncionarios().get(serv.getListaFuncionarios().indexOf(func));
				}
				else if(val >= 6) {
					throw new IdInvalidoException();
				}
			}
			if(existe == false) {
				throw new IdUtilizadoException();
			}
			serv.getListaFuncionarios().remove(funcionarioEscolhido);
			
			//Busca o prêmio baseado no ID selecionado pelo usuário
//********************************************************************************************************		
			for (Premiacao premio : serv.getListaPremios()) {
				System.out.println(premio);
			}
			val = leitor.leiaInt("Digite o número correspondente ao Premio que deseja: ");
			existe = false;
			for (Premiacao premio : serv.getListaPremios()) {
				if(premio.getId() == val) {
					existe = true;
					premioEscolhido = serv.getListaPremios().get(serv.getListaPremios().indexOf(premio));
				}
				else if(val >= 4) {
					throw new IdInvalidoException();
				}
			}if(existe == false) {
				throw new IdUtilizadoException();
			}
			val = leitor.leiaInt("Digite 1 para Ganhador do prêmio ou 2 para Indicado:");
			if(val == 1) {
				Premio premio = new Premio(premioEscolhido.getId(), premioEscolhido.getNome(), filmeEscolhido.getAno());
				criarExibicao(filmeEscolhido, salaEscolhida, horaEscolhida, funcionarioEscolhido, premio);
			}
			else if(val == 2) {
				Indicacoes indica = new Indicacoes(premioEscolhido.getId(), premioEscolhido.getNome(), filmeEscolhido.getAno());
				criarExibicao(filmeEscolhido, salaEscolhida, horaEscolhida, funcionarioEscolhido, indica);
			}
			else {
				throw new IdInvalidoException();
			}
		
//********************************************************************************************************
		//Passa as Informações para criar os objetos Sessoes
		} 
		catch(IdInvalidoException |IdUtilizadoException e) {
			//System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			System.exit(-1);
		}
	}
	
	public ArrayList<Sessao> getExibicoes() {
		return exibicoes;
	}

	public void setExibicoes(ArrayList<Sessao> exibicoes) {
		this.exibicoes = exibicoes;
	}

	public void vincularFilme(Sessao s, Filme filme){
		s.setFilme(filme);
	}
	
	public void vincularSala(Sessao s, Sala sala){
		s.setSala(sala);
	}
	
	public void vincularHorario(Sessao s, Horario h){
		s.setHorario(h);
	}
	
	public void vincularFuncionario(Sessao s, Funcionario func){
		s.setResponsavel(func);
	}
	public void vincularPremio(Sessao s, Premio premio) {
		s.setPremio(premio);
	}
	
	public void vincularIndicacoes(Sessao s, Indicacoes indica) {
		s.setIndica(indica);
	}
	
	public void ordenaLista() {
		this.exibicoes.sort( (Sessao s1, Sessao s2) -> Integer.compare(s1.getHorario().getId(), s2.getHorario().getId()) );
	
	}
	
}
