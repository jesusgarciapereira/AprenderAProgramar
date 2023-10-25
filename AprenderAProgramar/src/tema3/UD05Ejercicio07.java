package tema3;

import java.util.Scanner;

public class UD05Ejercicio07 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos las variables de los contadores que mostraremos
		int contPositivos = 0;
		int contNegativos = 0;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("N números ¿Cuantos positivos y negativos?");
		do {// Le pedimos al usuario un número
			System.out.println("Introduzca un número (introduzca 0 para terminar)");
			// Leemos el número
			num = sc.nextInt();
			// Si el número es mayor que 0, incrementaremos el contador de positivos
			if (num > 0)
				contPositivos++;
			// Si el número es menor que 0, incrementaremos el contador de negativos
			else if (num < 0)
				contNegativos++;
		} while (num != 0);// Si el número es distinto de 0, repetiremos las instrucciones de dentro del do
		// Mostramos los resultados
		System.out.println("Número de positivos: " + contPositivos);
		System.out.println("Número de negativos: " + contNegativos);
		// Cerramos el Scanner
		sc.close();
	}

}
