
public class IdUtilizadoException extends RuntimeException{

	public IdUtilizadoException(String mensagem) {
		super(mensagem);
	}
	
	public IdUtilizadoException() {
		super("ID inserido j� foi utilizado");
	}
}
