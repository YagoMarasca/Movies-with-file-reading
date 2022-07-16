import java.util.ArrayList;

public class Servico {
	
	private ArrayList<Premiacao> listaPremios = new ArrayList<>();
	private ArrayList<Filme> listaFilmes = new ArrayList<>();
	private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
	private ArrayList<Horario> listaHorarios = new ArrayList<>();
	private ArrayList<Sala> listaSalas = new ArrayList<>();
	
	private Arquivo arquivo = new Arquivo();

	public void acessarArquivo(String nome){
		arquivo.setNome(nome);
		arquivo.ler();
	}
	
	public void gerenciarColecoes() {
		int indice = 0;
		int salas = arquivo.getLinhasArquivo().indexOf("##Salas");
		int funcionarios = arquivo.getLinhasArquivo().indexOf("##Funcionarios");
		int horarios = arquivo.getLinhasArquivo().indexOf("##Horarios");
		int premios = arquivo.getLinhasArquivo().indexOf("##Premiacao");
		int filmes = arquivo.getLinhasArquivo().indexOf("##Filmes");
		
		for (String linha : arquivo.getLinhasArquivo()) {
				if(indice > filmes && indice < salas) {
					String[] palavras = linha.split(",");
					listaFilmes.add(new Filme(Integer.valueOf(palavras[0]), palavras[1], Integer.valueOf(palavras[2])));
				}
				else if(indice > salas && indice < premios) {
				String[] palavras = linha.split(",");
					listaSalas.add(new Sala(Integer.valueOf(palavras[0]), palavras[1], Integer.valueOf(palavras[2])));
				}
				else if(indice > premios && indice < horarios) {
					String[] palavras = linha.split(",");
					listaPremios.add(new Premiacao(Integer.valueOf(palavras[0]), palavras[1]));
				}
				else if(indice > horarios && indice < funcionarios) {
					String[] palavras = linha.split(",");
					listaHorarios.add(new Horario(Integer.valueOf(palavras[0]), palavras[1]));
				}
				else if(indice > funcionarios && linha != null){
					String[] palavras = linha.split(",");
					listaFuncionarios.add(new Funcionario(Integer.valueOf(palavras[0]), palavras[1]));
				}
			indice++;
			}
			
	}
	public ArrayList<Premiacao> getListaPremios() {
		return listaPremios;
	}

	public void setListaPremios(ArrayList<Premiacao> listaPremios) {
		this.listaPremios = listaPremios;
	}

	public ArrayList<Filme> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Filme> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public ArrayList<Horario> getListaHorarios() {
		return listaHorarios;
	}

	public void setListaHorarios(ArrayList<Horario> listaHorarios) {
		this.listaHorarios = listaHorarios;
	}

	public ArrayList<Sala> getListaSalas() {
		return listaSalas;
	}

	public void setListaSalas(ArrayList<Sala> listaSalas) {
		this.listaSalas = listaSalas;
	}
}


