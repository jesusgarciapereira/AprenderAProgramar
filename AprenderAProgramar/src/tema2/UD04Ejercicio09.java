package tema2;

import java.util.Scanner;

public class UD04Ejercicio09 {

	public static void main(String[] args) {
		// Declaramos la variable edad que pediremos al usuario
		int edad;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("¿Eres mayor de edad?");
		// Le pedimos al usuario que escriba la edad
		System.out.println("Introduce tu edad; si eres mayor de edad se lo mostraré, si no, no mostraré nada");
		// Leemos el número
		edad = sc.nextInt();
		/*
		 * Si la edad es mayor o igual que 18, mostrará esta instrucción; si no, no
		 * mostrará nada
		 */
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		// Cerramos el Scanner
		sc.close();
	}

}
