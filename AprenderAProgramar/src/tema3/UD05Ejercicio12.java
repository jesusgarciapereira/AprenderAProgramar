package tema3;

import java.util.Random;
import java.util.Scanner;

public class UD05Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables del número aleatorio que elegirá el programa y el
		 * número que el usuario introducirá para intentar adivinarlo
		 */
		int numAleatorio, numJugador;
		// Creamos un objeto de la clase Random
		Random random = new Random();
		/*
		 * Asignamos a la variable del número aleatorio un nuevo número entre 1 y 100
		 * generado aleatoriamente
		 */
		numAleatorio = random.nextInt(1, 101);
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Adivina número");
		System.out.println("El programa ha pensado en un número del 1 al 100, intenta adivinarlo");
		do {// Le pedimos al usuario un número entre el 1 y el 100
			System.out.println("Elige un número del 1 al 100");
			// Leemos el número
			numJugador = sc.nextInt();
		} while (numJugador < 1 || numJugador > 100); /*
														 * Las instrucciones de dentro del do se repetiran si el usuario
														 * escribe un número que se salga del límite establecido
														 */
		/*
		 * Las instrucciones de dentro del while se ejecutarán y repetiran mientras el
		 * número del usuario sea distinto al número aleatorio del programa
		 */
		while (numAleatorio != numJugador) {
			if (numAleatorio < numJugador) { /*
												 * Si el número aleatorio es menor que el del jugador, le indicará este
												 * mensaje
												 */
				System.out.println("Menor, elige otro número");
			} else if (numAleatorio > numJugador) { /*
													 * Si el número aleatorio es mayor que el del jugador, le indicará
													 * este otro mensaje
													 */
				System.out.println("Mayor, elige otro número");
			}
			// Leemos un nuevo número
			numJugador = sc.nextInt();
		}
		// Mostramos el resultado si salimos del bucle
		System.out.println("Acertaste");
		// Cerramos el Scanner
		sc.close();
	}

}
