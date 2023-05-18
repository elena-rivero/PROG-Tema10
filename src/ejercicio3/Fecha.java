package ejercicio3;

public class Fecha {

	private int dia = 1;
	private int mes = 1;
	private int año = 1970;

	public Fecha() {

	}

	/**
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 * @throws DayOutOfRangeException   Se lanza la excepción cuando el día
	 *                                  introducido no está dentro del rango 1-31
	 * @throws MonthOutOfRangeException Se lanza la excepción cuando el mes
	 *                                  introducido no pertenece al rango 1-12
	 */
	public Fecha(int dia, int mes, int año) throws DayOutOfRangeException, MonthOutOfRangeException {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		} else {
			throw new DayOutOfRangeException();
		}
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			throw new MonthOutOfRangeException();
		}
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) throws DayOutOfRangeException {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		} else {
			throw new DayOutOfRangeException();
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws MonthOutOfRangeException {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			throw new MonthOutOfRangeException();
		}
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// p y [¬q ó r]
	private boolean esBisiesto() {
		boolean bisiesto = false;

		if (this.año % 4 == 0 && (this.año % 100 != 0 || this.año % 400 == 0)) {
			bisiesto = true;
		}
		return bisiesto;
	}

	public boolean fechaCorrecta() {
		boolean correcta = false;
		switch (mes) {
		case 2:
			if ((esBisiesto() && dia <= 29) || (!esBisiesto()) && dia <= 28) {
				correcta = true;
			}
			break;
		case 4, 6, 9, 11:
			if (dia <= 30) {
				correcta = true;
			}
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			correcta = true;
			break;
		}

		return correcta;
	}

	public void diaSiguiente() {
		dia++;
		switch (mes) {
		case 2:
			if ((esBisiesto() && dia > 29) || (!esBisiesto()) && dia > 28) {
				dia = 1;
				mes++;
			}
			break;
		case 4, 6, 9, 11:
			if (dia > 30) {
				dia = 1;
				mes++;
			}
			break;
		case 1, 3, 5, 7, 8, 10:
			if (dia > 31) {
				dia = 1;
				mes++;
			}
			break;
		case 12:
			if (dia > 31) {
				dia = 1;
				mes = 1;
				año++;
			}
		}
	}

	public String toString() {
		String res = "";
		if (dia <= 9) {
			res += "0";
		}
		res += dia + "-";

		if (mes <= 9) {
			res += "0";
		}
		res += mes + "-" + año;

		return res;
	}

}
