
public class IdInvalidoException extends RuntimeException{

	public IdInvalidoException(String mensagem) {
		super(mensagem);
	}
	
	public IdInvalidoException() {
		super("Id inserido n�o est� dentro das op��es!");
	}
	
}
