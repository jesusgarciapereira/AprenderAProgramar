package tema2;

import java.util.Locale;
import java.util.Scanner;

public class UD04Ejercicio07 {

	public static void main(String[] args) {
		// Declaramos la constante del número de metros por milla
		final int METROS_POR_MILLA = 1852;
		// Declaramos la variable millas que pediremos al usuario
		double millas;
		// Declaramos la variable metros que mostraremos por la consola
		double metros;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario que escriba el número de millas
		System.out.println("Introduzca el número de millas marinas para convertir en metros");
		System.out.println("(si tiene decimales, utilice el punto, como en el ejemplo: 1.1)");
		// Leemos el número
		millas = sc.nextDouble();
		// Establecemos la relación entre las variables
		metros = millas * METROS_POR_MILLA;
		// Mostramos el resultado con sólo un decimal, optaré mejor por usar printf
		System.out.printf("%.1f millas equivalen a %.1f metros", millas, metros);
		// Cerramos el Scanner
		sc.close();

	}

}
