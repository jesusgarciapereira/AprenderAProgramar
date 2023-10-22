package tema2;

import java.util.Scanner;

public class UD04Ejercicio15 {

	public static void main(String[] args) {
		// Declaramos las variables de los tres números que le pediremos al usuario
		int num1, num2, num3;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Mayor de tres");
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextInt();
		// Le pedimos al usuario el tercero número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num3 = sc.nextInt();
		// Si el primero es el mayor de los tres, mostrará el primero
		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " es el número mayor");
		// Si el segundo es el mayor de los tres, mostrará el segundo
		else if (num2 > num1 && num2 > num3)
			System.out.println(num2 + " es el número mayor");
		// En cualquier otro caso, mostrará el tercero
		else
			System.out.println(num3 + " es el número mayor");
		// Cerramos el Scanner
		sc.close();
	}
}
