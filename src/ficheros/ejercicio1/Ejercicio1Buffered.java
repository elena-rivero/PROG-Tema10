package ficheros.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1Buffered {

	public static void main(String[] args) {
		BufferedReader br;
		String linea="";
		String[] numeros;
		double suma = 0;
		int contador = 0;
		double media;
		
		try {
			br = new BufferedReader(new FileReader("src\\ficheros\\ejercicio1\\NumerosReales.txt"));
			linea = br.readLine();
			
			while(linea != null) {
				numeros = linea.split(" ");
				
				for(String numero : numeros) {
					suma += Double.parseDouble(numero);
					contador++;
				}
				linea = br.readLine();
			}
			media = suma/contador;
			System.out.println("Suma total: " + suma);
			System.out.println("Media: " + media);
						
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			System.out.println(e.getMessage());
		}
	}

}
