package Actividad04;
import javax.swing.JOptionPane;

public class CalculadoraPolacaInversaApp {

	public static void main(String[] args) {
		int op1 ;
		int op2;
		int resultado = 0;
		
		String texto = JOptionPane.showInputDialog("Escribe el operador 1: ");
		op1 = Integer.parseInt(texto);
		
		String operacion = JOptionPane.showInputDialog("Escribe el codigo del operador: ");
		
		String texto2 = JOptionPane.showInputDialog("Escribe el operador 2: ");
		op2 = Integer.parseInt(texto2);
		
		switch (operacion) {
		case "+": 
			System.out.println(op1 + " "+op2);
			resultado = op1 + op2;
			break;
		case "-":
			resultado = op1 - op2;
			break;
		case "*":
			resultado = op1 * op2;
			break;
		case "/":
			resultado = op1 / op2;
			break;
		case "^":
			resultado = (int) Math.pow(op1, op2);
			break;
		case "%":
			resultado = op1 % op2;
			break;
			
			
		
		
		

	}
		JOptionPane.showMessageDialog(null, op1 + " " + operacion + " " + op2 + " = " + resultado);

	}
}