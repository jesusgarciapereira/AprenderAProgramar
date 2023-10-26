package tema3;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos una variable boolean para determinar si un número es primo
		boolean primo = true;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("¿Es primo?");
		do {// Le pedimos al usuario un número
			System.out.println("Introduzca un número (entre 1 y 1000) para saber si es primo");
			// Leemos el número
			num = sc.nextInt();
		} while (num < 1 || num > 1000); /*
											 * Repetiremos las instrucciones del do, si el valor del número se sale de
											 * los límites establecidos
											 */
		// Si el número es 1, mostrará este resultado
		if (num == 1)
			System.out.println("El número " + num + " no es primo porque él en sí mismo es la unidad");
		else { // En caso contrario ejecutaremos un bucle for
			for (int i = 2; i <= Math.sqrt(num); i++) {
				/*
				 * Si el número es divisible por algún valor del contador, asignaremos false a
				 * la variable primo
				 */
				if (num % i == 0) {
					primo = false;
					// Salimos del bucle
					break;
				}
			}
			// Mostramos la primera parte del resultado
			System.out.print("¿El número " + num + " es primo?: ");
			if (primo == true)
				System.out.println("SI"); // Si el valor de primo es true, mostrará SI
			else
				System.out.println("NO"); // En caso contrario, mostrará NO
		}
		// Cerramos el Scanner
		sc.close();

	}

}
