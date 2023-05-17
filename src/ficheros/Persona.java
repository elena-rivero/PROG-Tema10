package ficheros;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona() {
		edad = 18;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	public void metodo() {
		int edad;
		edad = 8;
		this.edad = 5;
	}
	@Override
	public String toString() {
		return nombre + " " + apellidos + " " + edad;
	}
}
