
public class IdInvalidoException extends RuntimeException{

	public IdInvalidoException(String mensagem) {
		super(mensagem);
	}
	
	public IdInvalidoException() {
		super("Id inserido não está dentro das opções!");
	}
	
}
