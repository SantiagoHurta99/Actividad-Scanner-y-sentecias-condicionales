package Punto_4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su peso: ");
		double pesoTierra = sc.nextDouble();
		System.out.println("Menu planetas");
		System.out.println("1. Mercurio");
		System.out.println("2. Venus");
		System.out.println("3. Marte");
		System.out.println("4. Jupiter");
		System.out.println("5. Saturno");
		System.out.println("6. Urano");
		System.out.println("7. Neptuno");
		System.out.print("Ingrese la opción del planeta donde quiere conocer su peso: ");
		int op = sc.nextInt();

		DecimalFormat formato1 = new DecimalFormat("#.00");
		switch (op) {
		case 1:
			System.out.println("Su peso en Mercurio es " + formato1.format(pesoTierra*0.38) + " kg");
			break;
		case 2:
			System.out.println("Su peso en Venus es " + formato1.format(pesoTierra*0.91) + " kg");
			break;
		case 3:
			System.out.println("Su peso en Marte es " + formato1.format(pesoTierra*0.38) + " kg");
			break;
		case 4:
			System.out.println("Su peso en Jupiter es " + formato1.format(pesoTierra*2.36) + " kg");
			break;
		case 5:
			System.out.println("Su peso en Saturno es " + formato1.format(pesoTierra*0.92) + " kg");
			break;
		case 6:
			System.out.println("Su peso en Urano es " + formato1.format(pesoTierra*0.89) + " kg");
			break;
		case 7:
			System.out.println("Su peso en Neptuno es " + formato1.format(pesoTierra*1.13) + " kg");
			break;

		default:
			System.out.println("La opción ingresada no es valisa");
			break;
		}
	}
}
