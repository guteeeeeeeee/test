package excepciones;

public class ContrasenaInvalidaException extends Exception {
	
	public ContrasenaInvalidaException(String causa) {
		super(causa);
	}
	
}
