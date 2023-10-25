package tema3;

import java.util.Locale;
import java.util.Scanner;

public class UD05Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables de la base y el exponente que le pediremos al
		 * usuario
		 */
		double baseA;
		int exponenteB;
		// Declaramos la variable del resultado de la potencia que mostraremos
		double resultadoPotencia = 1;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Potencia");
		// Le pedimos al usuario una base
		System.out.println("Introduzca un número real como base");
		// Leemos el número
		baseA = sc.nextDouble();
		// Le pedimos al usuario un exponente
		System.out.println("Introduzca un número entero como exponente");
		// Leemos el número
		exponenteB = sc.nextInt();
		// Bucle for que se ejecutará desde el 1 hasta el valor asignado al exponente
		for (int i = 1; i <= exponenteB; i++) {
			// Establecemos la relación entre las variables
			resultadoPotencia *= baseA;
		}
		// Mostramos el resultado pero con dos decimales, optaré mejor por usar printf
		System.out.printf("Math.pow(%.2f, %d) = %.2f", baseA, exponenteB, resultadoPotencia);
		// Cerramos el Scanner
		sc.close();
	}
}
