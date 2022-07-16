import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	Servico serv = new Servico();
	Exibicao exibicao = new Exibicao();
	
	//M�todo Para ler as informa��es do Arquivo
	public void lerDados() {
		serv.acessarArquivo("ArquivoFilmes.txt");
		serv.gerenciarColecoes();
		
	}
	
	public void menu() {
		int tamanho = serv.getListaSalas().size();
		
		for(int i=0; i<tamanho; i++) {
			exibicao.Menu(serv);
		}
	}
	
	
	public void gerenciarExibicao() {
		menu();
		//Ordena baseado no hor�rio
		exibicao.ordenaLista();
		//Chama m�todo para escrever arquivo
		gravarArquivo();
	}
	
	//Escreve Arquivo
	public void gravarArquivo() {
		try(PrintWriter pw = new PrintWriter("Sessoes.txt")){
			System.out.println("Gerando arquivo...");
			for (Sessao s : exibicao.getExibicoes()) {
				pw.println("**********************************************************");
				pw.println(s);
				
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("O processo de gerar o arquivo foi finalizado");
		}
	}
	
	public static void main(String[] args) {
		
		Main cinema = new Main();
		
		//Chama para ler os dados do Arquivo
		cinema.lerDados();
		
		//Chama os m�todos para o usu�rio ver as listas e montar as sess�es;
		cinema.gerenciarExibicao();
	
		
	}
}
