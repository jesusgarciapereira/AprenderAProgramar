package tema3;

import java.util.Scanner;

public class UD05Ejercicio04 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int n;
		// Declaramos la variable del resultado del factorial que mostraremos
		int resultadoFactorial = 1;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Factorial de N");
		do { // Le pedimos al usuario un valor para n
			System.out.println("Elige un número entero a partir del 0, para calcular su factorial");
			// Leemos el número
			n = sc.nextInt();
		} while (n < 0); // Repetiremos las instrucciones del do, si el valor del número es menor que 0
		// Bucle for que se ejecutará desde el 1 hasta valor asignado a n
		for (int i = 1; i <= n; i++) {
			// Establecemos la relación entre las variables
			resultadoFactorial *= i;
		}
		// Mostramos el resultado
		System.out.println("!" + n + " = " + resultadoFactorial);
		// Cerramos el Scanner
		sc.close();
	}
}
