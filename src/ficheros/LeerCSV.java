package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerCSV {

	public static void main(String[] args) {
		String datos = "";
		String nombre;
		String apellidos;
		int edad;
		String[] datosSeparados;
		Persona p;
		List<Persona> lista = new ArrayList<>();
		BufferedReader lectura = null;
		try {
			lectura = new BufferedReader(new FileReader("datos.csv"));
			lectura.readLine();
			datos = lectura.readLine();
			
			while(datos != null) {
				datosSeparados = datos.split(",");
				
				nombre = datosSeparados[0];
				apellidos = datosSeparados[1];
				edad = Integer.parseInt(datosSeparados[2]);
				
				p = new Persona(nombre, apellidos, edad);
				
				lista.add(p);
				
				datos = lectura.readLine();
				System.out.println(nombre + "\t" + apellidos + "\t" + edad);
			}
			
			System.out.println(lista);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error en la lectura del fichero");
			System.out.println(e.getMessage());
		} finally {
			try {
				lectura.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar");
			}
		}
	}

}
