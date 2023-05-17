package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {

	public static void main(String[] args) {
		BufferedWriter escritura = null;
		Scanner sc = new Scanner(System.in);
		String texto = "";
		try {
			escritura = new BufferedWriter(new FileWriter("escribir.txt"));
			
			texto = sc.nextLine();
			while(!texto.equals("fin")) {
				escritura.write(texto);
				escritura.newLine();
				texto = sc.nextLine();
			}
						
			escritura.flush();
			
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
			System.out.println(e.getMessage());
		} finally {
			try {
				escritura.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
