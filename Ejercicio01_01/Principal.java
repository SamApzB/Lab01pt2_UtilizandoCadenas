package Ejercicio01_01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.println("Coloque un texto: ");
		String str = sc.next();
		System.out.println("Coloque la letra a buscar: ");
		char p1 = sc.next().charAt(0);
		
		p1 = Character.toLowerCase(p1);
		str = str.toLowerCase();
		
		System.out.println("ECONTRADOR DE PALABRAS QUE TERMINAN CON "+p1);
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				if (str.charAt(i) == (p1)) {
					contador++;
				}
			}
			if (Character.isLetter(str.charAt(i)) == false) {
				if (i - 1 != -1) {
					if (str.charAt(i - 1) == (p1)) {
						contador++;
					}
				}
			}
		}
		
		System.out.println("Contador de "+p1+": "+ contador);
	}
}
