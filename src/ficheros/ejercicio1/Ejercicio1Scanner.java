package ficheros.ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1Scanner {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("src\\ficheros\\ejercicio1\\NumerosReales.txt"));
			sc.useLocale(Locale.US);
			double suma = 0;
			int contador = 0;
			double media = 0;
			while (sc.hasNext()) {
				suma += sc.nextDouble();
				contador++;
			}

			media = suma / contador;
			System.out.println("Suma total: " + suma);
			System.out.println("Media: " + media);

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
