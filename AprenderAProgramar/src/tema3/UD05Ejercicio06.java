package tema3;

import java.util.Scanner;

public class UD05Ejercicio06 {

	public static void main(String[] args) {
		// Declaramos la variable de los números que le pediremos al usuario
		int num;
		// Declaramos las variables de los contadores que mostraremos
		int contPositivos = 0;
		int contNegativos = 0;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("10 números ¿Cuantos positivos y negativos?");
		// Bucle for que se ejecutará desde el 0 hasta el 9 (10 veces)
		for (int i = 0; i < 10; i++) {
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número (llevamos " + i + ")");
			// Leemos el número
			num = sc.nextInt();
			// Si el número es mayor o igual que 0, incrementaremos el contador de positivos
			if (num >= 0)
				contPositivos++;
			// En caso contrario, incrementaremos el contador de negativos
			else
				contNegativos++;
		}
		// Mostramos los resultados
		System.out.println("Número de positivos: " + contPositivos);
		System.out.println("Número de negativos: " + contNegativos);
		// Cerramos el Scanner
		sc.close();
	}

}
