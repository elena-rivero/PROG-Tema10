package ejercicio2;

public class NegativeSecondException extends Exception{

	@Override
	public String toString() {
		return "Valor de segundos negativo";
	}
	
	@Override
	public String getMessage() {
		return "Valor de ñsegundos negativo";
	}
}
