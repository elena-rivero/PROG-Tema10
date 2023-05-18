package ejercicio3;

public class MonthOutOfRangeException extends Exception{
	@Override
	public String toString() {
		return "El mes introducido está fuera del rango";
	}
	
	@Override
	public String getMessage() {
		return "El mes introducido está fuera del rango";
	}
}
