package Ejercicio01_01;
import javax.swing.JOptionPane;

public class EjerciciosBasicos06 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null, "Introduce una palabra, cadena vacia para terminar", "Introducir palabra", JOptionPane.INFORMATION_MESSAGE);
		String cadenaResultante = "";
		
		while(!texto.isEmpty()) {
			cadenaResultante = cadenaResultante + texto + " ";
			texto = JOptionPane.showInputDialog(null, "Introduce un palabra, cadena vacia para terminar", "Introducir palabra", JOptionPane.INFORMATION_MESSAGE);
		}
		int a =0, c=0; boolean comp;
		String palabras[] = cadenaResultante.split(" ");
		String resultado[] = new String[palabras.length];
		
		for (int i = 0; i < palabras.length; i++) {
			comp = false;
            a=0;
            while(!comp && (a<c) ){
                if(palabras[i].equals(resultado[a]))
                	comp = true;
                a++;
            }
            if(!comp){
            	resultado[c] = palabras[i];
                c++;
            }
        }
		for(int i = 0; i<c; i++) {
			System.out.println(resultado[i]);
		}
		JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE );
		
	}
}