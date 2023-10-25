package tema3;

import java.util.Scanner;

public class UD05Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int n;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Números entre 1 y N");
		// Le pedimos al usuario un valor para n
		System.out.println("Elige un valor para N");
		// Leemos el número
		n = sc.nextInt();
		// Bucle for que se ejecutará desde el 1 hasta valor asignado a n
		for (int i = 1; i <= n; i++)
			// Mostramos el resultado (todos los números por los que pasa el contador)
			System.out.println(i);
		// Cerramos el Scanner
		sc.close();

	}

}
