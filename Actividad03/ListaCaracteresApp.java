package Actividad03;

public class ListaCaracteresApp {

	public static void main(String[] args) {
		String cadena = "La lluvia en Sevilla es una maravilla";
		
		for(int i=0; i<cadena.length();i++) {
			//Muestra el codigo ASCII de cada caracter
			System.out.print((int)cadena.charAt(i));
		}
	}

}
