package Actividad12;
import java.util.Scanner;

public class EjercicioBasico12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un dia de la semana: ");
		
		String dia = sc.next();
		DiaDeLaSemana diaS = DiaDeLaSemana.valueOf(dia.toUpperCase());
		
		switch(diaS){
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("El dia " + diaS.name().toLowerCase() + " es laborable");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("El dia " + diaS.name().toLowerCase() + " no es laborable");
			break;	
		}
	}
}  