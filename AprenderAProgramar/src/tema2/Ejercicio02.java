package tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables numéricas del día y del mes que preguntaremos para
		 * decir si es Navidad
		 */
		int dia, mes;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("¿Hoy es Navidad?");
		// Le pedimos al usuario el día de hoy
		System.out.println("Introduzca el día de hoy (en número)");
		// Leemos el número
		dia = sc.nextInt();
		// Le pedimos al usuario el mes correspondiente
		System.out.println(
				"Introduzca el mes actual (en su número correspondiente, por ejemplo, 1 para el mes de Enero)");
		// Leemos el número
		mes = sc.nextInt();
		// Si el día es 25 y el mes es 12, nos mostrará que sí es Navidad
		if (dia == 25 && mes == 12)
			System.out.println("SI");
		// En caso contrario nos mostrará que no
		else
			System.out.println("NO");
		// Cerramos el Scanner
		sc.close();

	}
}
