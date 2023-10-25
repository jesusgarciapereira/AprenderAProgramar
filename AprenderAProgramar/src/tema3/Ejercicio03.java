package tema3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos las variables de los números que le pediremos al usuario
		int x, y;
		// Declaramos la variables producto, para el resultado de la multiplicación
		int producto;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Tabla del 'x' hasta el 'y'");
		do {// Le pedimos al usuario un valor para la x y otro para la y
			System.out.println("Introduzca un valor para 'x' (entre -50 y 50) y otro para 'y' (entre 1 y 20)");
			System.out.println("Ambos números separados por un espacio");
			// Leemos el primer número
			x = sc.nextInt();
			// Leemos el segundo número
			y = sc.nextInt();
			// Si el valor de x es 0 se mostrará el siguiente mensaje
			if (x == 0)
				System.out.println("¿Quieres la tabla del " + x + "? muy bueno... xD");
		} while (x == 0 || x < -50 || x > 50 || y < 1
				|| y > 20); /*
							 * Repetiremos las instrucciones del do, si el valor de x es 0 o si alguno de
							 * los números se sale de los límites establecidos
							 */
		// Mostramos la primera parte del resultado
		System.out.println("Tabla del " + x + " hasta el " + y);
		for (int i = 1; i <= y; i++) {
			// Establecemos la relación de las variables
			producto = x * i;
			/*
			 * La segunda parte de un resultado se mostrará todas las veces que se ejecute
			 * el bucle
			 */
			System.out.println(x + " x " + i + " = " + producto);
		}
		// Cerramos el Scanner
		sc.close();

	}

}
