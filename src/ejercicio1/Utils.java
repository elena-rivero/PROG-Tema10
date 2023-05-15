package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble(Scanner sc) {
		double num = 0.0;
		
		try {
			System.out.println("Introduzca un valor decimal");
			num = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es double");
		} finally {
			sc.nextLine();
		}
		
		return num;
	}
	
	public static int readInt(Scanner sc) {
		int num = 0;
		
		try {
			System.out.println("Introduzca un valor entero");
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es entero");
		} finally {
			sc.nextLine();
		}
		
		return num;
	}
}
