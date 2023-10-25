package tema3;

import java.util.Scanner;

public class UD05Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos una variable boolean para determinar si hay algún negativo
		boolean algunNegativo = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("10 números ¿Hay negativos?");
		// Bucle for que se ejecutará desde el 0 hasta el 9 (10 veces)
		for (int i = 0; i < 10; i++) {
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número (llevamos " + i + ")");
			// Leemos el número
			num = sc.nextInt();
			/*
			 * Si algún número es menor que 0, asignaremos true a la variable de
			 * algunNegativo
			 */
			if (num < 0)
				algunNegativo = true;
		}
		// Mostramos la primera parte del resultado
		System.out.print("¿Hay algún negativo?: ");
		if (algunNegativo == true)
			System.out.println("SI"); // Si el valor de algunNegativo es true, mostrará SI
		else
			System.out.println("NO"); // En caso contrario, mostrará NO
		// Cerramos el Scanner
		sc.close();
	}
}
