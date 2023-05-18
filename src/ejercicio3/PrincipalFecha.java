package ejercicio3;

public class PrincipalFecha {

	public static void main(String[] args) {
		try {
			Fecha f = new Fecha(5,12,2007);
			f.setDia(31);
			f.setMes(11);
		} catch (DayOutOfRangeException e) {
			System.out.println(e.getMessage());
		} catch (MonthOutOfRangeException e) {
			System.out.println(e.getMessage());
		}

	}

}
