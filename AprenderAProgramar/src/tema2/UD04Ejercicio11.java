package tema2;

import java.util.Scanner;

public class UD04Ejercicio11 {

	public static void main(String[] args) {
		// Declaramos las variables de los dos números que le pediremos al usuario
		int num1, num2;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Número mayor");
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextInt();
		// Si el primero es mayor que el segundo, mostrará el primero
		if (num1 > num2)
			System.out.println(num1 + " es el número mayor");
		// Si el primero es menor que el segundo, mostrará el segundo
		else if (num1 < num2)
			System.out.println(num2 + " es el número mayor");
		// En cualquier otro caso, mostrará que son iguales
		else
			System.out.println("Los dos números son iguales");
		// Cerramos el ScannerF
		sc.close();
	}
}
