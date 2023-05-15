package ejemplos;

public class Pruebas {

	public static void main(String[] args) {
		int a = 0;
		try {
			a = 5/0;
			String c = null;
			c.isEmpty();
		} catch(ArithmeticException e) {
			System.out.println("División por cero");
		} catch(NullPointerException e) {
			System.out.println("Cadena a null");
		} finally {
			System.out.println(a);
		}
	}
	
	static void metodo1(int a, int b) throws ArithmeticException {
		int c = a/b;
		System.out.println(c);
	}

}
