package Punto_7;

import java.util.Scanner;

/**
 * @author Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la altura de la habitación: ");
		double alto = sc.nextDouble();
		System.out.print("Ingrese el largo de la habitación: ");
		double largo = sc.nextDouble();
		System.out.print("Ingrese el ancho de la habitación: ");
		double ancho = sc.nextDouble();
		
		double paredGrande = alto * largo;
		double paredPequeña= alto * ancho;
		double techo = largo * ancho;
		
		double totalPies = (paredGrande * 2) + (paredPequeña * 2) + techo;
		
		int bote5L = (int) Math.round(totalPies / 1500);
		int bote1L = (int) Math.round((totalPies - (bote5L * 1500)) / 300);
		
		double precioTotal = (bote5L * 15) + (bote1L * 4);
		System.out.println("Para pintar un total de " + totalPies + " pies cuadrados debera comprar:\n" + bote5L + " botes de 5 litros\n" + bote1L + " botes de 1 litro\nPor un total de $" + precioTotal);
	}
}
