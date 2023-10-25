package tema3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos las variables del número que le pediremos al usuario
		int n;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Números impares del N al 1");
		do {// Le pedimos al usuario un número
			System.out.println("Introduzca un número");
			// Leemos el número
			n = sc.nextInt();
		} while (n < 1);// Si el número es menor que 1, repetiremos las instrucciones de dentro del do
		for (int i = n; i >= 1; i--) {
			// Mostramos un resultado las veces que se cumpla la condición dentro del bucle
			if (i % 2 != 0)
				System.out.println(i);
		}
		// Cerramos el Scanner
		sc.close();

	}

}
