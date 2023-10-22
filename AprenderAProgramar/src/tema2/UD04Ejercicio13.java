package tema2;

import java.util.Scanner;

public class UD04Ejercicio13 {

	public static void main(String[] args) {
		// Declaramos las variables de los dos números que le pediremos al usuario
		int num1, num2;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Dos números ascendentes");
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextInt();
		// Mostramos el resultado
		System.out.println("En orden ascendente:");
		if (num1 < num2) { // Si el primero es mayor que el segundo, los mostrará en este orden
			System.out.println(num1);
			System.out.println(num2);
		} else { /*
					 * En caso contrario, los mostrará en orden inverso. Incluidos los iguales,
					 * aunque eso no afecta
					 */
			System.out.println(num2);
			System.out.println(num1);
		}
		// Cerramos el Scanner
		sc.close();
	}
}
