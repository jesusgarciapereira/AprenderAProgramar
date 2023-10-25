package tema3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaramos las variables del número que le pediremos al usuario
		int n;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Números pares del 2 al N");
		do {// Le pedimos al usuario un número
			System.out.println("Introduzca un número");
			// Leemos el número
			n = sc.nextInt();
		} while (n < 2);// Si el número es menor que 2, repetiremos las instrucciones de dentro del do
		// Mostramos el resultado las veces que se ejecute el bucle
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i);
		}
		// Cerramos el Scanner
		sc.close();

	}

}
