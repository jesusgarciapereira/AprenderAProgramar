package tema3;

import java.util.Scanner;

public class UD05Ejercicio09 {

	public static void main(String[] args) {
		// Declaramos la variable de las notas que le pediremos al usuario
		int nota;
		// Declaramos una variable boolean para determinar si hay algún 10
		boolean algun10 = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("¿Hay algún diez?");
		do {
			// Le pedimos al usuario una nota
			System.out.println("Introduzca una nota (-1 para terminar)");
			// Leemos el número
			nota = sc.nextInt();
			// Si alguna nota es 10, asignaremos true a la variable de algun10
			if (nota == 10)
				algun10 = true;
			// Si alguna nota se sale de estos límites, mostraremos nota incorrecta
			else if (nota < 0 || nota > 10)
				System.out.println("Nota incorrecta");
		} while (nota != -1); /*
								 * Repetiremos las instrucciones de dentro del do hasta que el valor de la nota
								 * sea -1
								 */
		// Mostramos la primera parte del resultado
		System.out.print("¿Hay algún 10?: ");
		if (algun10 == true)
			System.out.println("SI"); // Si el valor de algun10 es true, mostrará SI
		else
			System.out.println("NO"); // En caso contrario, mostrará NO
		// Cerramos el Scanner
		sc.close();

	}

}
