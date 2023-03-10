package Punto_1;

import java.util.Scanner;

/**
 * @author Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero para x: ");
		int x = sc.nextInt();
		boolean comparacion1;
		boolean comparacion2;
		comparacion1 = (x >= 7) ? true : false;
		if (x >= 7) {
			comparacion2 = true;
		} else {
			comparacion2 = false;
		}
		System.out.println("\n(x>=7)?true:false; => " + comparacion1 + "\nif (x >= 7) \t   => " + comparacion2);
	}
}
