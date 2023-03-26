package Actividad11;
import java.util.Scanner;

public class EjerciciosBasicos11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Si escribimos espacios en la frase, coja todo el string
		sc.useDelimiter("\n");
		
		System.out.println("Escribe una frase: ");
		String frase = sc.next();
		
		// Divido la frase en palabras
		String palabras[] = frase.split(" ");
		
		for(int i = 0; i<palabras.length; i++) {
			System.out.println(palabras[i]);
			
		}
	}
}