package Actividad07;
import javax.swing.JOptionPane;

public class EjerciciosBasicos07 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null, "Por favor, introduce una frase", "Introduccion", JOptionPane.INFORMATION_MESSAGE);
		String cadenaResultante;
		
		// true -> lo pasamos a mayusculas
		// false -> lo pasamos a minusculas
		
		boolean isMayus;
		int eleccion = JOptionPane.showConfirmDialog(null, "Quieres que se pase a mayusculas", "Eleccion", JOptionPane.YES_NO_OPTION);
		
		isMayus = (eleccion == JOptionPane.YES_OPTION);

		if(isMayus) {
			cadenaResultante = texto.toUpperCase();
		}else {
			cadenaResultante = texto.toLowerCase();
		}
		
		// Mensaje
		JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
