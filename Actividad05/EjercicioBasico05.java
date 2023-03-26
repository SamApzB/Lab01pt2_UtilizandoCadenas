package Actividad05;
import javax.swing.JOptionPane;

public class EjercicioBasico05 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null, "Inserta una frase", "Insercion", JOptionPane.INFORMATION_MESSAGE);
		String texto_sin_espacios = "";
		
		char caracterActual;
		
		for(int i = 0; i<texto.length(); i++) {
			caracterActual = texto.charAt(i);
			
			// Cuando es un espacio, no lo agrega a la cadena
			
			if(caracterActual != ' ') {
				texto_sin_espacios += String.valueOf(caracterActual);
				
				
			}
		}
		JOptionPane.showMessageDialog(null, "La frase sin espacios tiene " + texto_sin_espacios, "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}
