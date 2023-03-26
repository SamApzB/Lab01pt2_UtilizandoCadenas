package Actividad02;

public class CambioLetrasApp {

	public static void main(String[] args) {
		String cadena = "La lluvia en Sevilla es una maravilla";
		
		//No modifica el String Original
		System.out.println(cadena.replace('a', 'e'));
	}

}
