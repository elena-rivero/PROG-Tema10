package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		BufferedReader reader = null;
	
		try {
			 reader = new BufferedReader(new FileReader("C:\\ficheros\\fichero.txt"));
			
			String linea = reader.readLine();
			
			while(linea != null) {
				System.out.println(linea);
				linea = reader.readLine();					
			}
			
			
//			while(lectura.read() != -1) {
//				System.out.print((char)lectura.read());
//			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero");
			System.out.println(e.getMessage());
		} finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
