package Punto_5;

import java.util.Scanner;

/**
 * @author Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fue el estudiante con la clasificación mas alta (si / no): ");
		String clasificacion1 = sc.nextLine();
		int posicion = 0;
		if (clasificacion1.equals("si")) {
			posicion = 1;
		} else {
			System.out.print("Fue el estudiante con la segunda clasificación mas alta (si / no): ");
			String clasificacion2 = sc.nextLine();
			if (clasificacion2.equals("si")) {
				posicion = 2;
			}
		}
		System.out.print("Ingrese la cantidad de alumnos del instituto: ");
		int cantAlumnos = sc.nextInt();
		System.out.print("Ingrese la nota media del alumno: ");
		double notaMedia = sc.nextDouble();
		System.out.print("Ingrese la puntuación SAT del alumno: ");
		int puntuacionSAT = sc.nextInt();

		if ((cantAlumnos >= 1400 && (posicion == 1 || posicion == 2)) 
				|| (notaMedia >= 4.0 && puntuacionSAT >= 1100)
				|| (notaMedia >= 3.5 && puntuacionSAT >= 1300) 
				|| (notaMedia >= 3.0 && puntuacionSAT >= 1500)) {
			System.out.println("El estudiante cumple los requisitos para entrar en la Universidad de Mountville.");
		} else {
			System.out.println("El estudiante NO cumple los requisitos para entrar en la Universidad de Mountville.");
		}
	}
}
