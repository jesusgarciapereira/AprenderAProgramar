package tema2;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Declaramos las variables con los tres números que nos piden
		int num1, num2, num3;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("¿Algún número mayor que 10?");
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextInt();
		// Le pedimos al usuario el tercer número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num3 = sc.nextInt();
		// Si, al menos, uno de los números es mayor que 10 mostrará este mensaje
		if (num1 > 10 || num2 > 10 || num3 > 10)
			System.out.println("ALGUNO MAYOR QUE 10"); 
		// En caso contrario mostrará que ninguno es mayor que 10
		else
			System.out.println("NINGUNO MAYOR QUE 10"); 
		// Cerramos el Scanner
		sc.close();
	}
}
