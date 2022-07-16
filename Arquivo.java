import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.*;


public class Arquivo {
	private String nome;

	private ArrayList<String> linhasArquivo = new ArrayList<>();
	
	public Arquivo(String arquivo) {
		this.nome = arquivo;
	}
	
	
	public Arquivo() {
		this.nome = "ArquivoFilmes.txt"; 
	}
	
	public void ler() {
		String linha;
		try(FileInputStream arquivo = new FileInputStream(this.nome)){
			InputStreamReader isr = new InputStreamReader(arquivo);
			BufferedReader leitor = new BufferedReader(isr);
			
			do {
				linha = leitor.readLine();
				linhasArquivo.add(linha);
			}
			while(linha != null);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public ArrayList<String> getLinhasArquivo() {
		return linhasArquivo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
