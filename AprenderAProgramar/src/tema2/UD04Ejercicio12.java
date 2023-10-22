package tema2;

import java.util.Scanner;

public class UD04Ejercicio12 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int numero;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Número positivo");
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número");
		// Leemos el número
		numero = sc.nextInt();
		// Si el número es mayor o igual que 0, mostrará que es positivo
		if (numero >= 0)
			System.out.println(numero + " es POSITIVO");
		// En cualquier otro caso, mostrará que es negativo
		else
			System.out.println(numero + " es NEGATIVO");
		// Cerramos el Scanner
		sc.close();
	}
}
