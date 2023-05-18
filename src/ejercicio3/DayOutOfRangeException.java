package ejercicio3;

public class DayOutOfRangeException extends Exception{
	@Override
	public String toString() {
		return "El día introducido está fuera del rango";
	}
	
	@Override
	public String getMessage() {
		return "El día introducido está fuera del rango";
	}
}
