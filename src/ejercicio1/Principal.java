package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor = Utils.readDouble(sc);
		System.out.println(valor);
		
		valor = Utils.readInt(sc);
		System.out.println(valor);
		
	}

}
