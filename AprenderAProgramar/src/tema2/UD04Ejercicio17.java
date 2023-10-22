package tema2;

import java.util.Scanner;

public class UD04Ejercicio17 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables de las horas, minutos y segundos que le pediremos al
		 * usuario
		 */
		int hora, minuto, segundo;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Hora más 1 segundo");
		do {// Le pedimos al usuario las horas
			System.out.println("Introduzca las horas (de 0 a 23)");
			// Leemos el número
			hora = sc.nextInt();
		} while (!(hora >= 0 && hora <= 23)); /*
												 * Si las horas se salen de los límites, repetiremos las instrucciones
												 * de dentro del do
												 */
		do {// Le pedimos al usuario los minutos
			System.out.println("Introduzca los minutos (de 0 a 59)");
			// Leemos el número
			minuto = sc.nextInt();
		} while (!(minuto >= 0 && minuto <= 59)); /*
													 * Si los minutos se salen de los límites, repetiremos las
													 * instrucciones de dentro del do
													 */
		do {// Le pedimos al usuario los segundos
			System.out.println("Introduzca los segundos (de 0 a 59)");
			// Leemos el número
			segundo = sc.nextInt();
		} while (!(segundo >= 0 && segundo <= 59)); /*
													 * Si los segundos se salen de los límites, repetiremos las
													 * instrucciones de dentro del do
													 */
		// Si los segundos son 59, le asignaremos 0 e incrementaremos en 1 los minutos
		if (segundo == 59) {
			segundo = 0;
			minuto++;
		} else // En caso contrario incrementaremos en 1 los segundos
			segundo++;
		// Si los minutoss son 60, le asignaremos 0 e incrementaremos en 1 las horas
		if (minuto == 60) {
			minuto = 0;
			hora++;
		}
		// Si las horas son 24, le asignaremos 0
		if (hora == 24) {
			hora = 0;
		}
		// Mostramos la primera parte del resultado
		System.out.print("Un segundo después serán = ");
		/*
		 * La segunda parte del resultado se mostrará en función de las siguientes
		 * condiciones
		 */
		if (minuto < 10)
			if (segundo < 10)
				System.out.println(hora + ":0" + minuto + ":0" + segundo);
			else
				System.out.println(hora + ":0" + minuto + ":" + segundo);
		else if (segundo < 10)
			System.out.println(hora + ":" + minuto + ":0" + segundo);
		else
			System.out.println(hora + ":" + minuto + ":" + segundo);
		// Cerramos el Scanner
		sc.close();
	}

}
