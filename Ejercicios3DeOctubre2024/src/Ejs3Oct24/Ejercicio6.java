package Ejs3Oct24;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
		System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		}
		}
