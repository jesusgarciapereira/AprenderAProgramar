package tema2;

import java.util.Scanner;

public class UD04Ejercicio08 {

	public static void main(String[] args) {
		// Declaramos la variable edad que pediremos al usuario
		int edad;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("¿Eres mayor de edad?");
		// Le pedimos al usuario que escriba la edad
		System.out.println("Introduce tu edad");
		// Leemos el número
		edad = sc.nextInt();
		// Si la edad es mayor o igual que 18, mostrará que eres mayor de edad
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		// En caso contrario mostrará que eres menor de edad
		else
			System.out.println("Eres menor de edad");
		// Cerramos el Scanner
		sc.close();
	}

}
