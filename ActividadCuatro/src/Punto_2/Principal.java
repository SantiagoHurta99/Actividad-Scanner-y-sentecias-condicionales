package Punto_2;

import java.util.Scanner;

/**
 * @author Santiago Hurtado
 */

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 2 numeros con coma flotante y un operador:");
		System.out.print("Ingrese el primer numero: ");
		double num1 = sc.nextDouble();
		System.out.print("Ingrese el segundo numero: ");
		double num2 = sc.nextDouble();
		System.out.print("Ingrese el operador (*, +, /, %, -): ");
		char operador = sc.next().charAt(0);
		
		System.out.println("\nswitch:");
		switch (operador) {
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		case '%':
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		default:
			System.out.println("El caracter ingresado es incorrecto!");
			break;
		}
		
		System.out.println("\nif/else:");
		if (operador == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		} else if (operador == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		} else if (operador == '/') {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		} else if (operador == '%') {
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		} else if (operador == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}else {
			System.out.println("El caracter ingresado es incorrecto!");
		}
	}
}
