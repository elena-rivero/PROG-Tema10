package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		Scanner lectura = null;
		int numero;
		try {
			lectura = new Scanner(new FileReader("C:\\ficheros\\numeros.txt"));
			
			while(lectura.hasNextInt()) {
				numero = lectura.nextInt();
				System.out.println(numero);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error en la apertura del fichero.");
			System.out.println(e.getMessage());
		} finally {
			lectura.close();
		}
	}

}
