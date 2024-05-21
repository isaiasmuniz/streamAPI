package map;

import java.util.function.UnaryOperator;

public class Utilitario {
	private Utilitario() {
		
	}
	
	public final static UnaryOperator<String> maiusculas = m -> m.toUpperCase();
	public final static String grito(String n) {
		return n + "!!";
	}
	public final static UnaryOperator<String> primeiraLestra 
	= n -> n.charAt(0) + "";

}
