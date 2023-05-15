package ejercicio2;

public class HoraPrincipal {

	public static void main(String[] args) {
		Hora h = new Hora(20, 50, 10);
		
		try {
			h.setSegundo(-50);
		} catch (NegativeSecondException e) {
			System.out.println(e.getMessage());
		}

	}

}
