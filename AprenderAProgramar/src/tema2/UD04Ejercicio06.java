package tema2;

import java.util.Locale;
import java.util.Scanner;

public class UD04Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables de precio original y precio de venta que pediremos
		 * al usuario
		 */
		double precioOriginal, precioVenta;
		// Declaramos la variable descuento que mostraremos por la consola
		double descuento;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Porcentaje descuento");
		// Le pedimos al usuario que escriba el precio original
		System.out.println("Introduzca el precio original del artículo");
		// Leemos el número
		precioOriginal = sc.nextDouble();
		// Le pedimos al usuario que escriba el precio de venta
		System.out.println("Introduzca el precio de venta real");
		// Leemos el número
		precioVenta = sc.nextDouble();
		// Establecemos la relación entre las variables
		descuento = (precioOriginal - precioVenta) / precioOriginal * 100;
		// Mostramos el resultado sin decimales, para ello usamos la conversion de tipos
		System.out.println("El descuento ha sido del " + (int) descuento + "%");
		// Cerramos el Scanner
		sc.close();

	}

}
